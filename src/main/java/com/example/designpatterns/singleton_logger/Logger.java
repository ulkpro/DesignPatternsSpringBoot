package com.example.designpatterns.singleton_logger;

public enum Logger {
    INSTANCE;

    private LoggerConfig config;

    // init must be called once during app start
    public void init(LoggerConfig config) {
        this.config = config;
    }

    public void log(LogLevel level, String message) {
        if (config == null) {
            throw new IllegalStateException("Logger not initialized!");
        }

        if (level.ordinal() >= config.getLevel().ordinal()) {
            String formatted = "[" + level.name() + "] " + message;
            System.out.println(formatted);
        }
    }
}