package guia3.ejercicio8;

public class FriendCellPhoneBill extends CellPhoneBill {
    private final String[] friends;
    private int friendsIndex;
    private double discount;
    private static final int FRIENDS_LIMIT = 3;

    FriendCellPhoneBill(String number) {
        super(number);
        friends = new String[FRIENDS_LIMIT];
        friendsIndex = 0;
        discount = 1;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void addFriend(String name) {
        if(friendsIndex != FRIENDS_LIMIT) {
            friends[friendsIndex++] = name;
        }
    }

    public void removeFriend(String name) {
        boolean found = false;
        for(int i = 0; i < friendsIndex && !found; i++) {
            if(friends[i].equals(name)) {
                friends[i] = friends[friendsIndex--];
            }
        }

    }

    private boolean containsFriend(String name) {
        for(int i = 0; i < friendsIndex; i++) {
            if(friends[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double processBill() {
        double total = 0;
        for (int i = 0; i < callsIndex; i++) {
            if (containsFriend(calls[i].getTo())) {
                total += calls[i].getCost() * discount;
            }
            else {
                total += calls[i].getCost();
            }
        }
        return total;
    }
}
