package Example.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        List<String> list = new ArrayList<>();
        String[] names = {"Anna","Rob","Carol","David","Edna"};
        list.addAll(List.of(names));
        list.addFirst("Kenny");
        list.addLast("Laura");
        System.out.println(list);

        list.add("Luna");
        System.out.println(list);

        list.addAll(Arrays.asList("George","Mary","John"));
        System.out.println(list);
        System.out.println(list.contains("Mary"));

        System.out.println(list.removeIf(s -> s.contains("Mary")));
        System.out.println(list);

        //LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.addAll(List.of(names));
        linkedlist.addFirst("Kenny");
        linkedlist.addLast("Laura");
        System.out.println(linkedlist);
        System.out.println(linkedlist.pop());
        System.out.println(linkedlist.peekLast());
        System.out.println(linkedlist.element());
        System.out.println(linkedlist.pollLast());

        //TreeSet
        Collection<String> treeset = new TreeSet<>();
        treeset.addAll(Arrays.asList(names));
        treeset.add("Kenny");
        System.out.println(treeset);

        //HashSet
        HashSet<String> hashset = new HashSet<>();
        hashset.addAll(Arrays.asList(names));
        hashset.add("Kenny");
        System.out.println(hashset);

        //ArrayDeque
        var arraydeque = new ArrayDeque<>();
        arraydeque.addAll(Arrays.asList(names));
        arraydeque.addFirst("Kenny");
        arraydeque.addLast("Laura");
        System.out.println(arraydeque);
        System.out.println(arraydeque.pop());
        System.out.println(arraydeque.peek());
        System.out.println(arraydeque.element());
        System.out.println(arraydeque.poll());

        //LinkedHashSet
//        HashSet<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names));
        System.out.println(linkedHashSet);

    }
}
