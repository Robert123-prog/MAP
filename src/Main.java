import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(10, 21, 80, 71, 43, 39));

        System.out.println(university.insufficient(grades));
        System.out.println(university.average(grades));
        System.out.println(university.roundedUp(grades));
        System.out.println(university.maximumRoundedUp(grades));
    }
}
