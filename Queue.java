public class Queue {
    private int queue_array[];
    private int front, rear, capacity, count;
    public Queue(int size){
      queue_array = new int[size];
      capacity = size;
      front = 0;
      rear = -1;
      count = 0;
    }
  
    public void enqueue(int element){
    if(isFull()){
      System.out.println("Queue overflow");
      return;
    }
    rear = (rear+1)%capacity;
    queue_array[rear] = element;
    count++;
    }
  
    public void dequeue(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return;
        }
        front = (front + 1) % capacity;
        count--;
    }
  
    public int peek(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      return queue_array[front];
    }
  
    public int poll(){
        int data = peek();
        dequeue();
        return data;
    }
    public boolean size(){
       return count;
    }
    public boolean isEmpty(){
       return(size()==0);
    }
    public boolean isFull(){
      return (size()==capacity);
    }
}