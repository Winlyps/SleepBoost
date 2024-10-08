package winlyps.sleepBoost

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerBedEnterEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class SleepBoostListener(private val plugin: SleepBoost) : Listener {

    @EventHandler
    fun onPlayerBedEnter(event: PlayerBedEnterEvent) {
        val player: Player = event.player

        // Check if the player successfully entered the bed
        if (event.bedEnterResult == PlayerBedEnterEvent.BedEnterResult.OK) {
            // Apply levitation effect for 5 seconds (100 ticks)
            player.addPotionEffect(PotionEffect(PotionEffectType.LEVITATION, 100, 1))
        }
    }
}