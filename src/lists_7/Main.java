import lists_7.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        int [] mas = new int[5];
        for(int i=0; i< mas.length; i++) {
            mas[i] = i;
        }
        a.add(mas);

        System.out.println(a.toString());
        System.out.println(a.get(1));
    }
}
