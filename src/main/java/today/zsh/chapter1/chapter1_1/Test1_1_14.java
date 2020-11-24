package today.zsh.chapter1.chapter1_1;

// 编写静态方法lg(),接受一个整数N，返回一个log2N的最大整数
public class Test1_1_14 {

    public static void main(String[] args) {
        int lg = lg(55);
        System.out.println(lg);
    }

    public static int lg(int N){
        int i = 0;
        for (int k = 0;k < N;k++) {
            if (k * k > N) return i;
            if (k * k < N) {
                i = k;
            }
        }
        return -1;
    }

}
