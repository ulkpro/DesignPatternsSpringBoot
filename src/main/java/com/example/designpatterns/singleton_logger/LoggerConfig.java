package com.example.designpatterns.singleton_logger;

public class LoggerConfig {
    private final LogLevel level;

    public LoggerConfig(LogLevel level) {
        this.level = level;
    }

    public LogLevel getLevel() {
        return level;
    }

}
