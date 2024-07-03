package dirapp.collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue<E> {
    
    // jika ingin membuat collection manual, bisa menggunakan abstract class yang sudah disediakan
    // AbstractCollection --> untuk membuat collection
    // AbstractList --> untuk membuat List
    // AbstractMap --> untuk membuat Map
    // AbstractQueue --> untuk membuat Queue
    // AbstractSet --> untuk membuat Set

    private E data;

    @Override
    public Iterator<E> iterator() {
      return Collections.singleton(data).iterator();
    }
  
    @Override
    public int size() {
      return data == null ? 0 : 1;
    }
  
    @Override
    public boolean offer(E e) {
      if (data == null) {
        data = e;
        return true;
      }
      return false;
    }
  
    @Override
    public E poll() {
      E temp = data;
      data = null;
      return temp;
    }
  
    @Override
    public E peek() {
      return data;
    }
}
