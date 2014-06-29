package violentninjad.violentcoreold;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import violentninjad.violentcoreold.creativetab.CreativeTabViolentMod;
import violentninjad.violentcoreold.item.ModItems;
import violentninjad.violentcoreold.proxy.IProxy;
import violentninjad.violentcoreold.reference.ItemIds;
import violentninjad.violentcoreold.reference.ItemNames;
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
	 
	 public static CreativeTabs tabsViolentMod = new CreativeTabViolentMod(CreativeTabs.getNextID());


	 
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event) {
		 
		 LogHelper.init();
		 
		 Configuration config = new Configuration(event.getSuggestedConfigurationFile());

		 config.load();

		 ItemIds.TAB_PICTURE = config.getItem(ItemNames.TAB_PICTURE_NAME, 3301).getInt();
		 	
		 config.save();
		 
		 ModItems.init();
		 
	 }
	 
	 @EventHandler
	 public void init(FMLInitializationEvent event) {
		 
	 }
	 
	 @EventHandler
	 public void postInit(FMLPostInitializationEvent event) {
		 
	 }
	 
	 


}
