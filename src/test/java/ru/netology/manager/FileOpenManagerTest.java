package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    void initEach() {
        manager.add(".jpg", "ACDSee");
        manager.add(".html", "Chrome");
        manager.add(".bmp", "Paint");
        manager.add(".docx", "MS Word");

    }

    @Test
    void add() {

    }

    @Test
    void shouldContainsKeyIfExist() {
        assertTrue(manager.containsKey(".jpg"));
    }

    @Test
    void shouldContainsValueIfExist() {
        assertTrue(manager.containsValue("Chrome"));
    }

    @Test
    void shouldGetAllKey(){
        Set actual = manager.getAllKey();
    }

    @Test
    void shouldGetAllValues(){
        ArrayList actual = manager.getAllValue();
    }
}