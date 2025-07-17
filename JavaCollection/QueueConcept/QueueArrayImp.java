package QueueConcept;

public class QueueArrayImp {
    int capacity;
    int[] queueArr;
    int front;
    int rear;
    int currentSize;

    public QueueArrayImp(int sizeOfQueue){
        capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[capacity];
    }
    //this method is used to add elements in the queue
    public void enqueue(int data){
        if(isFull()) System.out.println("Queue is already full!, Cannot insert the data.");
        else {
            rear++;
            if(rear == capacity){
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data+" added to queue!");
        }

    }

    //this method is used to remove the element from the front of the queue

    public void dequeue(){
        if(isEmpty()) System.out.println("Hey, queue is empty, can not delete an element!");
        else {
            front++;
            if(front == capacity){
                System.out.println(queueArr[front - 1] + " removed from the queue!");
                front = 0;
            }
            else {
                System.out.println(queueArr[front - 1] + " removed from the queue!");

            }
            currentSize--;
        }
    }


    public boolean isFull(){
        if(currentSize == capacity)
            return true;
        else return false;
    }

    public boolean isEmpty(){
        if(currentSize == 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        QueueArrayImp obj = new QueueArrayImp(5);

        //adding data to queue (rear end)
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);


        //removing elements from the queue (front end)

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();

        obj.enqueue(60);
        System.out.println(obj.front);
        System.out.println(obj.rear);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.enqueue(90);
        System.out.println(obj.front);
        System.out.println(obj.rear);
        System.out.println(obj.queueArr[obj.front]);
        obj.dequeue();
        System.out.println(obj.front);
        System.out.println(obj.queueArr[obj.front]);
        System.out.println(obj.queueArr[obj.rear]);
        System.out.println(obj.rear);
        obj.enqueue(100);
        System.out.println(obj.rear);
        System.out.println(obj.queueArr[obj.rear]);

        obj.enqueue(110);
        System.out.println(obj.rear);
        System.out.println(obj.queueArr[obj.rear]);




    }



}
