package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/*
 * author: zsh
 * date: 11/25/2020 9:29 PM
 * description: 环形链表
 **/
public class CircularLinkedList<T> implements Iterable<T> {

    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty () {
        return first == null;
    }
    public int size () {
        return N;
    }

    /**
     * @author: zsh
     * @date: 11/24/2020 10:47 PM
     * @param: [t]
     * @return: void
     * @description: 向表尾插入元素
     **/
    public void enqueue(T t) {
        Node oldLast = last;
        last = new Node();
        last.t = t;
        last.next = first;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    /**
     * @author: zsh
     * @date: 11/25/2020 9:36 PM
     * @param: []
     * @return: T
     * @description: 删除表头元素
    **/
    public T dequeue() {
        T oldFirst = first.t;
        first = first.next;
        last.next = first;
        if (isEmpty()) last = null;
        N--;
        return oldFirst;
    }

    private class Node {
        T t;
        Node next;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {

        private Node current = first;

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
