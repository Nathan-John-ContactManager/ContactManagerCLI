import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactsTest {
    public static void main(String[] args) {
        Path contactsPath = Paths.get("data", "contacts.txt");
        Path contactsDirectory = Paths.get("data");


        List<String> fileData = null;


        try {
            if (Files.notExists(contactsDirectory)) Files.createDirectories(contactsDirectory);
            if (Files.notExists(contactsPath)) Files.createFile(contactsPath);
            fileData = Files.readAllLines(contactsPath);

        } catch (IOException e) {
            System.out.println("Trashhhh");
        }


        for (String line : fileData) {
            System.out.println(line);
        }
//        try {
//            fileData.add("Whats up");
//            Files.write(contactsPath, fileData);
//        } catch (IOException e) {
//            System.out.println("Trashhhh");
        }
    }

