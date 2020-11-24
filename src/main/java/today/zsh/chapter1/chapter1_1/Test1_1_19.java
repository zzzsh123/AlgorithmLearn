package today.zsh.chapter1.chapter1_1;

public class Test1_1_19 {


    public static Long F(int N){
        if (N == 0) return (long)0;
        if (N == 1) return (long)1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        for (int N = 0;N < 100;N++)
            System.out.println("N --->" + N + " : " + F(N));
    }

}
