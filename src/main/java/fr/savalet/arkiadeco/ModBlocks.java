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

    public static final RegistryObject<Block> BLUE_WOOD = createBlock("blue_wood", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return  block;
    }
}
