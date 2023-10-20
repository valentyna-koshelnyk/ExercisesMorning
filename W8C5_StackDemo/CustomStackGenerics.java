package W8C5_StackDemo;

public class CustomStackGenerics<T> {
    int maxSize;
    Object[] stackArray;
    int top;

    public CustomStackGenerics(int s) {
        this.maxSize = s;
        this.stackArray = new Object[s];
        this.top = -1;
    }
    public void push(T j) {
        int size = size(stackArray);
        if (top == maxSize - 1) {
            stackArray = new Object[maxSize * 2];
        } else if (size > ((3 * maxSize) / 4)) {
            while (size > ((3 * maxSize) / 4)) {
                top--;
                size = top + 1;

            }
        } else {
            stackArray[++ top] = j;
        }
    }
    @Override

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            sb.append(stackArray[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }




    public int size(Object[] stackArr){
        return top + 1;
    }



    public void pop() throws IllegalStateException{
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        } else {
            top--;
        }
    }

    public Object peek() {
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
        CustomStackGenerics customStackGenerics = new CustomStackGenerics(5);

        System.out.println(customStackGenerics.isEmpty());

        for (int i = 0; i < customStackGenerics.maxSize; i++){
            customStackGenerics.push(i);
        }


        System.out.println(customStackGenerics.isFull());
        System.out.println(customStackGenerics.peek());

    }


}


