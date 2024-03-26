class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char num = board[i][j];
                if (num != '.'){
                    for (int x = i+1; x<9; x++){
                            if (board[x][j] == (num)) return false;
                    }
                    for (int y = j+1; y<9; y++){
                            if (board[i][y] == (num)) return false;
                    }
                    int subgridRowStart = i - i % 3;
                    int subgridColStart = j - j % 3;
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            if (subgridRowStart + m != i || subgridColStart + n != j) {
                                if (board[subgridRowStart+m][subgridColStart+n] == num){
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
