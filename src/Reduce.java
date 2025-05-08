public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        int n = 100;
        while (n > 0) {
            counter++;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
            }
            }
        System.out.println(counter);
        }
    }

