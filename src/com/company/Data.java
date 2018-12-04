package com.company;

public class Data {
    private String[] strings;

    public void createObject(int count) {
        strings = new String[count];

        for (int i = 0; i < count; i++) {
            strings[i] = "a" + i;
        }
    }

    public String getElement(int index) {
        return strings[index];
    }

    public void printTable(String s, long t1, long t2, long t3) {
        System.out.println("-------------------------------------------------------");
        System.out.println(s + "\t" + t1 + "\t" + t2 + "\t" + t3);
    }
}
