public class ContactsTest {
    public static void main(String[] args) {
        LoadContacts test1 = new LoadContacts("contacts.txt","data");
        System.out.print(String.valueOf(test1.Contacts));
    }
}
