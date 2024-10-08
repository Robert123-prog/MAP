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
}
