import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        int[] grades = {13, 46, 43, 99, 89, 73, 87};

        System.out.println(Arrays.toString(university.insufficient(grades)));
        System.out.println(university.average(grades));
        System.out.println(Arrays.toString(university.roundedUp(grades)));
        System.out.println(university.maximumRoundedUp(grades));

        ArrayOperations ops = new ArrayOperations(5, new int[]{4, 8, 3, 10, 17});

        System.out.println(ops.minimum());
        System.out.println(ops.maximum());
        System.out.println(ops.maxSum());
        System.out.println(ops.minSum());

        BigNumbers bn = new BigNumbers(new int[] {8, 7, 6, 4, 0, 0, 0}, new int[] {8, 7, 6, 2, 0, 0, 0});
        System.out.println(Arrays.toString(bn.sum()));
        System.out.println(Arrays.toString(bn.difference()));

        BigNumbers bn2 = new BigNumbers(new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1});
        System.out.println(Arrays.toString(bn2.multiplication(2)));

    }
}
