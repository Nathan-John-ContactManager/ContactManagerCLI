import java.io.BufferedReader;
import java.io.FileReader;

public class contacts {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/johncastro/IdeaProjects/ContactManagerCLI/data/contacts.txt");
            BufferedReader br = new BufferedReader(fr);

            int i;
            while((i = br.read())!=-1){
                System.out.print((char)i);
            }
            br.close();
            fr.close();
        }
        catch(Exception ex){
            return;
        }
        try {
            FileReader fr = new FileReader("/Users/nathanhaustveit/IdeaProjects/ContactManagerCLI/data/contacts.txt");
            BufferedReader br = new BufferedReader(fr);

            int i;
            while((i = br.read())!=-1){
                System.out.print((char)i);
            }
            br.close();
            fr.close();
        } catch(Exception ex){
            return;
        }
    }
}
