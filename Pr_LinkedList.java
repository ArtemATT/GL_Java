class Node{
    private Integer data;
    private Node next;

    public Node() {
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}

import java.util.StringJoiner;

public class LinkedList {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public LinkedList() {
    }

    public String toString() {
        if (firstNode == null) {
            return "[ No Elements ]";
        }
        StringJoiner stringJoiner = new StringJoiner(" ", "[", "]");
        Node nextNode = firstNode;
        do {
            stringJoiner.add(String.valueOf(nextNode.getData()));
            nextNode = nextNode.getNext();

        } while (nextNode != null);

        return stringJoiner.toString();
    }

    public void add(Integer data) {
        Node tempNodeNode = new Node();
        tempNodeNode.setData(data);
        tempNodeNode.setNext(null);

        Node lastNode = this.lastNode;
        this.lastNode = tempNodeNode;
        if (lastNode == null) {
            firstNode = tempNodeNode;
        } else {
            lastNode.setNext(tempNodeNode);
        }
        this.size++;
    }

    public Integer get(int index) {

        if (index > this.size || index < 0 || this.size == 0)
            return null;

        else {
            int count = 0;
            Node tempNode = firstNode;

            while (count != index) {
                tempNode = tempNode.getNext();
                count++;
            }

            if (tempNode != null) {
                return tempNode.getData();}

            else return null;
        }
    }

    public boolean delete(int index) {

        if (index > this.size || index < 0 || this.size == 0) {
            return false;
        }

        else {
            int count = 0;
            Node tempNode = firstNode;

            if (index == 0) {
                this.firstNode = firstNode.getNext();
            }

            else {
                while (count != index -1) {
                    tempNode = tempNode.getNext();
                    count++;
                }

                if (tempNode == lastNode ) {
                    tempNode.setNext(null);
                    lastNode = tempNode;
                }

                else {
                    tempNode.setNext(tempNode.getNext().getNext());
                }
            }
            this.size--;
            return true;
        }
    }

    public int size() {
        if (this.size != 0) {
            return this.size;
        }
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {

        LinkedList artLinkedList = new LinkedList();
            for (int i = 0; i < 10; i++) {
            artLinkedList.add(i);
        }
        System.out.println("Linked list size is: " + artLinkedList.size());
        System.out.println("Fourth element before deletion: " + artLinkedList.get(4));
        artLinkedList.delete(4);
        System.out.println("Fourth element after deletion: " + artLinkedList.get(4));
        System.out.println("Linked list size is: " + artLinkedList.size());
        System.out.println("Linked list is: " + artLinkedList.toString());
    }
}
