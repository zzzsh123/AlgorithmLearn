package today.zsh.chapter1.chapter1_3;

/*
 * author: zsh
 * date: 11/23/2020 10:45 PM
 * description: 使用链表实现下压栈
 **/
public class DownTheStackByLinkedList<T> {

    private int N = 0;
    private Node first;

    private class Node {
        public static final int N = 0;
        T t;
        Node next;
    }

    public void push(T t) {
        Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;
        N++;
    }

    public T pop(T t) {
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

}
