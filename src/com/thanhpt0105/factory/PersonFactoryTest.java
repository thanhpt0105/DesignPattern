package com.thanhpt0105.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    @Test
    void createPerson() {
        PersonFactory factory = new PersonFactory();
        Person p1 = factory.createPerson("James");
        Person p2 = factory.createPerson("Tom");
        assertEquals(0, p1.getId());
        assertEquals(1, p2.getId());
        assertEquals("James", p1.getName());
        assertEquals("Tom", p2.getName());
    }
}