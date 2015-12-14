package com.example.examplemod;

import net.minecraft.item.ItemFood;

/**
 * Created by naoki on 2015/12/14.
 */
public class ModItemFood{

    public static class Tinsuko extends ItemFood{
        public Tinsuko(int par1, float par2, boolean par3){
            super(par1, par2, par3);
            this.setUnlocalizedName("localizedname_tinsuko");
            this.setTextureName("samplemod:chinko");
            this.setMaxStackSize(64);

            this.setAlwaysEdible();
        }
    }


}
