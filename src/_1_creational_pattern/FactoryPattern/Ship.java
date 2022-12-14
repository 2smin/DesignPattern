package _1_creational_pattern.FactoryPattern;

import _1_creational_pattern.AbstractFactoryPattern.Anchor;
import _1_creational_pattern.AbstractFactoryPattern.Wheel;

public abstract class Ship {

    private String name;
    private String color;

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    private int size;

    private Anchor anchor;

    private Wheel wheel;

    public Anchor getAnchor() {
        return anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
