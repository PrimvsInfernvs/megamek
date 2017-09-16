/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons.battlearmor;

import megamek.common.AmmoType;
import megamek.common.WeaponType;
import megamek.common.weapons.Weapon;

/**
 * @author Sebastian Brocks
 */
public class CLBAMortarLight extends Weapon {
    /**
     *
     */
    private static final long serialVersionUID = -141763207003813118L;

    /**
     *
     */
    public CLBAMortarLight() {
        super();
        name = "Mortar (Light)";
        setInternalName("CLBALightMortar");
        addLookupName("CL BA Light Mortar");
        addLookupName("ISBALightMortar");
        addLookupName("IS BA Light Mortar");
        damage = 3;
        infDamageClass = WeaponType.WEAPON_BURST_1D6;
        ammoType = AmmoType.T_NA;
        minimumRange = 1;
        shortRange = 1;
        mediumRange = 2;
        longRange = 3;
        extremeRange = 4;
        bv = 9;
        tonnage = 0.3;
        cost = 2100;
        criticals = 2;
        flags = flags.or(F_BALLISTIC).or(F_BURST_FIRE).or(F_BA_WEAPON)
                .andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);;
        rulesRefs = "263,TM";
        techAdvancement.setTechBase(TECH_BASE_ALL)
    	.setIntroLevel(false)
    	.setUnofficial(false)
        .setTechRating(RATING_B)
        .setAvailability(RATING_X, RATING_X, RATING_C, RATING_C)
        .setISAdvancement(3054, 3057, 3063, DATE_NONE, DATE_NONE)
        .setISApproximate(true, false, false,false, false)
        .setClanAdvancement(DATE_NONE, DATE_NONE, 3065, DATE_NONE, DATE_NONE)
        .setClanApproximate(false, false, true, false, false)
        .setPrototypeFactions(F_FS,F_LC)	
        .setProductionFactions(F_LC);
    }

}

/* added per IO Pg 53 - Tech Manual shows this is an IS weapon only
*Put IO seems to have made this a Clan weapon as well.abstract
*/
