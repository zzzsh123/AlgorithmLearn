package today.zsh.chapter1.chapter1_1;

public class Test1_1_22_Euclid {

    public static int euclid(int a,int b) {
        if (b == 0) return a;
        return euclid(b, a % b);
    }

    public static void main(String[] args) {
        int euclid = euclid(1111111, 1234567);
        System.out.println(euclid);
    }

}
