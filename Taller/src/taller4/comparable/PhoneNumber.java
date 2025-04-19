package taller4.comparable;

public class PhoneNumber implements Comparable<PhoneNumber> {

    private final int areaCode, prefix, lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int cmp = Integer.compare(areaCode, o.areaCode);
        if(cmp == 0) {
            cmp = Integer.compare(prefix, o.prefix);
            if(cmp == 0) {
                cmp = Integer.compare(lineNumber, o.lineNumber);
            }
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getPrefix() {
        return prefix;
    }
}