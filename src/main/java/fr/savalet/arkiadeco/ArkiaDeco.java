package fr.savalet.arkiadeco;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ArkiaDeco.MODID)
public class ArkiaDeco {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "arkiadeco";

    public ArkiaDeco() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ArkiaDeco.LOGGER.info("Items registered !");
        ModBlocks.BLOCKS.register(bus);
        ArkiaDeco.LOGGER.info("Blocks registered !");
    }

    private void setup(FMLCommonSetupEvent e) {

    }
    private void clientSetup(FMLClientSetupEvent event) {
        ArkiaDeco.LOGGER.info("*-*-*-*-*-*Arkia Core*-*-*-*-*-*");
        ArkiaDeco.LOGGER.info("*    Mod Loaded Client Side !  *");
        ArkiaDeco.LOGGER.info("*-*-*-*-*-*By Savalet*-*-*-*-*-*");
    }
    private void serverSetup(FMLDedicatedServerSetupEvent e) {
        ArkiaDeco.LOGGER.info("*-*-*-*-*-*Arkia Core*-*-*-*-*-*");
        ArkiaDeco.LOGGER.info("*ArkiaCore is only client side !*");
        ArkiaDeco.LOGGER.info("*-*-*-*-*-*By Savalet*-*-*-*-*-*");
    }
}