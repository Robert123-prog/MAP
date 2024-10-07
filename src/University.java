import java.util.ArrayList;

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


}
