public class Stack {
  private int size;
  private int[] stack_array;
  private int top;
  //Constructor Stack
  public Stack(int size){
    this.size = size;
     stack_array = new int[size];
    top = -1; //Top -1 berarti masih kosong
  }
  
  public void push(int element){
    if(full())
      System.out.println("Stack overflow");
    stack_array[++top]=element;
  }
  
  public int pop(){
    if(empty()){
      System.out.println("Stack is empty");
      return -1;
  }
  return stack_array[top--];
  }
  
  public int peek(){
  if(!empty())
    return stack_array[top];
  else {
    System.out.println("Stack is empty");
    return -1;
    }
  }
  public boolean empty(){
    return (top==-1);
  }
  public boolean full(){
    return (top==size-1);
  }
  public int search(int element){
    for(int i=1;i<=n;i++){
      if(stack_array[top--]==element)
        return i;
   }
    return -1;
  }
}