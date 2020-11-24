package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/**
 * 下压栈（Last In First Out----LIFO） 能够动态调整数组大小的实现
 * @param <T>
 */
public class ResizingArrayStack<T> implements Iterable<T> {

    private int N = 0;

    private T[] Ts = (T[]) new Object[1];

    private void resize(int k) {
        T[] temp = (T[]) new java.lang.Object[k];
        for (int i = 0;i < N;i++) {
            temp[i] = Ts[i];
        }
        Ts = temp;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(T t) {
        if (N == Ts.length) resize(Ts.length * 2);
        Ts[N++] = t;
    }

    public T pop() {
        System.out.println(N + " N ----");
        T t = Ts[--N];
        Ts[N] = null;
        if (N == Ts.length / 4 && N > 0) resize(Ts.length / 2);
        return t;
    }


    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {

        private int i = N;

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
