package violentninjad.violentcoreold.item;

import cpw.mods.fml.common.registry.GameRegistry;
import violentninjad.violentcoreold.reference.ItemIds;
import violentninjad.violentcoreold.reference.ItemNames;

public class ModItems {
	
	public static ItemViolentMods tabPicture;
	
	public static void init() {
		//Item Initialisation
		tabPicture = new ItemTabPicture(ItemIds.TAB_PICTURE);
		
		//Registering Items
		GameRegistry.registerItem(tabPicture, "items." + ItemNames.TAB_PICTURE_NAME);
	}

}
