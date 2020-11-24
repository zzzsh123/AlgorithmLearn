package today.zsh.chapter1.chapter1_3;

/*
 * author: zsh
 * date: 11/24/2020 10:53 PM
 * description: 测试链表实现的队列
 **/
public class QueueByLinkedListTest {

    public static void main(String[] args) {

        QueueByLinkedList<Integer> ints = new QueueByLinkedList<>();
        System.out.println("ints.isEmpty: " + ints.isEmpty());
        ints.enqueue(2);
        System.out.println("ints size: " + ints.size());
        System.out.println("ints.dequeue: " + ints.dequeue());
        ints.enqueue(5);
        System.out.println("ints.isEmpty: " + ints.isEmpty());

    }

}
