import java.util.ArrayList;

public class BusStop {

    private String destination;
    private ArrayList<Person> queue;

    public BusStop(String destination) {
        this.destination = destination;
        this.queue = new ArrayList<Person>();

    }

    public int queueLength() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
       return this.queue.remove(0);
    }
}
