import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MineSweeper mineSweeper = new MineSweeper(3, 4);
        mineSweeper.printMineMap();
        System.out.println("====================================");
        mineSweeper.printMineField();
        System.out.print("adım at : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        mineSweeper.step(x,y);
        System.out.println("====================================");
        mineSweeper.printMineField();
        scanner.close();
    }
  
}