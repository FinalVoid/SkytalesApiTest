package net.skytales.api.user;

import java.util.List;
import java.util.function.Consumer;


public interface UserData {

    public UserSettings getSettings();
    public UserStats getStats();
    public long getSessionJoin();
    public long getLastJoin();
    public void getFriends(Consumer<List<User>> callback);

}
