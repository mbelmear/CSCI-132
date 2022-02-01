package Outlab4;

public class Referee {
    private Node curr;

    Referee(Node start){
        this.curr = start;
    }
    public void iterRight(int k){
        for(int i = 0; i < k-1; i++){
            curr = curr.getNext();
        }
    }
    public void iterLeft(int m){
        for(int i = 0; i < m-1; i++){
            curr = curr.getPrev();
        }
    }
    public Node getCurr(){
        return this.curr;
    }
    public void setCurr(Node n){
        this.curr = n;
    }

}
