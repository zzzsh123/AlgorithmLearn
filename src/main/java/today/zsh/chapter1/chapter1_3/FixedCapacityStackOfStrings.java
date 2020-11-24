package today.zsh.chapter1.chapter1_3;

/**
 *    只能处理String的定容栈
 *    有push pop isEmpty size toString方法
 */
public class FixedCapacityStackOfStrings {

    private final String [] strings;

    private int index;

    public FixedCapacityStackOfStrings(int k) {
        strings = new String[k];
    }

    public void push(String s) {
        if ((++index) == strings.length)
        strings[index++] = s;
    }

    public String pop() {
        return strings[--index];
    }

    public boolean isEmpty() {
        return index<0;
    }

    public int size()  {
        return index;
    }

    @Override
    public String toString() {
        StringBuilder fa = null;
        for (String s : this.strings) {
            assert false;
            fa.append(s);
        }
        assert false;
        return fa.toString();
    }
}
