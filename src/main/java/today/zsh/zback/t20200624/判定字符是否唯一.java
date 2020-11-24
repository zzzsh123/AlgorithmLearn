package today.zsh.zback.t20200624;

public class 判定字符是否唯一 {

    public boolean isUnique(String astr) {
        int len = astr.length();
        for (int i = 0;i < len;i++) {
            int a = i + 1;
            while (a < len) {
                if (astr.charAt(i) == astr.charAt(a)) return false;
                a++;
            }
        }
        return true;
    }

}
