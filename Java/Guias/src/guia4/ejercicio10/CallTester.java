package guia4.ejercicio10;

public class CallTester {
    public static void main(String[] args) {
        FriendCellPhoneBill my_bill = new FriendCellPhoneBill("4444-4444");
        my_bill.setDiscount(0.5);
        try {
            my_bill.addFriend("5555-5555");
            my_bill.addFriend("6666-6666");
        } catch (TooManyFriendsException | AlreadyExistsFriendException ex) {
            // No ocurre
        }
        my_bill.registerCall("5555-5555", 10);
        my_bill.registerCall("6666-5555", 10);
        System.out.println(my_bill.processBill());
        try {
            my_bill.addFriend("6666-6666");
        } catch (AlreadyExistsFriendException ex){
            System.out.println(ex.getMessage());
        } catch (TooManyFriendsException ex) {
            // No ocurre
        }
        try {
            my_bill.addFriend("4444-4444");
            my_bill.addFriend("7777-7777");
        } catch (TooManyFriendsException ex) {
            System.out.println(ex.getMessage());
        } catch (AlreadyExistsFriendException e) {
            // No ocurre
        }
        try {
            my_bill.removeFriend("5555-5555");
            my_bill.removeFriend("5555-5555");
        } catch (FriendNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
