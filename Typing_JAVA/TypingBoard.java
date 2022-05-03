public class TypingBoard {
    static String[][] panel(String word){
        String[][] panel=new String[12][8*word.length()];
        for (int i = 0 ; i < panel.length ; i ++){
            for(int j = 0 ; j < panel[i].length; j++){
                System.out.print(panel[i][j] = "   ");
            }
        }
        for(int i = 0 ; i <word.length() ; i++){
            
            if(word.charAt(i) == 'j')
                letter_J(panel, i);
            if(word.charAt(i) == 'a')
                letter_A(panel, i);
            if(word.charAt(i) == 'v')
                letter_V(panel, i);
        }
        
        return panel;
    }
    static void printPanel(String[][] panel){
        for (int i = 0 ; i < panel.length ; i ++){
            for(int j = 0 ; j < panel[i].length; j++){
                System.out.print(panel[i][j]);
            }
            System.out.println();
        }
    }
    static String[][] letter_A(String[][] panel,int index){
        index = index*(8-1);
        for (int i = 0 ; i < panel.length ; i++){
            for (int j = 0 ; j < panel[0].length ; j++){
                if(j-index == 0  ){
                    if( i <= 11 && i >= 7)
                        panel[i][j] = " **";    
                }
                if(j-index == 7  ){
                    if( i <= 11 && i >= 7)
                        panel[i][j] = "** ";    
                }
                if(j-index == 1 || j-index ==6){
                    if(i <= 11 && i >= 4)
                        panel[i][j] = "***";    
                }
                if(j-index == 2 || j-index ==5){
                    if( i == 2 || i ==3 || i ==4)
                        panel[i][j] = "***";    
                }
                if(j-index == 3 || j-index ==4){
                    if( i == 0 || i ==1 || i ==2)
                        panel[i][j] = "***";    
                }
                if(i == 6 || i ==5){
                    if(j-index <=6 &&  j-index >=1)
                        panel[i][j] = "***";    
                }
            }
        }
        return panel;
    }
    static String[][] letter_V(String[][] panel,int index){
        index = index*(8-1);
        for (int i = 0 ; i < panel.length ; i++){
            for (int j = 0 ; j < panel[0].length ; j++){
                if(j-index == 0 || j-index ==7){
                    if( i <= 1 && i >= 0)
                        panel[i][j] = "***";    
                }
                if(j-index == 1 || j-index ==6){
                    if(i <= 8 && i >= 0)
                        panel[i][j] = "***";    
                }
                if(j-index == 2 || j-index ==5){
                    if((i >= 0 && i <= 1)||(i <= 9 && i >= 5))
                        panel[i][j] = "***";    
                }
                if(j-index == 3 || j-index ==4){
                    if( i >= 9 && i <= 11)
                        panel[i][j] = "***";    
                }
            }
        }
        return panel;
    }
    static String[][] letter_J(String[][] panel,int index){
        index = index*(8-1);
        for (int i = 0 ; i < panel.length ; i++){
            for (int j = 0 ; j < panel[0].length ; j++){
                if( i == 0 || i ==1)
                    if(j-index >= 2 && j-index <=6){
                        panel[i][j] = "***";    
                    if(j-index ==7)
                        panel[i][j] = "** ";
                }
                if(j-index == 4 || j-index ==5){
                    if(i <= 10 && i >= 0)
                        panel[i][j] = "***";    
                }
                if( j-index == 4){
                    if(i == 11)
                        panel[i][j] = "***";    
                }

                if(j-index == 1 ){
                    if((i >= 8 && i <= 10))
                        panel[i][j] = "***";    
                }
                if(j-index ==2){
                    if( i >= 8 && i <= 11)
                        panel[i][j] = "***";    
                }
                if(j-index ==3){
                    if( i >= 10 && i <= 11)
                        panel[i][j] = "***";    
                }
            }
        }
        return panel;
    }

}
