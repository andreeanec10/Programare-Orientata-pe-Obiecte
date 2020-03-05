package com.ex4;

import java.util.EnumSet;

public enum LogLevel {//extends EnumSet {
    Info, Debug, Warning, Error, FunctionalMessage, FunctionalError;
    public static EnumSet<LogLevel> all() {
       return EnumSet.allOf(LogLevel.class);
    }
};
