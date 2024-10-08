package winlyps.sleepBoost

import org.bukkit.plugin.java.JavaPlugin

class SleepBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(SleepBoostListener(this), this)
        logger.info("SleepBoost plugin enabled.")
    }

    override fun onDisable() {
        logger.info("SleepBoost plugin disabled.")
    }
}