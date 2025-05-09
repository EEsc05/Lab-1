public class Multiples {
    public static void main(String[] args) {
        int tot = 0;
        for (int i = 0; i < 1000; i++) {
           boolean m3lessthan1000 = (i * 3) < 1000;
           boolean m5lessthan1000 = (i * 5) < 1000;

           if (m3lessthan1000) {
               tot++;
           }
           if (m5lessthan1000) {
               tot++;
           }
        }
        System.out.println(tot);
    }
}
