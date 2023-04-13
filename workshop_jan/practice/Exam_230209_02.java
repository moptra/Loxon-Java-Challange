public class Exam_230209_02 {
    public static void main(String[] args) {

/*        Write to the console all three digit numbers that remain the
        same when their digits are reversed. Dor example
        121, 343. 143 is not.*/

        int [] myArray = new int [3];

        for (int i = 1; i < 10; i++) {
            myArray[0] = i;
            for (int j = 0; j < 10; j++) {
                myArray[1] = j;
                for (int k = 0; k < 10; k++) {
                    myArray[2] = k;
                    if (myArray[0] == myArray[2]) {
                        for (int l = 0; l < 3 ; l++) {
                            System.out.print(myArray[l]);
                        }
                        System.out.print(" ");
                    }

                }

            }

        }
        System.out.println();

        String firstNumber = " ";
        String secondNumber = " ";
        String thirdNumber = " ";

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    firstNumber = String.valueOf(i);
                    secondNumber = String.valueOf(j);
                    thirdNumber = String.valueOf(k);

                    String threeDigitNumber = firstNumber + secondNumber + thirdNumber;

                    if (threeDigitNumber.charAt(0) == threeDigitNumber.charAt(2)) {
                        System.out.print(threeDigitNumber + " ");
                    }
                }
            }
        }

        System.out.println();


        for (int i = 100; i < 1000; i++) {
            String number = String.valueOf(i);
            if (number.charAt(0) == number.charAt(2)) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

        for (int i = 1; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(String.valueOf(i) + String.valueOf(j) + String.valueOf(i) + " ");
            }
        }

    }
}
