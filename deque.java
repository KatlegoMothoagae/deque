

public class deque<T> {
    public static void Main(String[] args) {
        System.out.println(2);
    }
    public static class IntNode<T> {
        public T item;
        public IntNode<T> next;
        public IntNode<T> prev;
        public IntNode(T item, IntNode<T> next, IntNode<T> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    private IntNode<T> sentinel;
    private int size;
    //Adds an item of type T to the front of the deque
    public deque(){
        sentinel = new IntNode<>(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }
    public void addFirst(T item){
        IntNode<T> newNode = new IntNode<>(item, null, null);
        sentinel.next = newNode;
        newNode.prev = sentinel;
        size++;
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