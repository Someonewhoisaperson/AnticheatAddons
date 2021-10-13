package net.zejzz.dev.anticheataddons;

import me.liwk.karhu.api.data.Category;
import me.liwk.karhu.api.data.CheckData;
import me.liwk.karhu.api.data.SubCategory;
import me.liwk.karhu.api.event.KarhuEvent;
import me.liwk.karhu.api.event.KarhuListener;
import me.liwk.karhu.api.event.impl.KarhuPreCheckEvent;
import org.geysermc.floodgate.api.FloodgateApi;
import org.bukkit.entity.Player;

public class BedrockSupport implements KarhuListener {

    @Override
    public void onEvent(KarhuEvent event) {

        if(event instanceof KarhuPreCheckEvent) {
            final CheckData check = ((KarhuPreCheckEvent) event).getCheck();
            final Player player = ((KarhuPreCheckEvent) event).getPlayer();
            final boolean isBedrockPlayer = FloodgateApi.getInstance().isFloodgatePlayer(player.getUniqueId());

            if (isBedrockPlayer) {
                if (!(check.getSubCategory().equals(SubCategory.REACH) || check.getSubCategory().equals(SubCategory.AIM))) {
                    event.cancel();
                }
            }
        }
    }
}

