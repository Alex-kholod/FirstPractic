package lists_7;

import lists_7.MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        ArrayList<Integer> listTest = new ArrayList();

        for(int i = 0; i < 8; i++) {

            listTest.add(i);
        }

        ArrayList<Integer> listTemp = new ArrayList();
        Iterator<Integer> it = listTest.iterator();

//        int count = 0;
//        while(it.hasNext() && count % 5!= 0) {
//            listTemp.add(it.next());
//            count ++;
//        }
//        a.add(listTemp);


        for(int i = 0;i < 5;i++) {
            listTemp.add(listTest.get(i));
        }
        a.add(listTemp);
//            System.out.println("listTemp = " + listTemp);
//            System.out.println("A = " + a);
//
//            System.out.println("A = " + a);
//            System.out.println("ListTest = " + listTest);



//                System.out.println("listTest.size() / 2 = " + listTest.size() / 2);
//                for(int j = listTest.size() / 2; j < listTemp.size() - 3; j++) {
//                    System.out.println("ListTest.get " + "[" + j + "]" + " " + listTest.get(j));
//                    listTemp.add(listTest.get(j));
//                }
//                a.add(listTemp);

        System.out.println(listTest);
        System.out.println(a);
    }
}
