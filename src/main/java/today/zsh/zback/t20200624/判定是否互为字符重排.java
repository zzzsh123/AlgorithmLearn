package today.zsh.zback.t20200624;

public class 判定是否互为字符重排 {

    public boolean CheckPermutation(String s1, String s2) {
        int s1Len = s1.length();
        if (s1Len != s2.length()) {
            return false;
        }
        boolean result = false;
        int count = 0;
        for (int i = 0;i < s1Len;i++) {
            int a = 0;
            while (a < s1Len) {
                if (s1.charAt(i) == s2.charAt(a)) count += 1;
                a++;
            }
        }
        System.out.println(count + "cccc");
        System.out.println(s1.length() + "s1.length()");
        if (count == s1.length()) result = true;
        return result;
    }

}
