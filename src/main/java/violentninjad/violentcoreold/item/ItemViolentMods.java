package violentninjad.violentcoreold.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import violentninjad.violentcoreold.ViolentCoreOld;
import violentninjad.violentcoreold.reference.TextureRefs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemViolentMods extends Item {
	
	private static final int SHIFTED_ID_RANGE_CORRECTION = 256;

	public ItemViolentMods(int id) {
		super(id - SHIFTED_ID_RANGE_CORRECTION);
		this.setCreativeTab(ViolentCoreOld.tabsViolentMod);
		maxStackSize = 64;
		setNoRepair();
	}
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", TextureRefs.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", TextureRefs.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
