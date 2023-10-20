package W8C5_StackDemo;

public class CustomStack {
    int maxSize;
    long[] stackArray;
    int top;


    public CustomStack(int s) {
        this.maxSize = s;
        this.stackArray = new long[s];
        this.top = -1;
    }

    public void push(long j) throws StackOverflowException {
        if(top == maxSize - 1){
            throw new StackOverflowException("Stack is full");
        } else {
            stackArray[++top] = j;
        }
    }

    public void pop() throws IllegalStateException{
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        } else {
            top--;
        }
    }

    public long peek() {
        if (top == -1) {
            return top;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(5);

        System.out.println(customStack.isEmpty());

        for (int i = 0; i < customStack.maxSize; i++){
            try {
                customStack.push(i);
                //  customStack.push(1); to check exception handling
            } catch (StackOverflowException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(customStack.isFull());
        System.out.println(customStack.peek());





    }


}
