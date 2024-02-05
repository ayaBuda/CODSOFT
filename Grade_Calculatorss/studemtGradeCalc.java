package Grade_Calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studemtGradeCalc {
    // static int sum = 0;
    static int averagePercentage;
    static List<Integer> marksArray = new ArrayList<Integer>();
    static List<String> subjects = new ArrayList<String>();
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill in number of Subjects taken: ");
        int totalOfSubjects = scanner.nextInt();
        scanner.nextLine();

        for (int x = 1; x <= totalOfSubjects; x++) {
            System.out.println("Please fill in Subject name: ");
            String subjectName = scanner.nextLine();
            subjects.add(subjectName); 

            System.out.println("Please enter subject mark out of 100: ");
            int markOutOfHund = scanner.nextInt();
            marksArray.add(markOutOfHund);

            scanner.nextLine();
        }

        int sumOfMarks = calculatorAllResults();
        int maxMark = totalOfSubjects * 100;
        int averagePercentage = (int) ((double) sumOfMarks / maxMark * 100);

        System.out.printf("%-20s %-10s %-20s %-10s\n", "Subject", "Marks", "Average Percentage", "Grade");

        for (int i = 0; i < totalOfSubjects; i++) {
            String subject = subjects.get(i);
            int marks = marksArray.get(i);
            double average = (double) marks / 100 * 100;
            char grade = gradeCalculations(average);

            System.out.printf("%-20s %-10d %-20.2f %-10c\n", subject, marks, average, grade);
        }

        System.out.printf("%-20s %-10d %-20s %-10.2f\n", "Total", sumOfMarks, "", (double) averagePercentage);
    }


    public static int calculatorAllResults(){
        int sum = 0;

        for ( int i = 0; i < marksArray.size(); i++){
            sum = sum + marksArray.get(i);
        }
        return sum;
    }



    public static char gradeCalculations(double averagePercentage){
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 60) {
            return 'C';
        } else if (averagePercentage >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    
    }
    
}
