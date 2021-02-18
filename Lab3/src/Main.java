
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Object> queue = new ArrayList<Object>();
        ArrayList<Object> queue1 = new ArrayList<Object>();

        queue.add(0);
        queue1.add(0);
        
        if(queue.get(0) == queue1.get(0)){
            System.out.println("HEJ");
        }

    }
}
/*
 * if (f instanceof FIFO) { if (this.myQueueList.size() == ((FIFO)
 * f).myQueueList.size()) { for (int i = 0; i < myQueueList.size(); i++) { if
 * ((this.myQueueList.get(i) == null && ((FIFO) f).myQueueList.get(i) != null)
 * || (this.myQueueList.get(i) != null && ((FIFO) f).myQueueList.get(i) == null)
 * && (myQueueList.get(i) != ((FIFO) f).myQueueList.get(i))) { return false; } }
 * } else { return false; } } else { throw new
 * ClassCastException("Object not the same type"); } return true;
 */