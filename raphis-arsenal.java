
package de.ralfis.arsenal;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(ArsenalMod.MOD_ID)
public class ArsenalMod {

    public static final String MOD_ID = "arsenal";

    public ArsenalMod() {
        IEventBus modEventBus =
            FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(
            ModCreativeTabs::addCreative
        );
    }
}
