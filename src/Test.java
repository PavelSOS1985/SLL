import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static LinkedList createSLL(int N) {
        LinkedList resList = new LinkedList();
        for (int i = 0; i < N; i++) {
            Node n = new Node((int) (Math.random() * 10));
            resList.addInTail(n);
        }
        return resList;
    }

    public static void testRemove(LinkedList testList) {
        System.out.println("================= Test Remove ===================");
        System.out.println("Enter Remove Value (99-exit):");
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        while (v != 99) {
            System.out.println(testList.remove(v));
            Node node = testList.head;
            int i = 0;
            while (node != null) {
                System.out.println(i + " - " + node.value);
                node = node.next;
                i++;
            }
            System.out.println("head = " + testList.head);
            System.out.println("tail = " + testList.tail);
            v = in.nextInt();
        }

    }

    public static void testRemoveAll(LinkedList testList) {
        System.out.println("================= Test Remove All ===================");
        System.out.println("Enter Remove Value (99-exit):");
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        while (v != 99) {
            testList.removeAll(v);
            Node node = testList.head;
            int i = 0;
            while (node != null) {
                System.out.println(i + " - " + node.value);
                node = node.next;
                i++;
            }
            System.out.println("head = " + testList.head);
            System.out.println("tail = " + testList.tail);
            v = in.nextInt();
        }

    }

    public static void testFindAll(LinkedList testList) {
        System.out.println("================= Test Find All ===================");
        System.out.println("Enter Find Value (99-exit):");
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        while (v != 99) {
            ArrayList<Node> resList = new ArrayList<>();
            resList = testList.findAll(v);
            for (Node i :
                    resList) {
                System.out.println(i);
            }
            System.out.println("head = " + testList.head);
            System.out.println("tail = " + testList.tail);
            v = in.nextInt();
        }

    }

    public static void testClear(LinkedList testList) {
        System.out.println("================= Test Clear ===================");
        testList.clear();
        Node node = testList.head;
        int i = 0;
        while (node != null) {
            System.out.println(i + " - " + node.value);
            node = node.next;
            i++;
        }
        System.out.println("head = " + testList.head);
        System.out.println("tail = " + testList.tail);
    }

    public static void testCount(LinkedList testList) {
        System.out.println("================= Test Count ===================");
        System.out.println(testList.count());
    }

    public static void testInsertAfter(LinkedList testList) {
        System.out.println("================= Test Insert After ===================");
        Node n1 = new Node(3);
        Node n2 = new Node(88);
        testList.insertAfter(n1, n2);
        Node node = testList.head;
        int i = 0;
        while (node != null) {
            System.out.println(i + " - " + node.value);
            node = node.next;
            i++;
        }
        System.out.println("head = " + testList.head);
        System.out.println("tail = " + testList.tail);
    }

    public static void main(String[] args) {
        System.out.println("==== Tests Run ====");
        int N = (int) (Math.random() * 10);
        LinkedList testList = createSLL(N);
        Node node = testList.head;
        int i = 0;
        while (node != null) {
            System.out.println(i + " - " + node.value);
            node = node.next;
            i++;
        }
        //testRemoveAll(testList);
        //testFindAll(testList);
        testClear(testList);
        //testCount(testList);
        //testRemove(testList);
        //testCount(testList);
        //testRemove(testList);
        //testCount(testList);
        //testInsertAfter(testList);
    }
}
