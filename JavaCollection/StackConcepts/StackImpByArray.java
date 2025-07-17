package StackConcepts;

public class StackImpByArray {
    int size;
    int[] arr;
    int top;

    StackImpByArray(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public int pop(){
        if(!isEmpty()){
            return arr[top--];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }







    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println(element +" pushed");
        }
        else{
            System.out.println("Stack is full");
        }
    }





    public int peek(){
        if(!this.isEmpty()){
            return arr[top];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (size - 1 == top);
    }








    public static void main(String[] args) {
            StackImpByArray stk = new StackImpByArray(10);

        System.out.println(stk.pop());

        stk.push(100);
        stk.push(200);
        stk.push(300);
        stk.push(400);

        System.out.println("-------------------");

        System.out.println(stk.pop());

        System.out.println(stk.peek());

        System.out.println(stk.size);

        stk.pop();
        System.out.println( stk.peek());

        System.out.println( stk.isEmpty());
        System.out.println(stk.isFull());
    }
}
