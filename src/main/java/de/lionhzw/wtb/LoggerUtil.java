package de.lionhzw.wtb;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtil {
    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

    public static void configureDefaultLogger() {
        LOGGER.setUseParentHandlers(false);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        LOGGER.addHandler(consoleHandler);
        LOGGER.setLevel(Level.ALL);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
