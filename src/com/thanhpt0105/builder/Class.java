package com.thanhpt0105.builder;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    List<ClassAttribute> attributes = new ArrayList<>();
    private final String INDENT = "     ";

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ClassAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        String ls = System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(this.name).append(" {").append(ls);
        for (ClassAttribute attribute: attributes) {
            sb.append(INDENT).append(attribute).append(";").append(ls);
        }
        sb.append("}");
        return sb.toString();
    }
}
