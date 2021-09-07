package com.jared.design;

/**
 * @author cjl
 * @time 2021/9/7 12:22
 */
public class ConfigMemento {
    private ConfigFile configFile;

    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
