public class reverse_13 {
    int[] q = new int[5];
    int rear = -1;
    int front = 0;

    void add(int x){
        if(rear == q.length-1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            q[rear] = x;
        }
    }

    void display(){
        for(int i = front; i<=rear; i++){
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }

    void reverse(int k){
        int i = front;
        int j = k-1;

        while(i<j){
            int temp = q[i];
            q[i] = q[j];
            q[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        reverse_13 r = new reverse_13();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);

        r.display();
        System.out.println("Reverse");
        r.reverse(3);
        r.display();
    }
}

