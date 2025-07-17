package StackConcepts;

public class StackImpByLinkedList {

    Node topNode;

    final int stack_size = 10;
    class Node{
        int data;
        Node next;
    }


    StackImpByLinkedList(){
        topNode = null;

    }

    //push:

    public void push(int value){
        Node tempNode = topNode;
        topNode = new Node();
        topNode.data = value;
        topNode.next = tempNode;
    }

    //pop:
    public int pop(){
       if(!isEmpty())
       {
           Node tempNode = topNode;
           topNode = topNode.next;
           System.out.println("Popped Element : " + tempNode.data);
           return tempNode.data;
       }
       else{
           System.out.println("Stack  is empty");
           return -1;
       }

    }

    public int peek()
    {
        return topNode.data;
    }

    public boolean isEmpty()
    {
        return (topNode == null);
    }

    public int size()
    {
        int count = 0;
        Node tempNode = topNode;
        while(tempNode != null)
        {
            count++;
            tempNode = tempNode.next;

        }
        return count;
    }

    public static void main(String[] args) {
            StackImpByLinkedList n1 = new StackImpByLinkedList();
            n1.push(10);
            n1.push(20);
            n1.push(30);

        System.out.println(n1.peek());
        System.out.println(n1.pop());
        System.out.println(n1.peek());
        n1.pop();
        System.out.println(n1.peek());
        System.out.println(n1.pop());

        System.out.println(n1.isEmpty());
        System.out.println(n1.pop());

        n1.push(100);

        System.out.println(n1.isEmpty());
        System.out.println(n1.peek());
        System.out.println(n1.pop());

        System.out.println(n1.size());
        System.out.println(n1.isEmpty());

        n1.push(1000);
        n1.push(2000);
        n1.push(4000);
        n1.push(5000);
        n1.push(6000);

        System.out.println( n1.isEmpty());
        System.out.println(n1.size());









    }
}
