package ru.netology.manager;

import java.util.*;


public class FileOpenManager {

    private Map<String, String> manager = new LinkedHashMap<>();

    //Добавление связки расширение-приложение
    public void add(String key, String value) {
        String result = key.toLowerCase();
        manager.put(result, value);
    }

    //Получать название приложения, предназначенного для открытия файла с определённым расширением
    public String getValueByKey(String key) {
        String result = key.toLowerCase();
        return manager.get(result);
    }

    //Удаление связки по ключу
    public void removeByKey(String key) {
        String result = key.toLowerCase();
        manager.remove(result);
    }

    //Получение словаря
    public Set<Map.Entry<String, String>> getAll() {
        return manager.entrySet();
    }

    //Получить список всех зарегистрированных расширений(сортировка)
    public List getAllKey() {
        Set keys = manager.keySet();
        List sortedList = new ArrayList(keys);
        Collections.sort(sortedList);
        return sortedList;
    }

    //Получить список всех приложений, которые привязаны к каким-либо расширениям(сортировка)
    public List<String> getAllValue() {
        List<String> values = new ArrayList<>(manager.values());
        Collections.sort(values);
        return values;
    }

    public boolean containsKey(String key) {
        String result = key.toLowerCase();
        return manager.containsKey(result);
    }

    public boolean containsValue(String value) {
        return manager.containsValue(value);
    }

    public void clearAll() {
        manager.clear();
    }

    public int getSize() {
        return manager.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileOpenManager that = (FileOpenManager) o;
        return Objects.equals(manager, that.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manager);
    }

    @Override
    public String toString() {
        return "FileOpenManager{" +
                "manager=" + manager +
                '}';
    }
}










