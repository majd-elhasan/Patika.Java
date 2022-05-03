import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dizinin boyutunu giriniz : ");
        int arrayLength = input.nextInt();

        int[] scores = new int[arrayLength];
        for(int i = 0 ; i < scores.length ; i++)
        {
            scores[i] = input.nextInt();
        }
        input.close();
        System.out.println();
        ArraySupporter.sort(scores);
        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}