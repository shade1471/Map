package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();
    private LinkedHashMap<String, String> expected = new LinkedHashMap<>();

    @BeforeEach
    void initEach() {
        manager.add(".html", "Chrome");
        manager.add(".jpg", "ACDSee");
        manager.add(".bmp", "Paint");
        manager.add(".docx", "MS Word");
        manager.add(".txt", "Notepad++");

    }

    @Test
    void shouldAddIfKeyExist() {
        manager.add(".JPG", "ACDSee");

        int actual = manager.getSize();

        assertEquals(5, actual);
    }

    @Test
    void shouldAddIf() {
        manager.add(".JPG", "ACDSee");


        expected.put(".jpg", "ACDSee");
        expected.put(".bmp", "Paint");
        expected.put(".docx", "MS Word");
        expected.put(".txt", "Notepad++");

        Set<Map.Entry<String, String>> actual = manager.getAll();

        assertEquals(expected, actual);

    }

    @Test
    void shouldContainsKeyIfExist() {
        assertTrue(manager.containsKey(".JPG"));
    }

    @Test
    void shouldContainsValueIfExist() {
        assertTrue(manager.containsValue("Chrome"));
    }

    @Test
    void shouldGetAllKey() {
        Set actual = manager.getAllKey();
    }

    @Test
    void shouldGetAllValues() {

       ArrayList actual = manager.getAllValue();

    }

    @Test
    void shouldRemoveByKey() {
        manager.removeByKey(".jpg");
        Set<Map.Entry<String, String>> result = manager.getAll();
    }

    @Test
    void shouldGetAllMap() {
        Set<Map.Entry<String, String>> result = manager.getAll();
    }

    @Test
    void shouldGetValueByKey() {
        String result = manager.getValueByKey(".jpg");
    }


}