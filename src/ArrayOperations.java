public class ArrayOperations {
    int n;
    int[] array = new int[n];

    public ArrayOperations(int n, int[] array) {
        this.n = n;
        this.array = array;
    }

    public int maximum(){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < this.n; i++) {
            if (this.array[i] > max) {
                max = this.array[i];
            }
        }
        return max;
    }

    public int minimum(){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < this.n; i++) {
            if (this.array[i] < min) {
                min = this.array[i];
            }
        }
        return min;
    }

    public int maxSum(){
        int minValue = this.minimum();
        int sum = 0;

        for (int number: this.array){
            if (number != minValue){
                sum += number;
            }
        }

        return sum;
    }


}
