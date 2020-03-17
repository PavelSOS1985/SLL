
public class Test {
    public static LinkedList SummLists(LinkedList _firstList, LinkedList _secondList) {
        LinkedList resList = new LinkedList();
        if (_firstList.count() != _secondList.count()) {
            return resList;
        }

        Node nodeFirst = _firstList.head;
        Node nodeSecond = _secondList.head;

        while (nodeFirst != null) {
            Node nodeRes = new Node(nodeFirst.value + nodeSecond.value);
            resList.addInTail(nodeRes);

            nodeFirst = nodeFirst.next;
            nodeSecond = nodeSecond.next;
        }
        return resList;
    }

    public static void testSummLists_1() {
        System.out.println("=== Test 1 ===");

        LinkedList firstList = new LinkedList();
        LinkedList secondList = new LinkedList();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        firstList.addInTail(n1);
        firstList.addInTail(n2);
        firstList.addInTail(n3);

        secondList.addInTail(n4);
        secondList.addInTail(n5);
        secondList.addInTail(n6);

        LinkedList testList = SummLists(firstList, secondList);

        Node testNode = testList.head;
        int i = 5;
        boolean res = true;
        while (testNode != null) {
            if (i != testNode.value) res = false;
            testNode = testNode.next;
            i+=2;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        testSummLists_1();
    }
}
