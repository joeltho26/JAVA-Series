package ArrayList.ArrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListStaticMethods {
    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);

        var arrayListString = new ArrayList<StringBuilder>();
        arrayListString.add(new StringBuilder("Hello"));
        System.out.println(arrayListString);

        var arrayList2 = new ArrayList<Integer>();
        System.out.println(arrayList2.size());

        var arrayList3 = new ArrayList<Integer>();
        arrayList3.add(5);
        arrayList3.add(10);
        arrayList3.add(15);
        arrayList3.addAll(1, arrayList);
        System.out.println(arrayList3);

        arrayList.clear();
        System.out.println(arrayList);

        var arrayList4 = arrayList3.clone();
        System.out.println(arrayList4);

        if (arrayList3.contains(1)) {
            System.out.println("Existing");
        } else {
            System.out.println("Not existing");
        }

        arrayList3.ensureCapacity(5);
        arrayList3.forEach((number) -> System.out.printf("%d ",number));
        System.out.println();
        System.out.println(arrayList3.get(0));
        System.out.println(arrayList3.indexOf(10));
        System.out.println(arrayList3.isEmpty());
        arrayList3.add(2);
        System.out.println(arrayList3.getFirst());
        arrayList2.addAll(0,arrayList3);
        arrayList2.addAll(0,List.of(8,9,4));
        var value = arrayList2.iterator();
        System.out.println(value.next());
        System.out.println(value.hasNext());
        value.remove();
        value.forEachRemaining(number -> System.out.printf("%d ",number));
        System.out.println();
        System.out.println(value.equals(arrayList2));
        System.out.println(arrayList3.lastIndexOf(2));
        System.out.println(arrayList2.listIterator().next());
        arrayList3.removeAll(arrayList2);
        System.out.println(arrayList3);
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(10);
        var arrayList5 = new ArrayList<> (List.of("banana","grape","orange"));
        arrayList5.remove(2);
        arrayList5.remove("banana");
        System.out.println(arrayList5);
        arrayList5.remove(0);
        System.out.println(arrayList5);
        arrayList3.removeIf(n -> n>5);
        System.out.println(arrayList3);
        arrayList3.replaceAll(n -> n*2);
        System.out.println(arrayList3);
        arrayList3.retainAll(arrayList2);
        System.out.println(arrayList3);
        arrayList3.set(1,5);
        System.out.println(arrayList3);
        arrayList3.add(25);
        arrayList3.add(2);
        arrayList3.add(13);
        System.out.println(arrayList3);

        arrayList3.sort(Integer::compareTo);
        arrayList3.sort((a,b) -> a.compareTo(b));
        System.out.println(arrayList3);
        Collections.sort(arrayList2);
        System.out.println(arrayList2);
        Collections.sort(arrayList2, Collections.reverseOrder());
        System.out.println(arrayList2);
        Collections.sort(arrayList2, Comparator.naturalOrder()); // orders first uppercase & then lowercase as per ascii
        System.out.println(arrayList2);

        var data = arrayList2.spliterator();
        System.out.println(data.estimateSize());
//        System.out.println(data.getComparator());
        System.out.println(data.characteristics());
        System.out.println(data.getExactSizeIfKnown());
        System.out.println(data.hasCharacteristics(16464));

        // https://stackoverflow.com/questions/51453841/difference-between-iterator-and-spliterator-in-java8
        var valueData = data.trySplit(); //used to split the iterator for parallel processing.
        valueData.forEachRemaining(System.out::print);
        System.out.println();
        data.forEachRemaining(System.out::print);

        System.out.println();
        var data2 = arrayList2.spliterator();
        data2.tryAdvance(System.out::print); // similar to next()/hasNext()
        System.out.println();
        data2.forEachRemaining(System.out::print);
        System.out.println();
        System.out.println(arrayList3.subList(0,3));

        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Object[] carsArray = cars.toArray();
        for(Object item : carsArray) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        arrayList3.trimToSize(); //Reduce the capacity of the list to match the number of items
        System.out.println(cars);
    }
}
