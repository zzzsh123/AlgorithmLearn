package today.zsh.chapter1.chapter1_1;

public class Test1_1_18 {

    public static int mystery(int a,int b){
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b/2);
        return mystery(a + a, b/2) + a;
    }

    public static int mystery2(int a,int b){
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a * a, b/2);
        return mystery(a * a, b/2) + a;
    }

    public static void main(String[] args) {
        // a->2,b->25  return 50
        // a->3,b->11  return 33
        // 给定正整数a和b，mystery的计算结果为：a*b
        // int mystery = mystery(3, 11);

        // 将+替换为*,return 0;替换为return 1;
        int mystery2 = mystery2(2, 66);
        System.out.println(mystery2);
    }

}
