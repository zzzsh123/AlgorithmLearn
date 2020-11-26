package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/*
 * author: zsh
 * date: 11/25/2020 9:38 PM
 * description: 双向链表
 * methods: 添加元素到头/尾、删除头/尾部单个元素、返回链表大小、判断链表是否为空、
 **/
// TODO 1.3.31 实现双向链表
public class DoubleLinkedList<T> implements Iterable<T> {

    private Node first;
    private Node last;
    private int N;

    /**
     * @author: zsh
     * @param: []
     * @return: void
     * @description: 初始化方法
     * @date: 11/26/2020 5:12 PM
    **/
    public void DoubleLinkedList() {
        first.pre = null;
        first.next = null;
    }

    /**
     * @author: zsh
     * @param: []
     * @return: int
     * @description: 返回链表长度
     * @date: 11/26/2020 5:12 PM
    **/
    public int size() {
        return N;
    }

    /**
     * @author: zsh
     * @param: []
     * @return: boolean
     * @description: 判断链表是否为空
     * @date: 11/26/2020 5:12 PM
    **/
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * @author: zsh
     * @date: 11/26/2020 3:31 PM
     * @param: [t]
     * @return: void
     * @description: 向链表头添加元素
    **/
    public void headInsert(T t) {
        if (isEmpty()) {
            throw new NullPointerException("链表中还没有元素");
        }
        Node oldFirst;
        oldFirst = first;
        first = new Node();
        first.t = t;
        first.next = oldFirst;
        this.N++;
    }

    /**
     * @author: zsh
     * @date: 11/26/2020 3:31 PM
     * @param: []
     * @return: void
     * @description: 删除链表第一个元素
    **/
    public void headDe() {
        if (isEmpty()) {
            throw new NullPointerException("链表中还没有元素");
        }else if (N == 1) {
            clearNode(first);
            clearNode(last);
            this.N--;
        }else {
            Node newFirst;
            newFirst = first.next;
            first.t = null;
            first = new Node();
            first = newFirst;
            first.pre = null;
            this.N--;
        }

    }

    /**
     * @author: zsh
     * @date: 11/26/2020 3:30 PM
     * @param: [t]
     * @return: void
     * @description: 添加元素到链表尾部
    **/
    public void lastInsert(T t) {
        if (isEmpty()) {
            throw new NullPointerException("链表中还没有元素");
        }else if (N == 1) {
            Node newNode = new Node();
            newNode.t = t;
            first.next = newNode;
            first = newNode;
            this.N++;
        }else {
            Node oldLast;
            oldLast = last;
            last = new Node();
            last.pre = oldLast;
            last.next = null;
            this.N++;
        }
    }

    /**
     * @author: zsh
     * @date: 11/26/2020 3:30 PM
     * @param: []
     * @return: void
     * @description: 删除结尾结点
    **/
    public void lastDe() {
        if (isEmpty()) {
            throw new NullPointerException("链表中还没有元素");
        }else if (N == 1) {
            clearNode(first);
            clearNode(last);
            this.N--;
        }else {
            Node pre = last.pre;
            last.t = null;
            last.pre = null;
            pre.next = null;
            last = pre;
            this.N--;
        }
    }

    /**
     * @author: zsh
     * @param: [target, t]
     * @return: boolean
     * @description: 在元素 target 前插入元素t
     * @date: 11/26/2020 4:44 PM
    **/
    public boolean addBefore (T target, T t) {
        if (target == null || t == null) {
            throw new NullPointerException();
        }
        Node node = getNodeByT(target);
        Node pre = node.pre;
        Node td = new Node();
        td.t = t;
        pre.next = td;
        td.pre = pre;
        td.next = node;
        node.pre = td;
        this.N++;
        return true;
    }

    /**
     * @author: zsh
     * @param: [target, t]
     * @return: boolean
     * @description: 在 target 元素后面插入元素 t
     * @date: 11/26/2020 5:06 PM
    **/
    public boolean addAfter(T target,T t ) {
        if (target == null || t == null) {
            throw new NullPointerException();
        }else {
            Node node = getNodeByT(target);
            Node next = node.next;
            Node td = new Node();
            td.t = t;
            node.next = td;
            td.pre = node;
            td.next = next;
            next.pre = td;
            this.N++;
        }
        return false;
    }

    /**
     * @author: zsh
     * @param: [i]
     * @return: boolean
     * @description: 根据下标删除链表中元素
     * @date: 11/26/2020 5:25 PM
    **/
    public boolean deByIndex (int i) {
        // getNodeByIndex方法中判断了i
        Node nodeByIndex = getNodeByIndex(i);
        Node pre = nodeByIndex.pre;
        Node next = nodeByIndex.next;
        clearNode(nodeByIndex);
        pre.next = next;
        next.pre = pre;
        this.N--;
        return false;
    }

    /**
     * @author: zsh
     * @param: [node]
     * @return: void
     * @description: 使node对象中所有元素为null
     * @date: 11/26/2020 5:10 PM
    **/
    private void clearNode (Node node) {
        node.t = null;
        node.pre = null;
        node.next = null;
    }

    /**
     * @author: zsh
     * @param: [index]
     * @return: today.zsh.chapter1.chapter1_3.DoubleLinkedList<T>.Node
     * @description: 根据参数标返回Node
     * @date: 11/26/2020 4:25 PM
     **/
    public Node getNodeByT (T t) {
        if (t == null) throw new NullPointerException();
        Node current = first;
        for (int i = 0; i < N && current != null; i++, current = current.next) {
            if (t == current.t) {
                return current;
            }
        }
        return new Node();
    }

    /**
     * @author: zsh
     * @param: [index]
     * @return: today.zsh.chapter1.chapter1_3.DoubleLinkedList<T>.Node
     * @description: 根据下标返回Node
     * @date: 11/26/2020 4:25 PM
    **/
    public Node getNodeByIndex (int index) {
        if (index < 0 || index > N)  throw new IndexOutOfBoundsException("下标越界");
        Node current = first;
        if (index > N / 2) {
            for (int i = 0; i <= N / 2 && current != null; i++, current = current.next) {
                if (i == index) {
                    return current;
                }
            }
        }else {
            for (int i = N - 1; i > N / 2 && current != null; i--, current = current.next) {
                if (i == index) {
                    return current;
                }
            }
        }
        return new Node();
    }

    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkedListIterator();
    }

    private class DoubleLinkedListIterator implements Iterator<T> {

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

    private class Node {
        // previous
        Node pre;
        Node next;
        T t;
    }

}
