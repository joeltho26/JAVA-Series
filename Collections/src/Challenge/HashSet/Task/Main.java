package Challenge.HashSet.Task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> annTasks = TaskData.getTask("ann");
        Set<Task> bobTasks = TaskData.getTask("bob");
        Set<Task> carolTasks = TaskData.getTask("carol");
        Comparator<Task> sortByStatus = Comparator.comparing(Task::getStatus);
        sortAndPrint("Ann tasks",annTasks,sortByStatus);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> tasks = TaskData.getTask("all");
        sortAndPrint("Bob tasks",bobTasks,sortByPriority);
        sortAndPrint("All tasks",tasks);

        List<Set<Task>> assignedTasks = List.of(annTasks, bobTasks, carolTasks);
        Set<Task> assignedTasksOfMembers = getUnion(assignedTasks);
        sortAndPrint("Assigned Tasks", assignedTasksOfMembers);

        Set<Task> everyTasks = getUnion(Arrays.asList(tasks,assignedTasksOfMembers));
        sortAndPrint("Every Tasks", everyTasks);

        Set<Task> missingTasks = getDifference(everyTasks,tasks);
        sortAndPrint("Missing Tasks", missingTasks);

        Set<Task> unassignedTasks = getDifference(tasks,assignedTasksOfMembers);
        sortAndPrint("Unassigned Tasks", unassignedTasks, sortByPriority);

        Set<Task> overlapAnnBob = getIntersect(annTasks,bobTasks);
        Set<Task> overlapBobCarol = getIntersect(bobTasks, carolTasks);
        Set<Task> overlapCarolAnn = getIntersect(carolTasks,annTasks);

        Set<Task> overlappingTasks = getUnion(List.of(overlapAnnBob,overlapBobCarol,overlapCarolAnn));
        sortAndPrint("Overlapping Tasks", overlappingTasks, sortByPriority);

        List<Task> overlapping = new ArrayList<>();
        for (Set<Task> set: assignedTasks) {
            Set<Task> dupes = getIntersect(set,overlappingTasks);
            overlapping.addAll(dupes);
        }

        Comparator<Task> priorityNatural = sortByPriority.thenComparing(Comparator.naturalOrder());
        sortAndPrint("Overlapping Tasks", overlapping, priorityNatural);

    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header,collection,null);
    }

    private static void sortAndPrint(String header,
                                     Collection<Task> collection,
                                     Comparator<Task> sorter) {
    String lineSeparator = "-".repeat(90);
    System.out.println(lineSeparator);
    System.out.println(header);
    System.out.println(lineSeparator);
        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    private static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> union = new HashSet<>();
        for (Set<Task> tasks: sets) {
            union.addAll(tasks);
        }
        return union;
    }

    private static Set<Task> getIntersect(Set<Task> a, Set<Task> b) {
        Set<Task> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        return intersect;
    }

    private static Set<Task> getDifference(Set<Task> a, Set<Task> b) {
        Set<Task> difference = new HashSet<>(a);
        difference.removeAll(b);
        return difference;

    }
}
