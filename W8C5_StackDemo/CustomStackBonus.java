package W8C5_StackDemo;


public class CustomStackBonus {
        int maxSize;
        long[] stackArray;
        int top;


        public CustomStackBonus(int s) {
            this.maxSize = s;
            this.stackArray = new long[s];
            this.top = -1;
        }

        public void push(long j) {
            int size = size(stackArray);
            if (top == maxSize - 1) {
                stackArray = new long[maxSize * 2];
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




        public int size(long[] stackArr){
                return top + 1;
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
            CustomStackBonus customStackBonus = new CustomStackBonus(5);

            System.out.println(customStackBonus.isEmpty());

            for (int i = 0; i < customStackBonus.maxSize; i++){
                customStackBonus.push(i);
            }


            System.out.println(customStackBonus.isFull());
            System.out.println(customStackBonus.peek());

        }


    }


