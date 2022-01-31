package ru.netology.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class FileOpenManager {

    private HashMap<String, String> manager = new HashMap<>();

    public void add(String key, String value) {
        manager.put(key, value);
    }

    public boolean containsKey(String key) {
        return manager.containsKey(key);
    }

    public boolean containsValue(String value) {
        return manager.containsValue(value);
    }

    public Set<String> getAllKey() {
        Set<String> keys = manager.keySet();
        return keys;
    }

    public ArrayList<String> getAllValue() {
        ArrayList<String> values = new ArrayList<>(manager.values());
        return values;
    }
}










