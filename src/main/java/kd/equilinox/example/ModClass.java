package kd.equilinox.example;

import kd.equilinox.modloader.IModLoader;
import kd.equilinox.mods.IMod;
import kd.equilinox.utils.Logger;

/**
 * Example mod core class.
 * 
 * @author Krzysztof Dobrzynski - k.dobrzynski94@gmail.com
 */
public class ModClass implements IMod {
	public String getModName() {
		return "Example Mod";
	}

	public void preInit(IModLoader modLoader) {
		Logger.info("Hello from Example Mod !!!");
	}

	public void init(IModLoader modLoader) {
	}

	public void postInit(IModLoader modLoader) {
	}
}
