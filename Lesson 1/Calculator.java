public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int sum = a + b;
        int minus = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainderDivision = a % b;
        int degree = a * a;
        char plus = '+';
        char minusCh = '-';
        char umnogenie = '*';
        char delenie = '/';
        char oststokOtDeleniy = '%';
        char stepen = '^';
        if(plus == '+') {
            System.out.println(sum);
        }
        else if(minusCh == '-') {
            System.out.println(minus);
        }
        else if(umnogenie == '*') {
            System.out.println(multiplication);
        }
        else if(delenie == '/') {
            System.out.println(division);
        }
        else if(oststokOtDeleniy == '%') {
            System.out.println(remainderDivision);
        }
        else if(stepen == '^') {
            System.out.println(degree);
        }
        
    }
}