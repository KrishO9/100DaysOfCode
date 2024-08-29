import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set <String> sett =  new HashSet<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j =0 ; j<board[0].length ; j++)
            {
               if(board[i][j]!='.')
               {
                String s = String.valueOf(board[i][j]);
                
                if(!sett.add(s+"row"+i) || !sett.add(s+"col"+j) || !sett.add(s+"row"+i/3+"col"+j/3))
                    return false;
               }
            }
        }
         return true;
    }
}