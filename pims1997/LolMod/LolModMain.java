package pims1997.LolMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = LolModMain.modid, name = "Craft of Legends", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class LolModMain
{

	public static final String modid = "Pims1997_CraftOfLegends";
	
	
	@Init
	public void load(FMLInitializationEvent event)
	{
	        
	}
}
