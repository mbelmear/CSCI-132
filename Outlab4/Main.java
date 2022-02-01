package Outlab4;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("scratch");
        File output = new File("LinkedListProgram.txt");
        output.createNewFile();
        FileWriter outputWriter = new FileWriter(output);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] poop = line.split(" ");

            int n = Integer.parseInt(poop[0]);
            int k = Integer.parseInt(poop[1]);
            int m = Integer.parseInt(poop[2]);

            if (n == 0) {
                continue;
            }
            LinkedList myLL = new LinkedList(new Node(1));
            for (int i = 2; i <= n; i++) {
                myLL.insert(new Node(i));
            }

            Referee stun = new Referee(myLL.getFirst());
            Referee cow = new Referee(myLL.getLast());
            while (myLL.getSize() > 0) {
                stun.iterRight(k);
                cow.iterLeft(m);
                if (stun.getCurr() == cow.getCurr()) {
                    outputWriter.write(cow.getCurr().getData() + "\n");
                    Node toRemove = stun.getCurr();
                    stun.setCurr(toRemove.getNext());
                    cow.setCurr(toRemove.getPrev());
                    myLL.remove(toRemove);
                } else {
                    outputWriter.write(stun.getCurr().getData() + " " + cow.getCurr().getData() + "\n");
                    Node stunRemove = stun.getCurr();
                    Node cowRemove = cow.getCurr();
                    stun.setCurr(stunRemove.getNext());
                    if (stunRemove.getNext() == cowRemove) {
                        stun.setCurr(cowRemove.getNext());
                    }
                    cow.setCurr(cowRemove.getPrev());
                    if (cowRemove.getPrev() == stunRemove) {
                        cow.setCurr(stunRemove.getPrev());
                    }
                    myLL.remove(stunRemove);
                    myLL.remove(cowRemove);
                }
            }

            outputWriter.write("\n");
        }
        outputWriter.close();
    }
}
        /*
        Action Items
        1. LinkedList Class- DONE
            - First node
            - Last node

            - Add Node (new node)
                - last.setNext(new)
                - first.setPrev(new)
                - new.setNext(first)
                - new.setPrev(last)
                - last = new
            - Remove node(toRemove)
                - tr.getNext.setPrev(tr.getPrev)
                - tr.getPrev.setNext(tr.getNext)
                - tr.setNext = null
                - tr.setPrev = null
            - getSize() returns how many nodes are in LL

         2. Node class-DONE
            - Next
            - Previous node
            - Number

            - GetNext() returns the node that this is pointing to
            - GetPrev()
            - SetNext(Node new) returns nothing, but sets this.next to the new node
            - SetPrev

         3. Referee class
            - Node curr- where the Referee is at in the list

            - IterRight(k) purely for stun- moves curr three nodes to the right
            - IterLeft(m) purely for cow
            - getCurr()- returns the current node
            - setCurr(node new) sets curr to the new node

          4. Driver class
            - int n = 10
            - int k = 4
            - int m = 3
            - 2 referees- cow and stun
            - while myLL.getSize() > 1
                - stun.iterRight(k)
                - cow.iterLeft(m)
                - toRemove = stun.getCurr()
                - stun.setCurr(toRemove.getNext())
                - myLL.remove(toRemove)
                - toRemove = cow.getCurr()
                - cow.setCutt(toRemove.getPrev()
                - myLL.remove(toRemove)


         */



