public class Max {

    int[] q = new int[5];
    int front = 0;
    int rear = -1;
    int maxi = 0;

    void enqueue(int x){
        if(rear == q.length-1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            q[front] = x;
        }
    }

    void max(){
        for(int i = 0; i<q.length; i++){
            if(q[i] > maxi){
                maxi = q[i];
            }
            
        }
        System.out.println(maxi);
    }
    public static void main(String[] args) {
        Max m = new Max();
        m.enqueue(10);
        m.enqueue(20);
        m.enqueue(30);
        m.enqueue(40);

        m.max();


        

    }   
}
