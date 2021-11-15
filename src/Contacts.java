import java.util.Objects;

public class Contacts implements Comparable<Contacts> {
    private String name;
    private  String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public void add(){

    }
    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return Objects.equals(name, contacts.name) && Objects.equals(number, contacts.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


    @Override
    public int compareTo(Contacts o) {
        return name.compareTo(o.name);
    }
}