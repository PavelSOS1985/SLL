import java.util.*;

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    // Код добавления узла
    public void addInTail(Node item) {
        if (this.head == null)
            this.head = item;
        else
            this.tail.next = item;
        this.tail = item;
    }

    // Код поиска узла по значению
    public Node find(int value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    // здесь будет ваш код поиска всех узлов
    public ArrayList<Node> findAll(int _value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (node.value == _value)
                nodes.add(node);
            node = node.next;
        }
        return nodes;
    }

    // Удаление одного узла по значению
    public boolean remove(int _value) {
        Node prev = this.head;
        if (prev != null) {
            while (prev.next != null) {
                if (prev.value == _value) {
                    head = head.next;
                    return true;
                }
                if (prev.next.value == _value) {
                    if (prev.next == tail) {
                        this.tail = prev;
                        this.tail.next = null;
                        return true;
                    }
                    prev.next = prev.next.next;
                    return true;
                }
                prev = prev.next;
            }
            if (prev.value == _value) {
                head = null;
                tail = null;
                return true;
            }
        }
        return false;
    }

    // Удаления всех узлов по заданному значению
    public void removeAll(int _value) {
        Node prev = this.head;
        if (prev != null) {
            while (prev.next != null) {
                if (prev.value == _value) {
                    this.head = this.head.next;
                    prev = this.head;
                    continue;
                }
                if (prev.next.value == _value) {
                    if (prev.next == tail) {
                        this.tail = prev;
                        this.tail.next = null;
                        break;
                    } else {
                        prev.next = prev.next.next;
                        continue;
                    }
                }
                prev = prev.next;
            }
            if (prev.value == _value) {
                head = null;
                tail = null;
            }
        }
    }

    // Код очистки всего списка
    public void clear() {
        this.head = null;
        this.tail = null;
    }

    // Подсчёт количества элементов в списке
    public int count() {
        int count = 0;
        Node node = this.head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    // Код вставки узла после заданного
    public void insertAfter(Node _nodeAfter, Node _nodeToInsert) {
        Node node = this.head;
        while (node != null) {
            if (node.value == _nodeAfter.value) {
                _nodeToInsert.next = node.next;
                node.next = _nodeToInsert;
                return;
            }
            node = node.next;
        }
        node = this.head;
        if (node == null) {
            addInTail(_nodeToInsert);
        } else {
            this.head = _nodeToInsert;
            this.head.next = node;
        }

        // если _nodeAfter = null ,
        // добавьте новый элемент первым в списке
    }

}

class Node {
    public int value;
    public Node next;

    public Node(int _value) {
        value = _value;
        next = null;
    }
}

