class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] subGrid = new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            subGrid[i]=new HashSet<>();
        }
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                char cr = board[i][j];
                if( cr == '.'){
                    continue;
                }

                int boxIndex = (i/3)*3+(j/3);
                if(rows[i].contains(cr)||cols[j].contains(cr)||subGrid[boxIndex].contains(cr)){
                    return false;
                }
                rows[i].add(cr);
                cols[j].add(cr);
                subGrid[boxIndex].add(cr);

            }
        }
        return true;
    }
}
