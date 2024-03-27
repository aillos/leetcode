class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
            for(int x=0;x<9;x++){
                for(int y=0;y<9;y++){
                    if(board[x][y]=='.'){
                        for(int z=1;z<10;z++){
                            if(isValid(board, x, y, (char)('0'+z))){
                                board[x][y]=(char)('0'+z);
                                if(solve(board)) return true;
                                else board[x][y]= '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
    }
    public boolean isValid(char[][] board, int row, int col, char num){
        int rowStart = row - row % 3;
        int colStart = col - col % 3;
        for (int i=0; i<9; i++){
            if(board[row][i]==num) return false;
            if(board[i][col]==num) return false;
            for (int j=0; j<3; j++){
                for (int k=0; k<3; k++){
                    if (rowStart + j != row || colStart + k != col) {
                            if (board[rowStart+j][colStart+k] == num){
                                return false;
                            }
                    }
                }
            }
        }
        return true;
    }
}
