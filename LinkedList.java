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

public class LinkedList {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public LinkedList() {
    }

    public String toString()
    {
        String linkedList;

        if (firstNode == null)
            linkedList = "[ No Elements ]";

        else {
            linkedList = "[ " + firstNode.getData().toString();

            lastNode = firstNode.getNext();
            while (lastNode.getNext() != null)
            {
                linkedList += " " + lastNode.getData().toString();
                lastNode = lastNode.getNext();
            }
        }
        return linkedList + " ]";
    }

    public void add(Integer data) {

        if (firstNode == null)
        {
            firstNode = new Node();
            lastNode = new Node();
            firstNode.setData(data);
            firstNode.setNext(lastNode);
        }

        else if (lastNode != null)
        {
            while (lastNode.getNext() != null){
                lastNode = lastNode.getNext();
            }
            lastNode.setData(data);
            lastNode.setNext(new Node());
        }
        size++;
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList artLinkedList = new LinkedList();
        artLinkedList.add(111);
        artLinkedList.add(222);
        artLinkedList.add(333);
        artLinkedList.add(444);
        artLinkedList.add(555);

        System.out.println(artLinkedList.toString());
    }
}
