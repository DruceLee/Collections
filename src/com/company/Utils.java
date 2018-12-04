package com.company;

import java.util.*;

public class Utils {

    private List<String> arrayList = new ArrayList<>();
    private List<String> linkedList = new LinkedList<>();
    private Set<String> treeSet = new TreeSet<>();
    private Set<String> hashSet = new HashSet<>();
    private Map<Integer, String> hashMap = new HashMap<>();
    private Map<Integer, String> treeMap = new TreeMap<>();

    public void addElementToArrayList(String string) {
        arrayList.add(string);
    }

    public String getElementToArrayList(int index) {
        return arrayList.get(index);
    }

    public void removeElementFromArrayList(String string) {
        arrayList.remove(string);
    }




    public void addElementToLinkedList(String string) {
        linkedList.add(string);
    }

    public String getElementToLinkedList(int index) {
        return linkedList.get(index);
    }

    public void removeElementFromLinkedList(String string) {
        linkedList.remove(string);
    }




    public void addElementToHashSet(String string) {
        hashSet.add(string);
    }

    public boolean getElementToHashSet(String string) {
        return hashSet.contains(string);
    }

    public void removeElementFromHashSet(String string) {
        hashSet.remove(string);
    }



    public void addElementToTreeSet(String string) {
        treeSet.add(string);
    }

    public boolean getElementToTreeSet(String string) {
        return treeSet.contains(string);
    }

    public void removeElementFromTreeSet(String string) {
        treeSet.remove(string);
    }




    public void addElementToHashMap(int index, String string) {
        hashMap.put(index, string);
    }

    public String getElementToHashMap(Integer integer) {
        return hashMap.get(integer);
    }

    public void removeElementFromHashMap(Integer integer) {
        hashMap.remove(integer);
    }




    public void addElementToTreeMap(int index, String string) {
        treeMap.put(index, string);
    }

    public String getElementToTreeMap(Integer integer) {
        return treeMap.get(integer);
    }

    public void removeElementFromTreeMap(Integer integer) {
        treeMap.remove(integer);
    }
}
