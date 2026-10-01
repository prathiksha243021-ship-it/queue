import java.util.LinkedList;
import java.util.Queue;

public class Queue_linked {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList <String>(); 
        q.offer("Prathi");
        q.offer("Pranav");
        q.offer("Laksh");
        q.offer("Nishmetha");

        System.out.println(q);
    }
}
