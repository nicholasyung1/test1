import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddressBook {

    private HashMap <String, BuddyInfo> book;

    public AddressBook(){
        book = new HashMap <> ();
            }


    public void addBuddy(String name, BuddyInfo buddy){
        book.put(name, buddy);
    }

    public void removeBuddy(String name){
        book.remove(name);
    }

    public BuddyInfo getbuddy(String name){
        return book.get(name);
    }

    public static void main(String[] args) {
        System.out.println("Address book");

    }

}
