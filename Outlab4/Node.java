package Outlab4;

public class Node {
    private Node next;
    private Node prev;
    private int data;

    Node(int d){
        data = d;
    }
    public Node getPrev(){
        return prev;
    }
    public Node getNext(){
        return next;
    }
    public void setPrev(Node p){
        this.prev = p;
    }
    public void setNext(Node n){
        this.next = n;
    }
    public int getData(){
        return data;
    }
}