package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/*
 * author: zsh
 * date: 11/23/2020 10:45 PM
 * description: 使用链表实现下压栈
 **/
public class DownTheStackByLinkedList<T> implements Iterable<T> {

    private int N = 0;
    private Node first;

    private class Node {
        T t;
        Node next;
    }

    public void push(T t) {
        Node oldFirst = first;
        first = new Node();
        first.t = t;
        first.next = oldFirst;
        N++;
    }

    public T pop() {
        T item = first.t;
        first = first.next;
        N--;
        return item;
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
        return new DownTheStackIterator();
    }

    // TODO test 1.3.24 删除一个结点的后续结点
    public void removeAfter (Node d) {
        if (d.t != null || d.next != null) d.next = null;
    }


    private class DownTheStackIterator implements Iterator<T> {
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
