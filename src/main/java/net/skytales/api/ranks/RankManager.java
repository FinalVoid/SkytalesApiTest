package net.skytales.api.ranks;

import net.skytales.api.user.User;

import java.util.List;
import java.util.function.Consumer;

public interface RankManager {

    public Rank getRank(User user, Consumer<Rank> callback);

    public void setRank(User user, RankType rank);

    public void setUserRankLabel(User user, String label);

    public boolean hasRank(User user, RankType rank);

}
