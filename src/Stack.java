/**
 * like a stack of plates, you add and remove
 * when you remove, you remove always the last plate
 * that was added, when add, you add always on top of
 * last plate
 * LIFO / FILO
 * Last In First Out / First In Last Out
 * you don't control which plate you take
 *  * java comes with stack APIs
 *  push (arg)
 *  pop() -> return + remove item
 *  peek() -> ref to top item
 *  ----------------------
 *  Stack class
 *  array [n]
 *  capacity -> const arg
 *  in this example we use int array and capacity for constructor
 */


public class Stack {

    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push (int item){
        if (isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }

    public int pop (int item){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }


    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }


    private boolean isFull() {
        //top equals to last capacity element
        return top == capacity - 1;
    }
    private boolean isEmpty() {
        //top equals to last element
        return top == -1;
    }
}
