package net.raylightstudios.carved.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.raylightstudios.carved.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab CARVED = new CreativeModeTab("carvedModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CUT_COAL.get());
        }
    };
}
