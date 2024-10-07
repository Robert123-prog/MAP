import java.util.ArrayList;

//AUFGABE 1
public class University {
    int treshold = 40;
    int rounding_threshold = 38;

    public int round(int grade){
        int final_grade = 0;
        if (grade < rounding_threshold){
            return grade;
        }

        int copy_grade = grade;

        while (copy_grade % 5 != 0){
            copy_grade++;
        }

        int difference = copy_grade - grade;

        if (difference < 3){
            final_grade = copy_grade;
        }else {
            final_grade = grade;
        }
        return final_grade;
    }

    public ArrayList<Integer> insufficient(ArrayList<Integer> grades){
        ArrayList<Integer> insufficientGrades = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) < treshold){
                insufficientGrades.add(grades.get(i));
            }
        }

        return insufficientGrades;
    }

    public double average(ArrayList<Integer> grades){
        int sum = 0;

        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }

        double averageGrade = sum / grades.size();
        return averageGrade;
    }

    public ArrayList<Integer> roundedUp(ArrayList<Integer> grades){
        ArrayList<Integer> roundedUpGrades = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++){
            roundedUpGrades.add(round(grades.get(i)));
        }
        return roundedUpGrades;
    }

    public int maximumRoundedUp(ArrayList<Integer> grades){
        int maximumRoundedUpGrade = 0;
        ArrayList<Integer> roundedUpGrades = roundedUp(grades);

        for (int i = 0; i < roundedUpGrades.size(); i++){
            if (roundedUpGrades.get(i) > maximumRoundedUpGrade){
                maximumRoundedUpGrade = roundedUpGrades.get(i);
            }
        }
        return maximumRoundedUpGrade;
    }


}
