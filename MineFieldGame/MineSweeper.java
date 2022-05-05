import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int row_number ;
    int column_number;
    int mineNumber ;
    String[][] mineField ;
    String[][] mineMap ;
    Boolean playerWon = true;

    public MineSweeper(int row_number, int column_number) {
        this.row_number = row_number;
        this.column_number = column_number;
        mineNumber = row_number*column_number/4;
        createField();
        createMinesMap();
    }
    void run(){
        Scanner scanner = new Scanner(System.in);
        int f = row_number * column_number -mineNumber ;
        while(f > 0){
            f = f-1;
            System.out.println("====================================");
            printMineField();
            System.out.print("koordinat seç (x y) : ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            step(x,y);
            if(playerWon == false){
                System.out.println("bir mayın üzerine bastın !  :(");
                break;
            }
        
        }
        if(playerWon){
            System.out.println();
            System.out.println("=====================================");
            System.out.println("|          Oyunu kazandın !         |");
            System.out.println("=====================================");
            
        }
        scanner.close();
    }
    void step(int x , int y){
        x-=1;   y-=1;
        int nearMineNum = 0;
        if(mineMap[x][y].contains("*")){
            // System.out.println("You steped over a mine ,Lost the game  :(");
            playerWon = false;
        }

        else {
            if(x == 0 && row_number > 1 && column_number > 1){
                if(y == 0 ){
                    if(mineMap[x+1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y+1].contains("*"))
                        nearMineNum++;
                }
                else if(y == column_number-1 ){
                    if(mineMap[x+1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y-1].contains("*"))
                        nearMineNum++;
                }
                else if(y > 0 && y < column_number-1 ){
                    if(mineMap[x][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y+1].contains("*"))
                        nearMineNum++;
                }

            }
            else if(x == row_number-1 && row_number > 1 && column_number > 1){
                if(y == 0 ){
                    if(mineMap[x-1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y+1].contains("*"))
                        nearMineNum++;
                }
                else if(y == column_number-1){
                    if(mineMap[x-1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y-1].contains("*"))
                        nearMineNum++;
                }
                else if(y > 0 && y < column_number-1 ){
                    if(mineMap[x][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y+1].contains("*"))
                        nearMineNum++;
                }

            }
            else if((x > 0 && x < row_number-1) && row_number > 1 && column_number > 1){
                if(y == 0 ){
                    if(mineMap[x-1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y+1].contains("*"))
                    nearMineNum++;
                    if(mineMap[x+1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y+1].contains("*"))
                        nearMineNum++;
                }
                else if(y == column_number-1){
                    if(mineMap[x-1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y-1].contains("*"))
                    nearMineNum++;
                    if(mineMap[x+1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y-1].contains("*"))
                        nearMineNum++;
                }
                else if(y > 0 && y < column_number-1 ){
                    if(mineMap[x][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x-1][y+1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y-1].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y].contains("*"))
                        nearMineNum++;
                    if(mineMap[x+1][y+1].contains("*"))
                        nearMineNum++;
                }

            }
        }
        /// end conditions
        mineField[x][y] = " "+nearMineNum+" ";
    }
    void createField(){
        mineField = new String[row_number][column_number];
        for (int i = 0; i < row_number ; i++)
            for(int j = 0; j < column_number ; j++)
                mineField[i][j] = " - ";
    }
    void createMinesMap(){
        mineMap = new String[row_number][column_number];
        for (int i = 0; i < row_number ; i++)
            for(int j = 0; j < column_number ; j++)
                mineMap[i][j] = " - ";
        int MN = mineNumber; 
        int[][] locations = new int[mineNumber][2];
        while (MN-- > 0) {
            int random_row = (int)(Math.random()*row_number);
            int random_col = (int)(Math.random()*column_number);
            int[] tempLoc = {random_row,random_col};
            for(int i = 0 ; i < locations.length - MN-1 ; i++){
                if(!isEqual(locations[i], tempLoc)){
                   if(i == locations.length - MN-2)
                        locations[i+1] = tempLoc;
                }
                else MN++;
            }
            
        }
        // for(int ii= 0 ; ii < locations.length ; ii++){      ////
        //     for(int j = 0 ; j < locations[0].length; j++)   ////
        //         System.out.print(locations[ii][j]);         ////
        //     System.out.println();                           ////
        // }                                                   ////

        for(int i = 0 ; i< locations.length; i++)
                mineMap[locations[i][0]][locations[i][1]] = " * ";
    }

    boolean isEqual(int[] location1,int[] location2){
        for(int i = 0 ; i < 2 ; i++)
            if(location1[i] != location2[i])
                return false; 
        return true;
    }

    void printMineMap(){
        for(int i= 0 ; i < mineMap.length ; i++){
            for(int j = 0 ; j < mineMap[0].length; j++)
                System.out.print(mineMap[i][j]);
            System.out.println();
        }
    }
    void printMineField(){
        for(int i= 0 ; i < mineField.length ; i++){
            for(int j = 0 ; j < mineField[0].length; j++)
                System.out.print(mineField[i][j]);
            System.out.println();
        }
    }
    
}
