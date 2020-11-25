package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/**
 * 使用泛型能存储基本数据类型和自定义数据类型的定容栈
 * 并且实现了Iterable 接口 可以利用hasNext next去遍历栈中的元素
 *
 * @param <T>
 */
public class FixedCapacityStack<T> implements Iterable<T> {

    private T[] Ts;

    private T peek = null;

    private int index;

    public FixedCapacityStack(int k) {
        Ts = (T[]) new Object[k];
    }

    public void push(T s) {
        peek = s;
        if ((++index) == Ts.length) resize((int) (Ts.length * 1.5));
        Ts[index++] =  s;
    }

    public  void resize(int max) {
        T[] temp = (T[]) new Object[max];
        if (index >= 0) System.arraycopy(Ts, 0, temp, 0, index);
        Ts = temp;
    }

    public T pop() {
        T item = Ts[--index];
        Ts[index] = null;
        if (index == Ts.length / 4 && index > 0) resize((int) (Ts.length / 2));
        return item;
    }

    public boolean isEmpty() {
        return index<0;
    }

    public int size()  {
        return index;
    }

    // TODO 1.3.1 练习题
    public boolean isFull() {
        return index == Ts.length;
    }

    // TODO 1.3.7 练习题
    public T peek() {
        return peek;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0;i < index;i++) {
            T t = Ts[i];
            s = s + t;
        }
        return s;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {

        private int i = index;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return Ts[--i];
        }

        @Override
        public void remove() {

        }
    }
}
