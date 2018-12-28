package kd.equilinox.example;

import kd.equilinox.events.inits.InitializationEvent;
import kd.equilinox.events.inits.PostInitializationEvent;
import kd.equilinox.events.inits.PreInitializationEvent;
import kd.equilinox.events.sessions.PostLoadSessionEvent;
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

	public void preInit(PreInitializationEvent event) {
		Logger.info("Hello from Example Mod !!! PreInit.");
	}

	public void init(InitializationEvent event) {
		Logger.info("Hello from Example Mod !!! Init.");
	}

	public void postInit(PostInitializationEvent event) {
		Logger.info("Hello from Example Mod !!! PostInit.");
	}

	public void postLoadSession(PostLoadSessionEvent event) {
		Logger.info("Hello from Example Mod !!! PostLoadSession.");
	}
}
