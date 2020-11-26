package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/*
 * author: zsh
 * date: 11/24/2020 10:41 PM
 * description: 使用链表实现队列
 **/
public class QueueByLinkedList<T> implements Iterable<T> {

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
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    // TODO test 1.3.25
    public void insertAfter (Node f, Node s) {
        if (f != null && s != null) {
            Node oldLast = last;
            last = new Node();
            last.t = f.t;
            last.next = s;
        }
    }

    // TODO test 1.3.26
    public void remove (QueueByLinkedList<T> q,String s) {
        Iterator<T> iterator = q.iterator();
        Node current = first;
        Node last = current;
        while (iterator.hasNext()) {
            T t = current.t;
            if (s.equals(t)) {
                last.next = current.next.next;
            }
            last = current;
            current = current.next;
        }
    }

    // TODO test 1.3.27
    public int max (QueueByLinkedList<Integer> q) {
        Iterator<Integer> iterator = q.iterator();
        int temp = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > temp) temp = next;
        }
        return temp;
    }

    /**
     * @author: zsh
     * @date: 11/24/2020 10:50 PM
     * @param: [t]
     * @return: void
     * @description: 删除表头元素
    **/
    public T dequeue() {
        T oldFirst = first.t;
        first = first.next;
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
