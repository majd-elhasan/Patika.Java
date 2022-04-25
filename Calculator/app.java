import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        String operator ;
        System.out.print("ilk sayıyı giriniz : ");
        num1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        num2 = input.nextInt();
        input.nextLine();
        System.out.print("operatörü seçiniz : \n toplama için + \n çıkarma için - \n çarpma için * \n bölme için / işaretini giriniz. operatör ? :  ");
        operator = input.nextLine();

        switch(operator){
            case "+":
                System.out.println("toplam : "+ (num1 + num2));
                break;
            case "-":
                System.out.println("çıkarma : "+ (num1 - num2));
                break;
            case "*":
                System.out.println("çarpma : "+ (num1 * num2));
                break;
            case "/":
                if(num2 == 0) {System.out.println("0'a bölme işlemi gerçekleştirilemez !"); break;}
                System.out.println("bölme : "+ (num1 / num2));
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız !");
                break;
        }
        input.close();
    }
    
}