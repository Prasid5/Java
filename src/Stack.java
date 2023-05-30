import java.util.ArrayList;
import java.util.EmptyStackException;
public class Stack {
    private ArrayList<Integer> stack;//references object
    private int capacity;
    
    public Stack(int capacity){
        this.capacity=capacity;
        stack=new ArrayList<>();
    }
    
    public void push(int item){
        if(isFull()==true){
            throw new IllegalStateException("Stack is full");
        }
        stack.add(item);
    }
    
    public int pop(){
        if(isEmpty()==true){
            throw new EmptyStackException();
        }
        return stack.remove(stack.size()-1);
    }
    
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(stack.size()-1);
    }
    
    public boolean isFull(){
        return stack.size() == capacity;
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public int size(){
        return stack.size();
    }
    
    public void printStack(){
        System.out.println(stack.toString());
    }
    
    public static void main(String[] args) {
        Stack stack=new Stack (5);
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(55);
        
        System.out.println("Stack size:"+stack.size());
        System.out.println("Stack elements");
        stack.printStack();
        System.out.println("Check Status Stack full "+stack.isFull());
        System.out.println("Peek"+stack.peek());
        System.out.println("Pop"+stack.pop());
        System.out.println("Pop"+stack.pop());
        System.out.println("Stack size:"+stack.size());
        System.out.println("Stack elements:");
        stack.printStack();
        System.out.println("Check Status Stack full"+stack.isEmpty());
        System.out.println("Pop"+stack.pop());
        System.out.println("Pop"+stack.pop());
        System.out.println("Stack size:"+stack.size());
        System.out.println("Stack elements:");
        stack.printStack();
        System.out.println("Check Status Stack full"+stack.isEmpty());
        System.out.println("123");
        
    }
}
