package com.thanhpt0105.builder;

public class ClassAttribute {
    private String name;
    private String type;

    public ClassAttribute(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("public ").append(this.type).append(" ").append(this.name).toString();
    }
}
