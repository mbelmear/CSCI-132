package Outlab4;


public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList(Node first){
        this.first = first;
        this.last = first;
        this.first.setNext(this.last);
        this.first.setPrev(this.last);
    }

    public void insert(Node toAdd){
        last.setNext(toAdd);
        toAdd.setPrev(last);
        last=toAdd;
        first.setPrev(this.last);
        last.setNext(first);
    }

    public void remove(Node toRemove) {
        Node iter = first;
        if (iter == first && iter == last){
            first = null;
            last = null;
            return;
        }
        while (toRemove != iter) {

            iter = iter.getNext();
            if (iter == first) {
                System.out.println("Does not exist");
                return;
            }
        }
        if (first == iter){
            first = iter.getNext();
        }
        if(last == iter){
            last = iter.getPrev();
        }
        iter.getNext().setPrev(iter.getPrev());
        iter.getPrev().setNext(iter.getNext());
        iter.setNext(null);
        iter.setPrev(null);
    }

    public void print(){
        Node iter = first;
        while(iter != null)
        {
            System.out.println(iter.getData());
            iter = iter.getNext();
            if(iter == first){
//                System.out.println(first.getPrev().getData());
                break;
            }
        }
    }

    //ensures our LL is double linked
    public void printB(){
        Node iter = last;
        while(iter != null)
        {
            System.out.println(iter.getData());
            iter = iter.getPrev();
            if(iter == last){
//                System.out.println(first.getPrev().getData());
                break;
            }
        }
    }
    public int getSize(){
        int count = 0;
        Node iter = first;
        while(iter != null)
        {
//            System.out.println(iter.getData());
            iter = iter.getNext();
            count++;
            if(iter == first){
//                System.out.println(first.getPrev().getData());
                return count;
            }
        }
        return count;
    }

    public Node getFirst(){
        return first;
    }
    public Node getLast(){
        return last;
    }

    public String toString(){
        return "Elements: " + getSize();
    }
}
