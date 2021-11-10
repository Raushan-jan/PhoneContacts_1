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
    public void setNewGroups(HashMap<String, List<Contacts>> newGroups) {
        this.newGroups = newGroups;
    }


}
