public class count {
    int[] a;
    int rear = -1;
    int front = 0;
    int count = 0;

    void Size(int s){
        a = new int[s];
        System.out.println("The size is: " + s);
    }

    void enqueue(int x){
        if(rear == a.length - 1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            a[rear] = x;
        }
    }

    void count(){
        for(int i = 0; i<a.length; i++){
            count++;
        }
        System.out.println("The number of elements: " + count);
    }
    public static void main(String[] args) {
        count c = new count();
        c.Size(5);
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);

        c.count();



    }
}
