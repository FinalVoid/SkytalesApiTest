package net.skytales.api;

public final class SkytalesAPIProvider {

    private SkytalesAPIProvider() {
    }

    private static SkytalesAPI apiInstance = null;

    public static final SkytalesAPI getApi() {
        return apiInstance;
    }

    public static final void registerInstance(SkytalesAPI instance) {
        apiInstance = instance;
    }

}
