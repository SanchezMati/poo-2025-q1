package taller4.comparable;

import java.util.Comparator;

public class DescendingPhoneNumberComparator implements Comparator<PhoneNumber> {

    @Override
    public int compare(PhoneNumber o1, PhoneNumber o2) {
        return o1.compareTo(o2) * -1;
    }
}
