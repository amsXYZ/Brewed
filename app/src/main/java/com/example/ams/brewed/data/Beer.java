package com.example.ams.brewed.data;

import android.media.Image;

/**
 * Created by al264101 on 21/05/15.
 */
public class Beer {
    private final String name;
    private final Double alcoholByVolume;
    private final int srmColor;
    private final String style;
    private final String availability;
    private final String description;
    private final Image label_icon;
    private final Image label_medium;

    public Beer(String name, Double alcoholByVolume, int srmColor, String style, String availability, String description, Image label_icon, Image label_medium) {
        this.name = name;
        this.alcoholByVolume = alcoholByVolume;
        this.srmColor = srmColor;
        this.style = style;
        this.availability = availability;
        this.description = description;
        this.label_icon = label_icon;
        this.label_medium = label_medium;
    }

    public String getName() {
        return name;
    }

    public Double getAlcoholByVolume() {
        return alcoholByVolume;
    }

    public int getSrmColor() {
        return srmColor;
    }

    public String getStyle() {
        return style;
    }

    public String getAvailability() {
        return availability;
    }

    public String getDescription() {
        return description;
    }

    public Image getLabel_icon() {
        return label_icon;
    }

    public Image getLabel_medium() {
        return label_medium;
    }
}