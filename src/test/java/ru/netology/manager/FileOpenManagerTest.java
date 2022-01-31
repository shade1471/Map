package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
}