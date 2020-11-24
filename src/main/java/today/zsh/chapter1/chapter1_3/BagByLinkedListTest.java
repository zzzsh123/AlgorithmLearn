package today.zsh.chapter1.chapter1_3;

/*
 * author: zsh
 * date: 11/24/2020 11:05 PM
 * description: bag测试
 **/
public class BagByLinkedListTest {

    public static void main(String[] args) {

        BagByLinkedList<String> strings = new BagByLinkedList<>();
        System.out.println(strings.isEmpty());
        String h = "hello";
        strings.add(h);
        String w = "world";
        strings.add(w);
        System.out.println(strings.size());
        System.out.println(strings.isEmpty());
        System.out.println(strings.top());

    }

}
