package java_26_optional;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        System.out.println(addressBook.findNameByAddress("Kraków Polna 11"));
        System.out.println(addressBook.findNameByAddress("Kraków lllPolna 11"));
        System.out.println(addressBook.findAddressByName("Jan Kowalski"));
        System.out.println(addressBook.findAddressByName("Jan Kowalgggski"));
    }
}
