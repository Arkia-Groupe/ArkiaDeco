package fr.savalet.arkiadeco;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArkiaDeco.MODID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEST_STICK = ITEMS.register("test_stick", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));

}
