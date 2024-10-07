public class Arrays {
    int n;
    int[] array = new int[n];

    public Arrays(int n, int[] array) {
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


}
