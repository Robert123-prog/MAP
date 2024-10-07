import java.util.ArrayList;

//AUFGABE 1
public class University {
    int treshold = 40;


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



}
