import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz : ");
        String inWord = scanner.nextLine(); 
        scanner.close();
        System.out.println(isPalindrome(inWord));
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}