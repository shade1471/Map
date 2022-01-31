package ru.netology.manager;

import java.util.HashMap;


public class FileOpenManager {

    private HashMap<String, String> manager = new HashMap<>();

    public void add(String key, String value  ){
        manager.put(key, value);
    }

    public boolean containsKey(String key){
        return manager.containsKey(key);
    }

    public boolean containsValue(String value){
        return manager.containsValue(value);
    }













}
