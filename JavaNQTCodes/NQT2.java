import java.util.*;

public class NQT2 {

    public static void main(String[] args) {
        // Log of people entering and exiting in order
        List<String> logs = Arrays.asList(
            "Alice", "Bob", "Charlie",
            "Alice", "Charlie","Bob"
            // Bob never exits
        );

        List<String> insidePeople = getPeopleStillInside(logs);

        if (insidePeople.isEmpty()) {
            System.out.println("No one is inside. Shop can be closed.");
        } else {
            System.out.println("People still inside the shop: " + insidePeople);
        }
    }

    // Core logic using HashMap to track toggle entries
    public static List<String> getPeopleStillInside(List<String> logs) {
        Map<String, Integer> entryCount = new HashMap<>();

        for (String name : logs) {
            entryCount.put(name, entryCount.getOrDefault(name, 0) + 1);
        }

        List<String> stillInside = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryCount.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                stillInside.add(entry.getKey());
            }
        }

        return stillInside;
    }
}
