package guia3.ejercicio8;

public class CallTester {
    public static void main(String[] args) {
        FriendCellPhoneBill fcpb = new FriendCellPhoneBill("123");
        CellPhoneBill cpb = new CellPhoneBill("456");

        fcpb.setDiscount(0.5);

        fcpb.addFriend("456");
        fcpb.addFriend("789");
        fcpb.addFriend("101");

        fcpb.addFriend("666"); //No lo agrega porque ya llego al maximo de amigos

        fcpb.registerCall("456", 1000);
        fcpb.registerCall("789", 1000);
        fcpb.registerCall("101", 1000);
        fcpb.registerCall("666", 1000);
        
        System.out.println(fcpb.processBill());
        System.out.println(cpb.processBill()); //0.0

    }
}
