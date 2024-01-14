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
        getStudentsInput();
        System.out.println(marksArray);
        System.out.println(subjects);
        calculatorAllResults();

    }

    public static int getStudentsInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill in number of Subjects taken: ");
        int totalOfSubjects = scanner.nextInt();

        scanner.nextLine();

        for(int x = 1; x <= totalOfSubjects; x++){
            System.out.println("Please fill in Subject name: ");
            String subjectName = scanner.nextLine();
            subjects.add(subjectName);
            

            System.out.println("Please enter subject mark out of 100: ");
            int markOutOfHund = scanner.nextInt();
            marksArray.add(markOutOfHund);

            scanner.nextLine();
    }
    scanner.close();
    getAveragePercentage(totalOfSubjects);
    return totalOfSubjects;
    }

    public static int calculatorAllResults(){
        int sum = 0;

        for ( int i = 0; i < marksArray.size(); i++){
            sum = sum + marksArray.get(i);
        }
        System.out.println("this is the calculated sum: " +sum);
        return sum;
    }

    public static void getAveragePercentage(int totalOfSubjects){
        
        // System.out.println(sum);
        System.out.println("no of sub: "+totalOfSubjects);
        int sumOfMarks = calculatorAllResults();

        System.out.println("what is this: "+sumOfMarks);
        int averagePercentage = (sumOfMarks / totalOfSubjects) * 100;
        System.out.println("is this the one: "+averagePercentage);
    }
    
}
