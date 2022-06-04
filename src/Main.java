
public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i ==6) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][0] = " * ";
                    letter[i][1] = "   ";
                    letter[i][2] = "   ";
                    letter[i][3] = " * ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

