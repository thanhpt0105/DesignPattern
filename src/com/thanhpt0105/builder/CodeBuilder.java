package com.thanhpt0105.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeBuilder {

    private Class theClass;

    public CodeBuilder(String className) {
        this.theClass = new Class(className);
    }

    public CodeBuilder addField(String name, String type) {
        ClassAttribute attribute = new ClassAttribute(name, type);
        this.theClass.getAttributes().add(attribute);
        return this;
    }

    @Override
    public String toString()
    {
        return theClass.toString();
    }
}
