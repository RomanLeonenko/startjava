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
        
        int sum = 0;
        int result = 10;
        do {
            if(result % 2 == 1) {
                sum += result;
            }
            result++;
        } while(result < 20);

            System.out.println(sum);

    }
}