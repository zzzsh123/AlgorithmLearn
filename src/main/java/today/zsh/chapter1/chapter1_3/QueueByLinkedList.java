package today.zsh.chapter1.chapter1_3;

/*
 * author: zsh
 * date: 11/24/2020 10:41 PM
 * description: 使用链表实现队列
 **/
public class QueueByLinkedList<T> {

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
}
