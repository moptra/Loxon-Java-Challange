public class fistDay {
    public static void main(String[] args) {

        int firstNumber;
        firstNumber = 5;
        int secondNumber = 8;
        int returnSUM = sumAndPrintNumbers(firstNumber, secondNumber);
        System.out.println(returnSUM);

    }

    public static int sumAndPrintNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }



}
