import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
        int marks, count = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        // Input
        while (true) {

            marks = input.nextInt();

            if (marks == -1) {
                break;
            }

            count++;
            sum += marks;

        }

        if (count > 0) {
            double average = (double) sum / (double) count; // 220/3.0

            if (average > 90) {
                System.out.println("Grade A");
            } else if (average > 75) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }

        input.close();

    }
}