import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Predicate;
public class LinkedList_And_ArrayList {
    public static void main(String[] args) {
        /*
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaaaaaaaaaa");
        pegarLista(arrayList);
         */

        //UserProfile2 userProfile2 = new UserProfile2();
        InnerClass innerClass = new InnerClass();
        InnerClass.UserProfile user = new InnerClass.UserProfile();
        user.run();
        new Thread(user)
                .start();
        Comparator<Integer> comparator = Integer::compareTo;
        int int1 = 6;
        int int2 = 6;
        System.out.println(comparator.compare(int1, int2));
        Predicate<Integer> predicate = (value) -> value % 2 == 1;
        List<Integer> listInteger = Arrays.asList(3, 5, 1, 4, 2);
        int result = listInteger.stream()
                .filter(value -> value % 2 == 1)
                .map(value -> value * 2)
                .sorted()
                .reduce(0, Integer::sum);
        System.out.println(result);
        //Stream<Integer> listStream = listInteger.stream();
        //Stream<Integer> listSorted = listStream.sorted();
        //Stream<Integer> listaMapped = listSorted.map(valor -> valor * 2);
        // System.out.println((int) listSorted.count());

//        listaMapped.forEach(valor -> System.out.println("valor = " + valor));
//        listInteger.forEach(valor -> System.out.println("valor = " + valor));
    }
    public static void pegarLista(@NotNull ArrayList<?> array) {
        array.forEach(System.out::println);
    }
}