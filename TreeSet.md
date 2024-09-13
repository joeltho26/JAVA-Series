# TreeSet:
- TreeSet implements a dynamic set which means it can grow or shrink as required.
- Unlike an array, the elements cannot be accessed with index
- no duplicates allowed
- they are defined as ordered set
- its sorted collection, sorted by natural order of elements or by specifying the sort operation during the set creation
- uses BST
- Collection -> Set -> SortedSet (first(),last(),headSet(),tailSet(), Comparator) -> NavigableSet (ceiling(),floor(),higher(),lower(),descendingSet(), etc)
- relies on implementing comparable (natural order) or comparator methods (inside constructors)
