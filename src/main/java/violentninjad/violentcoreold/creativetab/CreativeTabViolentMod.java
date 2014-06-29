package violentninjad.violentcoreold.creativetab;

import violentninjad.violentcoreold.item.ModItems;
import violentninjad.violentcoreold.reference.ItemIds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class CreativeTabViolentMod extends CreativeTabs {
	
	public CreativeTabViolentMod(int tabID)
    {
        super(tabID, violentninjad.violentcoreold.reference.ModInfo.MOD_ID);
    }
	
	public static final ItemStack LimeDye = new ItemStack(Item.dyePowder, 1, 10);

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {

        return ItemIds.TAB_PICTURE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return "Violent Mod";
    }

}
