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

    public int[] insufficient(int[] grades){
        int[] insufficientGrades = new int[grades.length];
        int index = 0;

        for(int grade: grades){
            if (grade < treshold){
                insufficientGrades[index] = grade;
                index++;
            }
        }

        return insufficientGrades;
    }

    public double average(int[] grades){
        int sum = 0;

        for (int grade: grades){
            sum += grade;
        }

        return sum /= grades.length;
    }

    public int[] roundedUp(int[] grades){
        int[] roundedUpGrades = new int[grades.length];
        int index = 0;

        for (int grade: grades){
            roundedUpGrades[index] = this.round(grade);
            index++;
        }
        return roundedUpGrades;
    }

    public int maximumRoundedUp(int[] grades){
        int maximumRoundedUpGrade = Integer.MIN_VALUE;
        int[] roundedUpGrades = roundedUp(grades);

        for (int grade: roundedUpGrades){
            if (grade > maximumRoundedUpGrade){
                maximumRoundedUpGrade = grade;
            }
        }
        return maximumRoundedUpGrade;
    }


}
