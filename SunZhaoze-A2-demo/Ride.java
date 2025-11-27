import java.util.LinkedList;
import java.util.Queue;

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

    // 接口方法实现 (将在后续部分完成具体逻辑)
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        // 将在Part 3实现
    }

    @Override
    public void removeVisitorFromQueue() {
        // 将在Part 3实现
    }

    @Override
    public void printQueue() {
        // 将在Part 3实现
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        // 将在Part 4实现
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        // 将在Part 4实现
        return false;
    }

    @Override
    public int numberOfVisitors() {
        // 将在Part 4实现
        return 0;
    }

    @Override
    public void printRideHistory() {
        // 将在Part 4实现
    }

    @Override
    public void runOneCycle() {
        // 将在Part 5实现
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