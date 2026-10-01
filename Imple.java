public class Imple{
    int[] q = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int x){
        if(rear == q.length - 1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            q[rear] = x;
        }
    }

    void dequeue(){
        if(rear == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Deleted: " + q[front]);
            front++;
        }
    }

    void peek(){
        if(front>rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Front: " + q[front]);    
        }
    }

    void display(){
        if(front>rear){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = front; i<rear ; i++){
                System.out.println(q[i] + " ");
            }
        }
        System.out.println();
    }
}