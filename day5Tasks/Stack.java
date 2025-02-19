package day5Tasks;
public class Stack {
    private Contact[] stackArray;
    private int top;
    private static final int MAX_SIZE = 10; 

    
    public Stack() {
        this.stackArray = new Contact[MAX_SIZE];
        this.top = -1; 
    }

  
    public void push(Contact contact) throws StackOverflowException, InvalidContactException {
        if (top >= MAX_SIZE - 1) {
            throw new StackOverflowException("Stack is full. Cannot push any more contacts.");
        }


        if (contact == null || !contact.isValid()) {
            throw new InvalidContactException("Invalid contact object. Cannot push to the stack.");
        }

        stackArray[++top] = contact;
    }

    public Contact pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty. Cannot pop any contact.");
        }

        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

   
    public Contact peek() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty.");
        }
        return stackArray[top];
    }


    public int size() {
        return top + 1;
    }
}
