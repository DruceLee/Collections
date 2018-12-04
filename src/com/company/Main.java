package com.company;

public class Main {

    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\tadd\tremove\tgetElement");

        int count = 100000;

        Data data = new Data();
        data.createObject(count);

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.addElementToArrayList(data.getElement(i));
        }
        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.getElementToArrayList(i);
        }
        long t4 = System.currentTimeMillis();

        long t5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.removeElementFromArrayList(data.getElement(i));
        }
        long t6 = System.currentTimeMillis();
        data.printTable("ArrayList", t2 - t1, t4 - t3, t6 - t5);





        t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.addElementToLinkedList(data.getElement(i));
        }
        t2 = System.currentTimeMillis();

        t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.getElementToLinkedList(i);
        }
        t4 = System.currentTimeMillis();

        t5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.removeElementFromLinkedList(data.getElement(i));
        }
        t6 = System.currentTimeMillis();
        data.printTable("LinkedList", t2 - t1, t4 - t3, t6 - t5);





        t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.addElementToHashSet(data.getElement(i));
        }
        t2 = System.currentTimeMillis();

        t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.getElementToHashMap(i);
        }
        t4 = System.currentTimeMillis();

        t5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.removeElementFromHashSet(data.getElement(i));
        }
        t6 = System.currentTimeMillis();
        data.printTable("HashSet", t2 - t1, t4 - t3, t6 - t5);





        t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.addElementToTreeSet(data.getElement(i));
        }
        t2 = System.currentTimeMillis();

        t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.getElementToTreeSet(data.getElement(i));
        }
        t4 = System.currentTimeMillis();

        t5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.removeElementFromTreeSet(data.getElement(i));
        }
        t6 = System.currentTimeMillis();
        data.printTable("TreeSet", t2 - t1, t4 - t3, t6 - t5);





        t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.addElementToHashMap(i, data.getElement(i));
        }
        t2 = System.currentTimeMillis();

        t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.getElementToHashMap(i);
        }
        t4 = System.currentTimeMillis();

        t5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.removeElementFromHashMap(i);
        }
        t6 = System.currentTimeMillis();
        data.printTable("HashMap", t2 - t1, t4 - t3, t6 - t5);





        t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.addElementToTreeMap(i, data.getElement(i));
        }
        t2 = System.currentTimeMillis();

        t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.getElementToTreeMap(i);
        }
        t4 = System.currentTimeMillis();

        t5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            utils.removeElementFromTreeMap(i);
        }
        t6 = System.currentTimeMillis();
        data.printTable("TreeMap", t2 - t1, t4 - t3, t6 - t5);
    }
}
