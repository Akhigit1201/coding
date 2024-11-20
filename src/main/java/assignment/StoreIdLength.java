package assignment;

public class StoreIdLength {

    public static void main(String args[]) {
        //Store ids are of 4 digit strings.if length of given storeId is less than 4 digits,
        // you need to prefix with zeros and return a 4 digit storeId.

        Store store = new Store("23");
        System.out.println(store);

        Store store1 = new Store("234");
        System.out.println(store1);

        Store store2 = new Store("1234");
        System.out.println(store2);
    }
}
