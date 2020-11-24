package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

/*
 * author: zsh
 * date: 11/24/2020 10:17 PM
 * description: 测试链表实现的下压栈
 **/
public class DownTheStackByLinkedListTest {

    public static void main(String[] args) {

        DownTheStackByLinkedList<String> strings = new DownTheStackByLinkedList<>();
        System.out.println(strings.isEmpty());
        String h = "hello";
        strings.push(h);
        String w = "world";
        strings.push(w);
        System.out.println(strings.size());
        System.out.println(strings.isEmpty());
        System.out.println(strings.pop());
        System.out.println(strings.pop());

        // 测试迭代
        System.out.println(strings.isEmpty());

        String h2 = "hello";
        strings.push(h2);
        String w2 = "world";
        strings.push(w2);

        System.out.println(" top " +strings.top());

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" top " +strings.top());

    }

}
