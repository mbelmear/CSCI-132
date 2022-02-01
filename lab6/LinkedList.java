package lab6;

import javax.swing.*;

public class LinkedList {
    private Node first;

    public void printBackwards(){
        Node last = first.getPrev();
        Node iter = last;
        while(iter != null)
        {
            System.out.println(iter.getData());
            iter = iter.getPrev();
            if(iter == last){
                break;
            }
        }
    }

    public void print(){
        Node iter = first;
        while(iter != null)
        {
            System.out.println(iter.getData());
            iter = iter.getNext();
            if(iter == first){
                break;
            }
        }
    }
    public void add(int num){
        Node temp = new Node(num);
        if(first == null)
        {
            first = temp;
            first.setNext(first);
            first.setPrev(first);
        }
        else{
            Node last = first.getPrev();
            last.setNext(temp);
            temp.setPrev(last);
            temp.setNext(first);
            first.setPrev(temp);
        }


    }
    public void search(int num){
        Node iter = first;
        while(iter != null)
        {
            if(iter.getData() == num){
                System.out.println("Found " +  iter.getData());
                return;
            }
            iter = iter.getNext();

            if (iter == first){
                break;
            }
        }
        System.out.println("Didn't find " + num);
    }
    public boolean deleteNode(int num){
        Node iter = first;
        Node start = first;

        while(iter.getNext() != start)
        {

            if(iter.getData() == num)
            {
                if (iter == first)
                {
                    first = first.getNext();
                    first.setPrev(null);
                    return true;
                }
                else if(iter.getNext() != null)
                    iter.getNext().setPrev(iter.getPrev());
                iter.getPrev().setNext(iter.getNext());
                return true;
            }

            iter = iter.getNext();

        }

        return false;
    }
}
