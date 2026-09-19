package main.java.week7.class_problems;

class NameTag {

    private final String firstName; // Final fields for immutability[cite: 8]
    private final String lastNameInitial;

    public NameTag(String fullName) {
        String[] parts = fullName.split(" "); // Split once inside constructor[cite: 8]
        this.firstName = parts[0];
        this.lastNameInitial = parts[1].substring(0, 1) + ".";
    }

    public String getNickname() {
        return firstName + " " + lastNameInitial; // Formats first name + last name initial[cite: 8]
    }
}

public class NicknameTagMain {

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("tag.getNickname() -> \"" + tag.getNickname() + "\"");
    }
}
