

public class deque<T> {
    public static void main(String[] args) {

        deque<Integer> x = new deque<>();
        x.addFirst(1);
        x.addFirst(2);
        x.addFirst(3);
        x.addLast(4);
        x.printDeque();

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
        IntNode<T> current_node = sentinel.next;
        if(current_node.equals(sentinel)) {
            sentinel.next = newNode;
            newNode.prev = sentinel;
            sentinel.prev = newNode;
        }
        else {
            sentinel.next = newNode;
            newNode.prev = sentinel;
            current_node.prev = newNode;
            newNode.next = current_node;
        }
        size++;
    }

//     Adds an item of type T to the back of the deque
    public void addLast(T item){
        IntNode<T> newNode = new IntNode<>(item, null, null);
        IntNode<T> current_node = sentinel.prev; //Get last item in list
        if(current_node.equals(sentinel)) {
            sentinel.next = newNode;
            newNode.prev = sentinel;
            sentinel.prev = newNode;
        }
        else {
            current_node.next = newNode;
            newNode.prev = current_node;
            sentinel.prev = newNode;
        }
        size++;
    }
    // Returns true if the deque is empty, false otherwise.
    public boolean isEmpty(){
        return sentinel.next.equals(sentinel);
    }
    // Returns the number if items in the deque.
    public int size(){
        return this.size;
    }
    // Prints the items in the deque from first to last, separated by a space. Once all the items have been printed, print out a new line.
    public  void printDeque(){
        IntNode<T> currentNode = sentinel;
        while (currentNode.next != sentinel && currentNode.next != null){
            System.out.print(currentNode.next.item +" <---> ");
            currentNode = currentNode.next;
        }
    }

    public T removeFirst(){
        if(!this.isEmpty()){
            IntNode<T> firstNode = sentinel.next;
            sentinel.next = firstNode.next;
            firstNode.next.prev = sentinel;
            size--;
            return firstNode.item;
        }
        System.out.print("cannot remove element from empty list.");
        return sentinel.item;
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