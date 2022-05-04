import java.util.Scanner;

class App{
    public static void main(String[] args) {
        play();
    }
    private static void play()
    {
        System.out.println("Sayı tahmin oynuna hoş geldiniz !");
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        
        boolean won = true;
        int rights = 5;
        int remainedRights = rights;
        int[] tahmiler = new int[rights];
        int selected = 0;
        while(remainedRights > 0){
            System.out.print("Kalan hakkınız : "+ remainedRights-- + " , Tahmininizi giriniz : ");
            selected = input.nextInt();
            if(selected == number){
                System.out.println("Tebrikler oyunu kazandınız !");
                break;
            }
            else if(selected < number) 
                System.out.println(selected+" sayısı , gizli sayıdan küçüktür. ");
            else if(selected > number) 
                System.out.println(selected+" sayısı , gizli sayıdan büyüktür. ");
            won = false;
            tahmiler[rights-remainedRights-1] = selected;

        }
        if(!won){
            System.out.println("gizli sayı : "+number+" idi");
        }
        System.out.println();
        System.out.print("tahminleriniz : ");
        for (int i = 0 ; i < rights-remainedRights;i++) {
            if(i == rights-remainedRights-1)
                System.out.print(tahmiler[i] + ".");
            else
                System.out.print(tahmiler[i] + ", ");
        }
        System.out.println();
        System.out.println("bi daha oynamak ister misiniz ? (y/n)");
        if(input.next().equals("y")){
            System.out.println("=================================");
            System.out.println("You restarted");
            System.out.println("=================================");
            play();
        }
          

        input.close();
    }
}