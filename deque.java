public class deque<T> {

    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode prev;
        public IntNode(int item, IntNode next, IntNode prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    private IntNode prev;
    private int size;
    //Adds an item of type T to the front of the deque
    public deque(){

    }
    public void addFirst(T item){

    }
    // Adds an item of type T to the back of the deque
    public void addLast(T item){

    }
    // Returns true if the deque is empty, false otherwise.
    public boolean isEmpty(){
        return false;
    }
    // Returns the number if items in the deque.
    public int size(){
        return 0;
    }
    // Prints the items in the deque from first to last, separated by a space. Once all the items have been printed, print out a new line.
    public  void printDeque(){

    }

    public T removeFirst(){
        return null;
    }
    //    Removes and returns the item at the back of the deque. If no such item exists, returns null.
    public T removeLast(){
        return null;
    }
    //    Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!
    public  T get(int index){
        return null;
    }


}