package violentninjad.violentcoreold;

import violentninjad.violentcoreold.proxy.IProxy;
import violentninjad.violentcoreold.reference.ModInfo;
import violentninjad.violentcoreold.reference.ProxyRef;
import violentninjad.violentcoreold.util.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid=ModInfo.MOD_ID, name=ModInfo.MOD_NAME, version=ModInfo.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ViolentCoreOld {
	
	 @Instance(ModInfo.MOD_ID)
	 public static ViolentCoreOld instance;
	 
	 @SidedProxy(clientSide = ProxyRef.CLIENT_PROXY, serverSide = ProxyRef.SERVER_PROXY)
	 public static IProxy proxy;

	 
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event) {
		 LogHelper.init();
	 }
	 
	 @EventHandler
	 public void init(FMLInitializationEvent event) {
		 
	 }
	 
	 @EventHandler
	 public void postInit(FMLPostInitializationEvent event) {
		 
	 }


}
