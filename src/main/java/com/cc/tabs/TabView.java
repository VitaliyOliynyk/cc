package com.cc.tabs;

import com.cc.controller.SimpleViewController;

public class TabView {

    private String name, url;
    private SimpleViewController controller;

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

    public SimpleViewController getController() {
        return controller;
    }

    public void setController(SimpleViewController controller) {
        this.controller = controller;
    }
}
