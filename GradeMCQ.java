import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        char[][] answers = {
            {'A','B','A','C','C','D'},
            {'D','B','A','B','C','A'},
            {'C','B','A','A','B','C'},
            {'A','B','C','C','B','A'}
        };

        System.out.println("Enter the key to the MCQ:");
        char[] key = new char[6];

        for (int i = 0; i < key.length; i++) key[i] = input.next().charAt(0);

        for (int i = 0; i < answers.length; i++) {
            int correct = 0;
            
            for (int j = 0; j < answers[i].length; j++)
                if (answers[i][j] == key[j]) correct++;
            if (correct >= 3)
                System.out.println("Student " + i + "'s correct count is " + correct + ". Therefore, he/she passed the test.");
            else
                System.out.println("Student " + i + "'s correct count is " + correct + ". Therefore, he/she failed the test.");
        }

    }
}