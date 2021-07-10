/*
 * MegaMek - Copyright (C) 2004 Ben Mazur (bmazur@sev.org)
 * Copyright © 2013 Edward Cullen (eddy@obsessedcomputers.co.uk)
 * MegaMek - Copyright (C) 2020-2021 - The MegaMek Team
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package megamek.client.ui.trees;

import java.util.Iterator;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import megamek.client.ui.swing.tileset.MMStaticDirectoryManager;
import megamek.common.icons.AbstractIcon;
import megamek.common.icons.Camouflage;
import megamek.common.util.StringUtil;
import megamek.common.util.fileUtils.AbstractDirectory;

public class CamoChooserTree extends AbstractIconChooserTree {
    //region Constructors
    public CamoChooserTree() {
        super();
    }
    //endregion Constructors

    //region Initialization
    @Override
    protected DefaultTreeModel createTreeModel() {
        final DefaultMutableTreeNode root = new DefaultMutableTreeNode(AbstractIcon.ROOT_CATEGORY);
        final AbstractDirectory directory = MMStaticDirectoryManager.getCamouflage();
        if (directory != null) {
            root.add(new DefaultMutableTreeNode(Camouflage.COLOUR_CAMOUFLAGE));
            final Iterator<String> categoryNames = directory.getCategoryNames();
            while (categoryNames.hasNext()) {
                final String categoryName = categoryNames.next();
                if (!StringUtil.isNullOrEmpty(categoryName)) {
                    addCategoryToTree(root, categoryName.split("/"));
                }
            }
        }
        return new DefaultTreeModel(root);
    }
    //endregion Initialization
}
