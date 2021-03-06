package com.marlan.weatheroutput.utilities;

import static java.lang.System.getProperty;

public class DirHandler {
    private DirHandler() {
    }

    public static String getWorkingDir(String[] args) {
        if (args.length != 0) {
            System.setProperty("user.dir", args[0]);
        }
        return getProperty("user.dir") + "\\";
    }

}
