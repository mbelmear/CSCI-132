package lab9;

public class MinHeap {
    private int[] Heap;//creating the int array to be our heap
    private int size;
    private int maxsize;

    private static final int FRONT = 1;

    MinHeap(int maxsize) {//heap must be a size greater than 0, constructor
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;//parent formula
    }

    private int leftChild(int pos) {
        return (2 * pos);//left child formula
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;//right child formula
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int tmp;//method to sway elements with elements that have a higher priority
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {//determining the elements position by what elements it is next to and moving them accordingly
            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element) {
        Heap[++size] = element;//method to insert an element
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print() {//method to print the heap and all of its various elements
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + ", LEFT CHILD :" + Heap[2 * i] + ", RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void minHeap() {//method to identify the smallest element
        for (int pos = (size / 2); pos >= 1; pos--) {
            minHeapify(pos);
        }
    }

    public int remove() {//method to remove the smallest element from the heap
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    public static void main(String[] args) {//main method
        System.out.println("The Min Heap is ");
        MinHeap minHeap = new MinHeap(25);//setting the heap size to 25 integers
        minHeap.insert(5);//adding 5 to the heap
        minHeap.insert(8);//adding 8 to the heap
        minHeap.insert(4);//adding 4 to the heap
        minHeap.insert(9);//adding 9 to the heap
        minHeap.insert(22);//adding 22 to the heap
        minHeap.insert(17);//adding 17 to the heap
        minHeap.insert(6);//adding 6 to the heap
        minHeap.insert(14);//adding 14 to the heap
        minHeap.insert(9);//adding 9 to the heap
        minHeap.print();//printing the entire heap with all of the elements we just added
        System.out.println("Element Removed is " + minHeap.remove());//removing the smallest integer from the heap
        System.out.println("Element Removed is " + minHeap.remove());//removing the next smallest integer from the heap
        System.out.println("Elements are");
        minHeap.print();//reprinting the heap without the elements we removed
        minHeap.insert(18);//adding 18 to the heap
        minHeap.insert(12);//adding 12 to the heap
        System.out.println("Elements added are 18 and 12");
        System.out.println("Elements are");
        minHeap.print();
        System.out.println("Element Removed is " + minHeap.remove());//removing the smallest element from the heap
        System.out.println("Element Removed is " + minHeap.remove());//removing the second smallest element from the heap
        System.out.println("Element Removed is " + minHeap.remove());//removing the third smallest element from the heap
        System.out.println("Elements are");
        minHeap.print();//printing the heap for the last time with all of our various edits
    }
}