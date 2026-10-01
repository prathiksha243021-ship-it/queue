public class BinaryNumbers {
    String[] q = new String[20];
    int rear = -1;
    int front = 0;

    void enqueue(String x){
        rear++;
        q[rear] = x;
    }

    String dequeue(){
        String x = q[front];
        front++;
        return x;
    }

    void generate(int n){
        enqueue("1");

        for(int i = 1; i<=n; i++){
            String x = dequeue();
            System.out.println(x + " ");

            enqueue(x + "0");
            enqueue(x + "1");
        }
    }

    public static void main(String[] args) {
        BinaryNumbers b = new BinaryNumbers();
        b.generate(5);
    }
}
