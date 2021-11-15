import java.util.*;

public class PhoneContacts {

    private HashMap<String, List<Contacts>> newGroups = new HashMap<>();

    public void createGroup(String s) {
        if (!newGroups.containsKey(s))
            newGroups.put(s, new ArrayList<>());
    }


    public void createNewContact(Contacts contacts, String[] x) {
        for (String s : x) {
            if (newGroups.containsKey(s)) {
                newGroups.get(s).add(contacts);
            }
        }
        System.out.println(newGroups);
    }

    public void showNameCreateGroup() {
        for (Map.Entry<String, List<Contacts>> entry : newGroups.entrySet()) {
            System.out.println(entry.getKey());
        }
    }


    public void creatNewContactAndAddInGroup() {
        for (Map.Entry<String, List<Contacts>> entry : newGroups.entrySet()) {
            System.out.println(" " + entry.getKey());
            for (Contacts contacts : entry.getValue()) {
                System.out.println(contacts.toString());
            }
        }
    }

    public void printSortedContacts() {
        List<Contacts> contacts = new ArrayList<>();
        for (Map.Entry<String, List<Contacts>> entry : newGroups.entrySet()) {
            for (Contacts contact : entry.getValue()) {
                if (!contacts.contains(contact)) {
                    contacts.add(contact);
                }
            }
        }
        contacts.sort(Comparator.naturalOrder());
        for (Contacts contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}
