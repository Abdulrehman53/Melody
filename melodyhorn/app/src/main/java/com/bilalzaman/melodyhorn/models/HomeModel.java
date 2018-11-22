package com.bilalzaman.melodyhorn.models;

/**
 * Created by BilalZaman on 19/11/2018.
 */
public class HomeModel {

    private String Icon, melodyName;

    public HomeModel(String icon, String melodyName) {
        Icon = icon;
        this.melodyName = melodyName;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getMelodyName() {
        return melodyName;
    }

    public void setMelodyName(String melodyName) {
        this.melodyName = melodyName;
    }
}
