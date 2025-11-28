import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private int maxRider;
    private int numOfCycles;

    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.rideName = "Unknown Ride";
        this.rideType = "General";
        this.operator = null;
        this.maxRider = 2;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, String rideType, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.maxRider = maxRider;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getter and Setter methods...

    // Part 3: Queue Implementation
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Error: Cannot add null visitor to queue.");
            return;
        }

        if (waitingLine.offer(visitor)) {
            System.out.println("Success: " + visitor.getName() + " added to the waiting queue for " + rideName);
        } else {
            System.out.println("Error: Failed to add " + visitor.getName() + " to the waiting queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("Error: No visitors in the queue to remove.");
            return;
        }

        Visitor removedVisitor = waitingLine.poll();
        System.out.println("Success: " + removedVisitor.getName() + " removed from the waiting queue.");
    }

    @Override
    public void printQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("The waiting queue for " + rideName + " is empty.");
            return;
        }

        System.out.println("=== Waiting Queue for " + rideName + " ===");
        int position = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println(position + ". " + visitor.getName() + " (ID: " + visitor.getVisitorId() + ")");
            position++;
        }
        System.out.println("Total visitors in queue: " + waitingLine.size());
    }

    public Visitor peekNextVisitor() {
        return waitingLine.peek();
    }

    public int getQueueSize() {
        return waitingLine.size();
    }

    // Part 4 methods will be implemented next...
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        // To be implemented in Part 4
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        // To be implemented in Part 4
        return false;
    }

    @Override
    public int numberOfVisitors() {
        // To be implemented in Part 4
        return 0;
    }

    @Override
    public void printRideHistory() {
        // To be implemented in Part 4
    }

    @Override
    public void runOneCycle() {
        // To be implemented in Part 5
    }
}