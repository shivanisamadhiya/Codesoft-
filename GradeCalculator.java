import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // More natural phrasing during input
    System.out.println("************************************");
    System.out.println( "  Welcome to the Grade Calculator  ");
    System.out.println("************************************");
    System.out.println("Hello! Let's calculate your grades.");
    System.out.print("How many subjects do you have? ");
    int numSubjects = scanner.nextInt();

    int[] marks = new int[numSubjects];
    for (int i = 0; i < numSubjects; i++){
        System.out.println("Enter the marks you obtained in subject " + (i + 1) + " : ");
        marks[i] = scanner.nextInt();


    }
    // Call the function to calculate results
    calculateResults(marks);

    // Close scanner
    scanner.close();

}

    // Function to calculate total, average, and grade
    public static void calculateResults(int[] marks) {
        int totalMarks = 0;
        int numSubjects = marks.length;

        // Total marks calculation
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Average percentage calculation
        double avgPercentage = (double) totalMarks / numSubjects;

        // Grade assignment based on average percentage
        String grade;
        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B+";
        } else if (avgPercentage >= 60) {
            grade = "B";
        } else if (avgPercentage >= 50) {
            grade = "C+";
        } else if (avgPercentage >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Display the results in a conversational tone
        System.out.println("\n*************************************");
        System.out.println("   Let's take a look at your results.  ");
        System.out.println("*************************************");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks : %.2f%%\n", avgPercentage);
        System.out.println("Grades: " + grade);
        System.out.println("*************************************");


        // Friendly closing message
     
        System.out.println("*************************************"); 
        System.out.println("Keep pushing forward and improving ! ");
        System.out.println("*************************************");

    }

}    

