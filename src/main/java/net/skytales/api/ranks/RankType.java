package net.skytales.api.ranks;

public enum RankType {

    DEFAULT("DEFAULT", "§7", 10, false, false),
    VIP("VIP", "§d[VIP] ", 20, false, false),
    YOUTUBE("YOUTUBE", "§6[YOUTUBE] ", 40, false, false),
    HELPER("HELPER", "§3[HELPER] ", 50, true, false),
    MODERATOR("MODERATOR", "§9[MODERATOR] ", 60, true, false),
    ADMIN("ADMIN", "§c[ADMIN] ",100, true, true);

    private String name;
    private String label;
    private int power;
    private boolean isStaff;
    private boolean isAdmin;

    RankType(String name, String label, int power, boolean isStaff, boolean isAdmin) {
        this.name = name;
        this.label = label;
        this.power = power;
        this.isStaff = isStaff;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getLabel() { return label; }

    public int getPower() {
        return power;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
