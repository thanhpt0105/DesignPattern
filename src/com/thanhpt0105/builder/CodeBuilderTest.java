package com.thanhpt0105.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeBuilderTest {

    @Test
    void testToString() {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        String ls = System.lineSeparator();
        String INDENT = "     ";
        String expectedOutput = "public class Person {" + ls +
                INDENT + "public String name;" + ls +
                INDENT + "public int age;" + ls +
                "}";
        assertEquals(expectedOutput, cb.toString());
    }

    @Test
    void testEmptyClass() {
        CodeBuilder cb = new CodeBuilder("Person");
        String ls = System.lineSeparator();
        String expectedOutput = "public class Person {" + ls +
                "}";
        assertEquals(expectedOutput, cb.toString());
    }
}