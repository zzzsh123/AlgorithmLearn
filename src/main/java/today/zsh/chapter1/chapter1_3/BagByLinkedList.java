package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/*
 * author: zsh
 * date: 11/24/2020 11:02 PM
 * description: 使用链表实现bag
 **/
public class BagByLinkedList<T> implements Iterable<T> {

    private int N = 0;
    private Node first;

    private class Node {
        T t;
        Node next;
    }

    public void add(T t) {
        Node oldFirst = first;
        first = new Node();
        first.t = t;
        first.next = oldFirst;
        N++;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public T top() {
        return first.t;
    }


    // 实现 下压栈的迭代
    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<T> {
        private Node current=first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T t = current.t;
            current = current.next;
            return t;
        }

        @Override
        public void remove() {

        }
    }
}
