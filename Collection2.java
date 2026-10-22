package AGCCollectionFramework;

public interface Collection2 {

    void clear();

    boolean add(object obj);

    boolean addAll(Collection2 c);

    void clear();

    boolean contains(object obj);

    boolean containsAll(Collection2 c);

    boolean equals(object obj);

    int hashCode();

    boolean isEmpty();

    void iterator();

    boolean remove(object obj);

    boolean removeAll(Collection2 c);

    boolean removeAll(Collection2 c);

    int Size();

    object[] toArray();

    object[] toArray(object[] array1);
}