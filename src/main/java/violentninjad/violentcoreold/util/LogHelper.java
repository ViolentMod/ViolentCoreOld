package violentninjad.violentcoreold.util;

import java.util.logging.*;

import cpw.mods.fml.common.FMLLog;
import violentninjad.violentcoreold.reference.ModInfo;

public class LogHelper {
	
	private static Logger ViolentCoreLogger = Logger.getLogger(ModInfo.MOD_ID);
	
	public static void init()
    {
        ViolentCoreLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, Object object)
    {
        ViolentCoreLogger.log(logLevel, String.valueOf(object));
    }

    public static void severe(Object object)
    {
        log(Level.SEVERE, object);
    }

    public static void debug(Object object)
    {
        log(Level.INFO, String.format("[DEBUG] %s", String.valueOf(object)));
    }

    public static void warning(Object object)
    {
        log(Level.WARNING, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void config(Object object)
    {
        log(Level.CONFIG, object);
    }

    public static void fine(Object object)
    {
        log(Level.FINE, object);
    }

    public static void finer(Object object)
    {
        log(Level.FINER, object);
    }

    public static void finest(Object object)
    {
        log(Level.FINEST, object);
    }

}
