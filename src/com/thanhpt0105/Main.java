package com.thanhpt0105;

import com.thanhpt0105.builder.CodeBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        String expectedOutput = "public class Person {\n" +
                "     public String name;\n" +
                "     public int age;\n" +
                "}";

    }
}
