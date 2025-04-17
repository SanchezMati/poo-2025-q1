package ferryPort;

public class FerryCompany {
    private final String name;

    public FerryCompany(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
