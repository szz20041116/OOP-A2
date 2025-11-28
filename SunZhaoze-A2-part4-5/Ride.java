import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Collections;

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

    // Getter 和 Setter 方法
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public Queue<Visitor> getWaitingLine() {
        return waitingLine;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

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

    // Part 4A: Ride History Implementation
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Error: Cannot add null visitor to ride history.");
            return;
        }

        if (rideHistory.add(visitor)) {
            System.out.println("Success: " + visitor.getName() + " added to ride history for " + rideName);
        } else {
            System.out.println("Error: Failed to add " + visitor.getName() + " to ride history.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Error: Cannot check null visitor in history.");
            return false;
        }

        boolean found = rideHistory.contains(visitor);
        if (found) {
            System.out.println("Success: " + visitor.getName() + " found in ride history.");
        } else {
            System.out.println("Info: " + visitor.getName() + " not found in ride history.");
        }
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println("Number of visitors in ride history: " + count);
        return count;
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("The ride history for " + rideName + " is empty.");
            return;
        }

        System.out.println("=== Ride History for " + rideName + " ===");
        Iterator<Visitor> iterator = rideHistory.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(count + ". " + visitor.getName() +
                    " (ID: " + visitor.getVisitorId() +
                    ", Age: " + visitor.getAge() +
                    ", Ticket: " + visitor.getTicketType() + ")");
            count++;
        }
        System.out.println("Total visitors in history: " + rideHistory.size());
    }

    // Part 4B: Sorting Implementation
    public void sortRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors in ride history to sort.");
            return;
        }

        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Success: Ride history sorted by name and age.");
    }

    // Part 5: Run One Cycle Implementation
    @Override
    public void runOneCycle() {
        // Check if there is an operator assigned
        if (operator == null) {
            System.out.println("Error: Cannot run " + rideName + " - no operator assigned.");
            return;
        }

        // Check if there are visitors in the queue
        if (waitingLine.isEmpty()) {
            System.out.println("Error: Cannot run " + rideName + " - no visitors in the waiting queue.");
            return;
        }

        System.out.println("\n=== Running " + rideName + " for one cycle ===");
        System.out.println("Operator: " + operator.getName());
        System.out.println("Max riders per cycle: " + maxRider);

        int ridersThisCycle = 0;

        // Process visitors from queue based on maxRider
        while (ridersThisCycle < maxRider && !waitingLine.isEmpty()) {
            Visitor currentVisitor = waitingLine.poll();
            if (currentVisitor != null) {
                // Add to ride history
                rideHistory.add(currentVisitor);
                ridersThisCycle++;
                System.out.println("✓ " + currentVisitor.getName() + " is riding " + rideName);
            }
        }

        // Update cycle count
        numOfCycles++;

        System.out.println("Cycle completed: " + ridersThisCycle + " visitors rode " + rideName);
        System.out.println("Total cycles run: " + numOfCycles);
        System.out.println("Visitors remaining in queue: " + waitingLine.size());
    }

    // Helper methods for testing
    public Visitor peekNextVisitor() {
        return waitingLine.peek();
    }

    public int getQueueSize() {
        return waitingLine.size();
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideName='" + rideName + '\'' +
                ", rideType='" + rideType + '\'' +
                ", operator=" + (operator != null ? operator.getName() : "None") +
                ", maxRider=" + maxRider +
                ", numOfCycles=" + numOfCycles +
                '}';
    }
}