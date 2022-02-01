package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();
    private Map<String, String> expect = new LinkedHashMap<>();

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
    void shouldContainsKeyIfExistWithUpperCase() {
        assertTrue(manager.containsKey(".TXT"));
    }

    @Test
    void shouldContainsValueIfExist() {
        assertTrue(manager.containsValue("Chrome"));
    }

    @Test
    void shouldGetAllKeyWithSort() {
        List expected = new ArrayList(List.of(".bmp", ".docx", ".html", ".jpg", ".txt"));
        List actual = manager.getAllKey();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllValuesWithSort() {
        List expected = new ArrayList(List.of("ACDSee", "Chrome", "MS Word", "Notepad++", "Paint"));
        List actual = manager.getAllValue();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveByKeyIfExistWithUpperCase() {
        manager.removeByKey(".JPG");

        expect.put(".html", "Chrome");
        expect.put(".bmp", "Paint");
        expect.put(".docx", "MS Word");
        expect.put(".txt", "Notepad++");

        Set<Map.Entry<String, String>> expected = expect.entrySet();
        Set<Map.Entry<String, String>> actual = manager.getAll();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveByKeyIfNotExist() {
        manager.removeByKey(".gif");

        expect.put(".html", "Chrome");
        expect.put(".jpg", "ACDSee");
        expect.put(".bmp", "Paint");
        expect.put(".docx", "MS Word");
        expect.put(".txt", "Notepad++");

        Set<Map.Entry<String, String>> expected = expect.entrySet();
        Set<Map.Entry<String, String>> actual = manager.getAll();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetValueByKeyIfExistWithUpperCase() {
        String actual = manager.getValueByKey(".DOCX");

        assertEquals("MS Word", actual);
    }

    @Test
    void shouldGetValueByKeyIfNotExist() {
        String actual = manager.getValueByKey(".gif");

        assertEquals(null, actual);
    }
}