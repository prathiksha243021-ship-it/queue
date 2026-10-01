public class Imple_queue{
    public static void main(String[] args) {
        Imple q = new Imple();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        System.out.println("Deleting the elements");

        q.dequeue();
        q.dequeue();

        q.display();
    }
}