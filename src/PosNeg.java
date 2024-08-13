public class PosNeg {
    public static void main(String[] args) {
        checkNumber(15);
        checkNumber(-200);
        checkNumber(80);

    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("This number is a positive");

        } else if (number < 0){
            System.out.println("This number is a negative");
        }

    }
}
