package lists_7;

import lists_7.MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        ArrayList<Integer> listTest = new ArrayList();

        for(int i = 0; i < 5; i++) {

            listTest.add(i);
        }
        listTest.add(10);
        if(listTest.size() == 5) {
            a.add(listTest);
        }
        else {
            ArrayList<Integer> listTemp = new ArrayList();
            Iterator<Integer> it = listTest.iterator();

            for(int i = 0;i < 5;i++) {
                listTemp.add(listTest.get(i));
            }
            a.add(listTemp);
            listTemp.clear();

            for(int i = 2; i < listTemp.size(); i++) {
                listTemp.add(listTest.get(i));
            }
            a.add(listTemp);
            listTemp.clear();

        }

        System.out.println(listTest);
        System.out.println(a);
    }
}
