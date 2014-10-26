package com.cc.tabs;

import java.util.List;

public class TabGroup {
    private String name, url;
    private List<TabView> tabs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<TabView> getTabs() {
        return tabs;
    }

    public void setTabs(List<TabView> tabs) {
        this.tabs = tabs;
    }
}
