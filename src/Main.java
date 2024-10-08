import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        int[] grades = {13, 46, 43, 99, 89, 73, 87};

        System.out.println(Arrays.toString(university.insufficient(grades)));

        System.out.println(university.average(grades));

        System.out.println(Arrays.toString(university.roundedUp(grades)));

        System.out.println(university.maximumRoundedUp(grades));
    }
}
