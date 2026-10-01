public class reverse {
    int[] q = new int[4];
    int rear = -1;
    int front = 0;

    void enqueue(int x){
        if(rear == q.length - 1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            q[rear] = x;
        }
    }

    void display(){
        for(int i=0; i<q.length; i++){
            System.out.print(q[i] + " ");
        }
    }
   
    void reverse(){
        for(int j = q.length - 1; j>=0; j--){
            System.out.print(q[j] + " ");
        }
    }    
    public static void main(String[] args) {
        reverse r = new reverse();
        r.enqueue(10);
        r.enqueue(20);
        r.enqueue(30);
        r.enqueue(40);

        System.out.println("The array:");
        r.display();
        System.out.println();

        System.out.println("The reversed array");
        r.reverse();
    }     
}
