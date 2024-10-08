import java.util.Arrays;
import java.util.Scanner;

public class BigNumbers {

    public int[] number1;
    public int[] number2;

    public BigNumbers(int[] number1, int[] number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int[] sum(){
        int[] numberSum = new int[this.number1.length + 1];
        int carry = 0;

        for (int i = this.number1.length - 1;i >= 0;i--){
            int localSum = this.number1[i] + this.number2[i] + carry;
            numberSum[i + 1] = localSum % 10;
            carry = localSum / 10;
        }

        numberSum[0] = carry;

        if (numberSum[0] == 0){
            int[] finalSum = new int[numberSum.length - 1];
            System.arraycopy(numberSum, 1, finalSum, 0, numberSum.length);
            /**
             * 1st parameter = array to be copied
             * 2nd parameter = index in the array to be copied from which the copying starts
             * 3rd parameter = array in which the elements will be copied
             * 4th parameter = index where the elements will start in the copied array
             * 5th parameter = length of the array that will be copied
             */

            return finalSum;
        }else {
            return numberSum;
        }
    }

    public int[] difference(){
        int[] numberDiff = new int[this.number1.length];
        int borrow = 0;

        for (int i = this.number1.length - 1;i >= 0;i--){
            int localDiff = this.number1[i] - this.number2[i] - borrow;

            if (localDiff < 0){
                localDiff += 10;
                borrow = 1;
            }else {
                borrow = 0;
            }
            numberDiff[i] = localDiff;
        }

        int zeros = 0;

        for (int i = 0;i < numberDiff.length;i++){
            if (numberDiff[i] == 0){
                zeros++;
            }
            if (numberDiff[i] != 0){
                break;
            }
        }

        if (zeros == this.number1.length){
            return new int[]{0};
        }

        int[] finalDiff = new int[this.number1.length - zeros];
        System.arraycopy(numberDiff, zeros, finalDiff, 0, finalDiff.length);

        return finalDiff;
    }

    public int[] multiplication(int multiplicator){
        int[] chosenNumber = new int[this.number1.length];

        System.out.println("Choose which big number to use for the multiplication: ");
        System.out.println(Arrays.toString(this.number1));
        System.out.println(Arrays.toString(this.number2));
        System.out.println("Enter 1 for the first number and 2 for the second number");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1){
            chosenNumber = this.number1;
        }
        if (choice == 2){
            chosenNumber = this.number2;
        }

        int[] numberMult = new int[this.number1.length + 1];
        int carry = 0;

        for (int i = this.number1.length - 1;i >= 0;i--){
            int localMult = chosenNumber[i] * multiplicator + carry;
            numberMult[i + 1] = localMult % 10;
            carry = localMult / 10;
        }

        numberMult[0] = carry;

        if (numberMult[0] == 0){
            int[] finalMult = new int[chosenNumber.length];
            System.arraycopy(numberMult, 1, finalMult, 0, chosenNumber.length);
            return finalMult;
        }else {
            return numberMult;
        }
    }

    public int[] division(int divider){
        int[] chosenNumber = new int[this.number1.length];

        System.out.println("Choose which big number to use for the division: ");
        System.out.println(Arrays.toString(this.number1));
        System.out.println(Arrays.toString(this.number2));
        System.out.println("Enter 1 for the first number and 2 for the second number");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1){
            chosenNumber = this.number1;
        }
        if (choice == 2){
            chosenNumber = this.number2;
        }

        int[] numberDiv = new int[chosenNumber.length];
        int carry = 0;

        for (int i = 0;i < chosenNumber.length;i++){
            int localDiv = carry * 10 + chosenNumber[i];
            numberDiv[i] = localDiv / divider;
            carry = localDiv % divider;
        }

        //for cases such as 1111111


        int zeros = 0;

        for (int i = 0;i < numberDiv.length;i++){
            if (numberDiv[i] == 0){
                zeros++;
            }
            if (numberDiv[i] != 0){
                break;
            }
        }

        if (zeros == chosenNumber.length){
            return new int[]{0};
        }

        int[] finalDiv = new int[chosenNumber.length - zeros];
        System.arraycopy(numberDiv, zeros, finalDiv, 0, finalDiv.length);

        return finalDiv;
    }
}
