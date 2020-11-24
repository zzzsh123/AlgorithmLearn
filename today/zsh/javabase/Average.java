public class Average {

    public static void main(String[] args) {
        double sum = 0.0;
        for (String arg : args) {
            sum += Double.parseDouble(arg);
            System.out.println(arg);
        }
        System.out.println(sum);
    }

}