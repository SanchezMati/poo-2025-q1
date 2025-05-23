package guia6.ejercicio2;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(10);


        System.out.println(list);

        //No se puede modificar una lista mientras la estoy recorriendo
//        for (Integer n: list){
//            if (n % 2 == 0){
//                list.remove(n);
//                System.out.println(list);
//                break;
//            }
//        }


        //Opcion 1:
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            if ( i % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(list);

        //Opcion 2:
        list.removeIf((x) -> x % 2 == 0);

        System.out.println(list);
    }
}
