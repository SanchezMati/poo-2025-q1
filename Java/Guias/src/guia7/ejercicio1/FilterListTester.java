package guia7.ejercicio1;

public class FilterListTester {
    public static void main(String[] args) {
        FilterList<Integer> list = new ArrayFilterList<>();
        list.add(4);
        list.add(3);
        list.add(8);
        System.out.println(list.filter(obj -> obj % 2 == 0));
    }
}
