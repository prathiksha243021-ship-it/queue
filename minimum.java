public class minimum {
    int[] a = new int[5];
    int rear = -1;
    int front =  0;
    int mini = 1000000;

    void enqueue(int x){
        if(rear == a.length - 1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            a[rear] = x;
        }
    }

    void min(){
        for(int i = 0; i<a.length ; i++){
            if(a[i]<mini);
            mini = a[i];
        }

        System.out.println(mini);
    }

    public static void main(String[] args) {
        minimum m = new minimum();
        m.enqueue(4);
        m.enqueue(7);
        m.enqueue(3);
        m.enqueue(9);
        m.enqueue(1);

        System.out.println("Minimum element");
        m.min();
    }

}
