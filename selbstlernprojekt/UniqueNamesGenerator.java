package selbstlernprojekt;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniqueNamesGenerator {
    public static void main(String[] args) {
        List<String> firstNames = List.of("Max", "Alexander", "Paul", "Lukas", "Jonas", "Felix", "David", "Emil", "Luis", "Noah",
                "Mia", "Emma", "Hannah", "Sophia", "Anna", "Emilia", "Lina", "Marie", "Lena", "Leonie");
        List<String> lastNames = List.of("Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Meyer", "Wagner", "Becker", "Schulz", "Hoffmann",
                "Schäfer", "Koch", "Bauer", "Richter", "Klein", "Wolf", "Schröder", "Neumann", "Schwarz", "Zimmermann");

        Set<String> generatedNames = new HashSet<>();
        Random random = new Random();

        while (generatedNames.size() < 50000) {
            String firstName = firstNames.get(random.nextInt(firstNames.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));
            String fullName = firstName + " " + lastName;

            // Überprüfen, ob der generierte Name bereits existiert
            if (!generatedNames.contains(fullName)) {
                generatedNames.add(fullName);
                String email = generateEmail(firstName, lastName, random);
                System.out.println(fullName + " - " + email);
                System.out.println("Absatz...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("_______________________");
            }
        }
    }

    private static String generateEmail(String firstName, String lastName, Random random) {
        int randomNumber = 1000 + random.nextInt(999); // Erzeugt eine Zufallszahl zwischen 1000 und 9999
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + randomNumber + "@gmail.com";
    }
}
