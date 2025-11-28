public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("Theme Park Visitor Management System Started");

        AssignmentTwo assignment = new AssignmentTwo();

        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        System.out.println("\n=== Part 3: Queue Implementation ===");

        // Create employees and rides
        Employee operator1 = new Employee("John Operator", 30, "john@themepark.com", "E001", "Ride Operations");
        Ride rollerCoaster = new Ride("Thunder Bolt", "Roller Coaster", operator1, 4);

        // Create visitors
        Visitor visitor1 = new Visitor("Alice", 25, "alice@email.com", "V001", "Premium");
        Visitor visitor2 = new Visitor("Bob", 30, "bob@email.com", "V002", "Standard");
        Visitor visitor3 = new Visitor("Charlie", 22, "charlie@email.com", "V003", "Standard");
        Visitor visitor4 = new Visitor("Diana", 28, "diana@email.com", "V004", "Premium");
        Visitor visitor5 = new Visitor("Eve", 35, "eve@email.com", "V005", "Standard");

        // Add visitors to queue
        System.out.println("\n--- Adding visitors to queue ---");
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print queue
        System.out.println("\n--- Printing queue ---");
        rollerCoaster.printQueue();

        // Remove a visitor
        System.out.println("\n--- Removing a visitor from queue ---");
        rollerCoaster.removeVisitorFromQueue();

        // Print queue again
        System.out.println("\n--- Printing queue after removal ---");
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        System.out.println("\n=== Part 4A: Ride History ===");
        // To be implemented
    }

    public void partFourB() {
        System.out.println("\n=== Part 4B: Sorting Ride History ===");
        // To be implemented
    }

    public void partFive() {
        System.out.println("\n=== Part 5: Run One Cycle ===");
        // To be implemented
    }

    public void partSix() {
        System.out.println("\n=== Part 6: Writing to File ===");
        // To be implemented
    }

    public void partSeven() {
        System.out.println("\n=== Part 7: Reading from File ===");
        // To be implemented
    }
}