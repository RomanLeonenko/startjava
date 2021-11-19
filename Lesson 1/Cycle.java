public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int a = 6;
        while (a >=-6) {
            System.out.println(a);
            a -=1;
        }

        int b = 11;
        do {
            System.out.println(b++);
            b++;
        } while(b < 20);
    }
}