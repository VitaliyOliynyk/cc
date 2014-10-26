package com.cc.tabs;

import com.cc.controller.SimpleViewController;

public class SimpleView {
    private String name;
    private SimpleViewController controller;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleViewController getController() {
        return controller;
    }

    public void setController(SimpleViewController controller) {
        this.controller = controller;
    }
}
