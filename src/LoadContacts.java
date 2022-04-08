import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoadContacts {
    String filename;
    String directory;
    List<String> Contacts;


    public LoadContacts(String filename, String directory) {
        this.filename = filename;
        this.directory = directory;
        this.Contacts = getFile();
    }

    // Create a function called getFile
    // Return the file data
    private List<String> getFile() {

        // Get our path info?
        Path directoryPath = Paths.get(directory); // could we move this somewhere else possibly?
        Path filePath = Paths.get(directory, filename);


        // Make sure the directory exists
        try {
            if(Files.notExists(directoryPath)) Files.createDirectories(directoryPath);
        } catch (IOException e) {
            System.out.println("Error creating directories " + directoryPath.getFileName());
            e.printStackTrace();
        }

        // Make sure the files exists
        try {
            if(Files.notExists(filePath)) Files.createFile(filePath);
        } catch (IOException e) {
            System.out.println("Error creating files " + filePath.getFileName());
            e.printStackTrace();
        }

        // If not create them (above)

        List<String> data = null;

        try {
            data = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error reading files " + filePath.getFileName());
            e.printStackTrace();
        }

        // Error Handling? added try catch around each potential IOException


        // readAllLines -> returns a List<String>
        return data;
    }

    // Way to print all the lines of the file so we can see its contents quickly
    public void printLines() {
        for (String line : Contacts) {
            System.out.println(line);
        }


    }


}
