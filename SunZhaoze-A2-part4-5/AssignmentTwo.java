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

        // Create employees and rides
        Employee operator2 = new Employee("Sarah Manager", 28, "sarah@themepark.com", "E002", "Ride Operations");
        Ride waterRide = new Ride("Splash Mountain", "Water Ride", operator2, 6);

        // Create visitors
        Visitor visitor6 = new Visitor("Frank", 40, "frank@email.com", "V006", "Standard");
        Visitor visitor7 = new Visitor("Grace", 19, "grace@email.com", "V007", "Student");
        Visitor visitor8 = new Visitor("Henry", 32, "henry@email.com", "V008", "Premium");
        Visitor visitor9 = new Visitor("Ivy", 27, "ivy@email.com", "V009", "Standard");
        Visitor visitor10 = new Visitor("Jack", 45, "jack@email.com", "V010", "Premium");

        // Add visitors to history
        System.out.println("\n--- Adding visitors to ride history ---");
        waterRide.addVisitorToHistory(visitor6);
        waterRide.addVisitorToHistory(visitor7);
        waterRide.addVisitorToHistory(visitor8);
        waterRide.addVisitorToHistory(visitor9);
        waterRide.addVisitorToHistory(visitor10);

        // Check if visitor is in history
        System.out.println("\n--- Checking visitor in history ---");
        waterRide.checkVisitorFromHistory(visitor8);

        Visitor unknownVisitor = new Visitor("Unknown", 0, "unknown@email.com", "V999", "Standard");
        waterRide.checkVisitorFromHistory(unknownVisitor);

        // Print number of visitors
        System.out.println("\n--- Number of visitors in history ---");
        waterRide.numberOfVisitors();

        // Print ride history using Iterator
        System.out.println("\n--- Printing ride history with Iterator ---");
        waterRide.printRideHistory();
    }

    public void partFourB() {
        System.out.println("\n=== Part 4B: Sorting Ride History ===");

        // Create employees and rides
        Employee operator3 = new Employee("Mike Technician", 35, "mike@themepark.com", "E003", "Ride Operations");
        Ride ferrisWheel = new Ride("Sky Wheel", "Ferris Wheel", operator3, 8);

        // Create visitors with different names and ages for sorting demonstration
        Visitor visitor11 = new Visitor("Zack", 25, "zack@email.com", "V011", "Standard");
        Visitor visitor12 = new Visitor("Alice", 30, "alice2@email.com", "V012", "Premium");
        Visitor visitor13 = new Visitor("Charlie", 22, "charlie2@email.com", "V013", "Standard");
        Visitor visitor14 = new Visitor("Alice", 25, "alice3@email.com", "V014", "Standard");
        Visitor visitor15 = new Visitor("Bob", 35, "bob2@email.com", "V015", "Premium");

        // Add visitors to history
        System.out.println("\n--- Adding visitors to ride history ---");
        ferrisWheel.addVisitorToHistory(visitor11);
        ferrisWheel.addVisitorToHistory(visitor12);
        ferrisWheel.addVisitorToHistory(visitor13);
        ferrisWheel.addVisitorToHistory(visitor14);
        ferrisWheel.addVisitorToHistory(visitor15);

        // Print unsorted history
        System.out.println("\n--- Printing UNSORTED ride history ---");
        ferrisWheel.printRideHistory();

        // Sort the history
        System.out.println("\n--- Sorting ride history ---");
        ferrisWheel.sortRideHistory();

        // Print sorted history
        System.out.println("\n--- Printing SORTED ride history ---");
        ferrisWheel.printRideHistory();
    }

    public void partFive() {
        System.out.println("\n=== Part 5: Run One Cycle ===");

        // Create employees and rides
        Employee operator4 = new Employee("Lisa Controller", 29, "lisa@themepark.com", "E004", "Ride Operations");
        Ride carousel = new Ride("Magic Carousel", "Carousel", operator4, 3);

        // Create multiple visitors
        System.out.println("\n--- Creating and adding visitors to queue ---");
        for (int i = 1; i <= 10; i++) {
            Visitor visitor = new Visitor("Visitor" + i, 20 + i, "visitor" + i + "@email.com", "V10" + i, "Standard");
            carousel.addVisitorToQueue(visitor);
        }

        // Print queue before running cycle
        System.out.println("\n--- Queue before running cycle ---");
        carousel.printQueue();

        // Run one cycle
        System.out.println("\n--- Running one cycle ---");
        carousel.runOneCycle();

        // Print queue after running cycle
        System.out.println("\n--- Queue after running cycle ---");
        carousel.printQueue();

        // Print ride history
        System.out.println("\n--- Ride history after one cycle ---");
        carousel.printRideHistory();

        // Run another cycle to demonstrate multiple cycles
        System.out.println("\n--- Running second cycle ---");
        carousel.runOneCycle();

        System.out.println("\n--- Final queue status ---");
        carousel.printQueue();

        System.out.println("\n--- Final ride history ---");
        carousel.printRideHistory();
    }

    public void partSix() {
        System.out.println("\n=== Part 6: Writing to File ===");
        // To be implemented in next part
    }

    public void partSeven() {
        System.out.println("\n=== Part 7: Reading from File ===");
        // To be implemented in next part
    }
}