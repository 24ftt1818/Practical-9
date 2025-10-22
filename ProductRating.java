import java.util.Scanner;

public class ProductRating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        int[][]rating = {
            {4,5,4},
            {3,5,3},
            {4,5,3},
            {1,2,1}
        };

        System.out.println("Rating\tProduct\tPackaging\tDelivery");
        double sp = 0, sk = 0, sd = 0;
        
        for (int i=0; i<rating.length; i++) {
            sp+=rating[i][0];
            sk+=rating[i][1];
            sd+=rating[i][2];
        }

        double ap = sp /rating.length, ak = sk / rating.length, ad = sd / rating.length;
        System.out.printf("Average\t%.2f\t%.2f\t%.2f\n\n", ap, ak, ad);

        for (int i = 0; i < rating.length; i++) {
            double tot = 0;

            for (int j = 0; j < rating[i].length; j++) tot += rating[i][j];
            double avg = tot / rating[i].length;
            System.out.printf("Customer %d provide the average rating %.2f\n", i + 1, avg);
        }
        
    }
}