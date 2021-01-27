package net.skytales.api.ranks;

public interface Rank {

    public String getName();
    public String getLabel();
    public int getPower();
    public boolean isStaff();
    public boolean isAdmin();
    public long getTimeOfSet();


}

