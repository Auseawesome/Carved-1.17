package net.raylightstudios.carved.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.raylightstudios.carved.Carved;
import net.raylightstudios.carved.item.ModCreativeModeTab;
import net.raylightstudios.carved.item.ModItems;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Carved.MOD_ID);

    public static final RegistryObject<Block> COAL_COLUMN = registerBlock("coal_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> COAL_PILLAR = registerBlock("coal_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_COAL = registerBlock("cut_coal", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_DIAMOND = registerBlock("cut_diamond", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_EMERALD = registerBlock("cut_emerald", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_GOLD = registerBlock("cut_gold", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_IRON = registerBlock("cut_iron", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_NETHERITE = registerBlock("cut_netherite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> CUT_REDSTONE = registerBlock("cut_redstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> DIAMOND_COLUMN = registerBlock("diamond_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> DIAMOND_PILLAR = registerBlock("diamond_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> EMERALD_COLUMN = registerBlock("emerald_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> EMERALD_PILLAR = registerBlock("emerald_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> GOLD_COLUMN = registerBlock("gold_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> GOLD_PILLAR = registerBlock("gold_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> IRON_COLUMN = registerBlock("iron_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> IRON_PILLAR = registerBlock("iron_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> NETHERITE_COLUMN = registerBlock("netherite_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> NETHERITE_PILLAR = registerBlock("netherite_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> REDSTONE_COLUMN = registerBlock("redstone_column", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));

    public static final RegistryObject<Block> REDSTONE_PILLAR = registerBlock("redstone_pillar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                 new Item.Properties().tab(ModCreativeModeTab.CARVED)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
