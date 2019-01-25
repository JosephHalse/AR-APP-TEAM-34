package com.epson.arp.bt.samples.arviewer;

import android.app.Application;

public class Global extends Application {

    private String name = "model";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
