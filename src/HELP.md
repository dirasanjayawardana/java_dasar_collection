# Collection
Collection atau disebut juga container adalah object berisi kumpulan data, mirip seperti array, namun terdapat beberapa method yang bisa dimanfaatkan untuk melakukan manipulasi data.

## Java Collection Interface
dibagi manjadi 2, yaitu Iterable dan Map

### Iterable (satu kumpulan data berurut dengan index)
- Set
- List
- Queue
- dll

### Map (kumpulan data dengan key dan value)
- Map
- SortedMap
- ConcureMap
- NavigableMap
- dll

## Beberapa Method di Java Collection
- size(): int
- isEmpty(): boolean
- contains(Object): boolean
- toArray(): Object[]
- toArray(T[]): T[]
- add(E): boolean
- remove(Object): boolean
- containsAll(Collection<?>): boolean
- addAll(Collection<? extends E>): boolean
- removeAll(Collection<? extends E>): boolean
- removeIf(Predicate<? super E>): boolean
- retainAll(Collection<?>): boolean
- clear(): void
- stream(): Stream<E>
- parallelStream(): Stream<E>
