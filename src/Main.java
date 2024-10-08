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

        BigNumbers bn3 = new BigNumbers(new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0}, new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3});
        System.out.println(Arrays.toString(bn3.division(2)));

        Markus m = new Markus();
        int[] keyboards = new int[]{40, 35, 70, 15, 45};
        int[] keyboards2 = new int[]{15, 20, 10, 35};
        int[] usbs = new int[]{20, 15, 40, 15};
        int[] usbs2 = new int[]{15, 45, 20};

        System.out.println(m.cheapestKeyboard(keyboards));
        System.out.println(m.mostExpensiveItems(keyboards2, usbs));
        System.out.println(m.mostExpensiveUsbInBudget(30, usbs2));
        System.out.println(m.mostExpensiveKeyboardInBudget(5, keyboards));

        System.out.println(m.bestCombinationInBudget(60, new int[]{40, 50, 60}, new int[]{8, 12}));
        System.out.println(m.bestCombinationInBudget(60, new int[]{60}, new int[]{8, 12}));
        System.out.println(m.bestCombinationInBudget(60, new int[]{40, 60}, new int[]{8, 12}));

    }
}
