public class BuddyInfo {

    public BuddyInfo(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private int phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "1125 Colonel By Dr", 1234567890);

        System.out.println("Address book");

        System.out.println("Hello " + buddy.name +
                "\n Address: " + buddy.address +
                "\n Phone number: " + buddy.phoneNumber);

    }
}
