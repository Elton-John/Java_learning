package java_21_designePattern.singleton;

public class AppConfig {
    private static AppConfig INSTANCE;

    private AppConfig() {
    }

    private static synchronized AppConfig getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new AppConfig();
        }
        return INSTANCE;
    }
}
