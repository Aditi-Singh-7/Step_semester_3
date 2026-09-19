package main.java.week7.assignment_problems;

class TrafficLight {

    private final String id; // Fixed ID[cite: 7]
    private String color; // Private color[cite: 7]

    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED"; // Default start color[cite: 7]
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color; // Read-only access[cite: 7]
    }

    public void next() {
        if (color.equals("RED")) { // Cycle logic: RED -> GREEN -> YELLOW -> RED[cite: 7]
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
        System.out.println("t.next() -> \"" + color + "\"");
    }
}

public class TrafficLightMain {

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("t.getColor() -> \"" + t.getColor() + "\"");
        t.next();
        t.next();
        t.next();
    }
}
