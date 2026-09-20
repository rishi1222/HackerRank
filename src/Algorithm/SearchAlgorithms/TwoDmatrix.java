package Algorithm.SearchAlgorithms;

public class TwoDmatrix {

    private char[][] twoDmatrix;

    TwoDmatrix() {
        twoDmatrix = new char[3][7];
    }

    public void setTwoDmatrix() {
        twoDmatrix[0][0] = 'O';
        twoDmatrix[0][1] = 'O';
        twoDmatrix[0][2] = 'O';
        twoDmatrix[0][3] = 'X';
        twoDmatrix[0][4] = 'O';
        twoDmatrix[0][5] = 'O';
        twoDmatrix[0][6] = 'O';

        twoDmatrix[1][0] = 'O';
        twoDmatrix[1][1] = 'X';
        twoDmatrix[1][2] = 'X';
        twoDmatrix[1][3] = 'X';
        twoDmatrix[1][4] = 'X';
        twoDmatrix[1][5] = 'X';
        twoDmatrix[1][6] = 'O';

        twoDmatrix[2][0] = 'O';
        twoDmatrix[2][1] = 'X';
        twoDmatrix[2][2] = 'O';
        twoDmatrix[2][3] = 'O';
        twoDmatrix[2][4] = 'O';
        twoDmatrix[2][5] = 'X';
        twoDmatrix[2][6] = 'O';

    }

    public void printMatrix() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(twoDmatrix[i][j]);
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if(twoDmatrix[i][j]=='X'){
                    System.out.print(twoDmatrix[i][j]);

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        TwoDmatrix breadthFirstSearch = new TwoDmatrix();
        breadthFirstSearch.setTwoDmatrix();
        breadthFirstSearch.breadthFirstSearch();
    }
}
