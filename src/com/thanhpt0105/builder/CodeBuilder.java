package com.thanhpt0105.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeBuilder {

    private String className;
    List<ClassAttribute> attributes = new ArrayList<>();
    private final String INDENT = "     ";

    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        ClassAttribute attribute = new ClassAttribute(name, type);
        this.attributes.add(attribute);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(this.className).append(" {\n");
        for (ClassAttribute attribute: attributes) {
            sb.append(INDENT).append("public ").append(attribute.getType()).append(" ").append(attribute.getName()).append(";\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
