package net.skytales.api;


import net.skytales.api.ranks.RankManager;
import net.skytales.api.user.User;
import net.skytales.api.user.UserManager;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public interface SkytalesAPI {

    public RankManager getRankManager();

    public UserManager getUserManager();

    public User getEntryUser(UUID uuid, String name);

    public User getEntryUser(Player player);

    public User getUser(UUID uuid);

    public User getUser(Player player);

    public User getUser(String name);

    public Map<String, Integer> getAverageApiResponseTime();

    //public void insertUser(UUID uuid, String name, long firstJoin);

}
