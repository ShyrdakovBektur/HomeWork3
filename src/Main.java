public class Main {
    public static void main(String[] args) {


        double[] values = {5.4, 3.9, 7.7, -9.5, -4.43, 9.10, 3.1, -2.33, 5.4, -4.43, 1.3, 4.6, -4.56, -56.7, 23.56};
        double num = 0;
        int sum = 0;
        boolean foundNegative = false;
        for (double digits : values) {
            if (digits < 0) {
                foundNegative = true;
            } else if (foundNegative) {
                num += digits;
                sum++;
            }
        }
        double purpose = num / sum;
        System.out.println("первое чисо после отритсатильного числа - " + have);






















































    }
}