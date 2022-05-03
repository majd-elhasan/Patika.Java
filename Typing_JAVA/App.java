class App{
    public static void main(String[] args) {
        String[][] panel = TypingBoard.panel("java");
        System.out.println("row number : " + panel.length+"\n"+
        "column number : " + panel[0].length);
        System.out.println("==================================");
        //TypingBoard.letter_A(panel,7);
        System.out.println(panel[9].length);
        TypingBoard.printPanel(panel);
    }
}