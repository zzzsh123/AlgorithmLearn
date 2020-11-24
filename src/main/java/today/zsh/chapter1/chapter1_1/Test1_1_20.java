package today.zsh.chapter1.chapter1_1;

// 编写方法 计算N！
public class Test1_1_20 {

    public static int lg(int N){
        int sum = 1;
        for (int i = 1;i <= N;i++) {
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(lg(5));  //48
    }

}
