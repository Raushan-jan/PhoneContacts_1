import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа спровчник");
        PhoneContacts phoneContacts = new PhoneContacts();

        System.out.println("Ведите название группы контактов");
        while (true) {
            String nameNewGroup = scanner.next();
            if (nameNewGroup.equals("нет")) {
                break;
            } else {
                phoneContacts.createGroup(nameNewGroup);
                System.out.println("Создать еще одну группу (введите название или введите нет)?");
            }
        }
        phoneContacts.showNameCreateGroup();

        while (true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String nameContacts = scanner.next();
            String nameNumber = scanner.nextLine();
            if (nameContacts.equals("нет")) {
                break;
            } else {
                Contacts contacts = new Contacts(nameContacts, nameNumber);
                System.out.println("Укажите группы контакта через пробел");
                String[] x1 = scanner.nextLine().split(" ");
                phoneContacts.createNewContact(contacts, x1);
            }
            System.out.println("Группы: ");
            phoneContacts.creatNewContactAndAddInGroup();
            phoneContacts.printSortedContacts();
        }
    }
}
