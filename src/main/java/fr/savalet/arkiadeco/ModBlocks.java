package fr.savalet.arkiadeco;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArkiaDeco.MODID);

    public static final RegistryObject<Block> BLUE_PLANKS = createBlock("blue_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3f, 15f).harvestTool(ToolType.AXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> RED_PLANKS = createBlock("red_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3f, 15f).harvestTool(ToolType.AXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> PINK_PLANKS = createBlock("pink_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3f, 15f).harvestTool(ToolType.AXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> PURPLE_PLANKS = createBlock("purple_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3f, 15f).harvestTool(ToolType.AXE).harvestLevel(0).setRequiresTool()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return  block;
    }
}
