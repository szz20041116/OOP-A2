import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First comparison: by name (alphabetical order)
        int nameComparison = v1.getName().compareToIgnoreCase(v2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        // Second comparison: by age (younger first)
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}