package taller4.list;

public class ListTester
{
    public static void main(String[] args)
    {
        newList<Integer> integerList = new newArrayList<>() {
            @Override
            public boolean removeElement(Integer element) {
                return super.removeElement(element);
            }

            @Override
            public int size() {
                return 0;
            }
        };
        System.out.println(integerList.isEmpty()); // true
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        System.out.println(integerList.contains(3)); // 2
        System.out.println(integerList.remove(2)); // true
        System.out.println(integerList.contains(3)); // -1
        System.out.println(integerList.removeElement(1));
    }
}
