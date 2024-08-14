package LinkedList.Example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StaticMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("apple","orange"));
        System.out.println(list);
        list.add("mango");
        list.addAll(List.of("grape","lime"));
        list.addFirst("banana");
        list.addLast("berry");
        list.addLast("pineapple");
        list.addLast("guava");
        list.addLast("watermelon");
        //list.clear();
        var list2 = list.clone(); // => return type Object
        System.out.println(list.element());
        list.forEach(System.out::println);
        System.out.println(list.get(2));
        System.out.println(list.getLast());
        System.out.println(list.indexOf("lime"));
        System.out.println(list.lastIndexOf("orange"));
        System.out.println(list.remove(2));
        System.out.println(list.remove("lime"));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.removeFirstOccurrence("mango"));
        System.out.println(list.removeLastOccurrence("berry"));
        System.out.println(list.isEmpty());
        System.out.println(list2.toString());
        System.out.println(Arrays.toString(list.toArray()));
        var iter = list.descendingIterator();
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        iter.forEachRemaining(System.out::println);
        var listIter = list.listIterator();
        System.out.println(listIter.hasNext());
        System.out.println(listIter.hasPrevious());
        System.out.println(listIter.next());
        System.out.println(listIter.previous());
        listIter.add("Pomegranate");
        System.out.println(listIter.previous());
        listIter.forEachRemaining(System.out::println);
        System.out.println(listIter.previous());
        listIter.remove(); // last element
        listIter.forEachRemaining(System.out::println);

        System.out.println(list.offer("litche"));
        System.out.println(list.offerFirst("strawberry"));
        System.out.println(list.offerLast("tomato"));

        System.out.println(list.peek()); // getFirst();
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll()); //Retrieves and removes the first item in the list
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        System.out.println(list.pop());
        list.push("mosambi");

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);
        numbers.removeIf( n -> n % 2 == 0 );
        System.out.println(numbers);

        list.removeAll(List.of("apple","grape","mango"));
        System.out.println(list.size());
        System.out.println(list.subList(0,3));
        var splitIter = list.spliterator();
        list.sort(String::compareTo);
        list.set(2,"cherry");

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        LinkedList<String> valid = new LinkedList<String>();
        valid.add("Volvo");
        valid.add("Ford");
        valid.add("Mazda");
        cars.retainAll(valid);
        System.out.println(cars);

        LinkedList<Integer> numbers2 = new LinkedList<Integer>();
        numbers2.add(5);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(6);
        numbers2.add(1);
        numbers2.replaceAll( n -> n + 1 );
        System.out.println(numbers2);
    }
}
