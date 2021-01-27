package net.skytales.api.user;

import net.skytales.api.ranks.Rank;

import java.util.List;
import java.util.UUID;

public interface User {

    public UUID getUUID();

    public String getName();

    public long getFirstJoin();

    public Rank getRank();

    public String getDiscordTag();

    public UserData getData();

}
