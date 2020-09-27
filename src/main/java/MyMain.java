import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int)((Math.random()*6)+1);
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] sumTotals = new int[11];
        for (int i = 0; i < n; i++){
            sumTotals[(rollDie() + rollDie())-2] += 1;
        }
        return sumTotals;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?");
        int rollNum = scan.nextInt();
        int[] sumTotals = sumOfTwoDice(rollNum);
        for (int i = 0; i < sumTotals.length; i++){
            System.out.println("% of rolls where sum == " + (i + 2) + ": " + (sumTotals[i]*100.0)/rollNum);
        }
        scan.close();
    }
}
