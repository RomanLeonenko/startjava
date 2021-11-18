public class ConditionalStattemen {
    public static void main(String[] args) {
        int age = 43;
        if(age > 20) {
            System.out.println("да верно");
        }

        boolean maleGender = true;
        if(maleGender = true) {
            System.out.println("да верно");
        }

        if(!maleGender) {
            System.out.println("нет");
        }

        double height = 1.85;
        if(height < 1.80) {
            System.out.println(" не верно");
        } else {
            System.out.println("правильно");
        }

        char firstLetterName = 'R';
        if(firstLetterName == 'R') {
            System.out.println("верно");
        } else if(firstLetterName == 'L') {
            System.out.println("не правильно");
        } else {
            System.out.println("другое имя");
        }
    }
}