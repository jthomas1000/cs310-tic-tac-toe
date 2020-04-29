package edu.jsu.mcis;

public class TicTacToeModel {
    
    private Mark[][] board; /* Game board */
    private boolean xTurn;  /* True if X is current player */
    private int width;      /* Size of game board */
    
    /* ENUM TYPE DEFINITIONS */
    
    /* Mark (represents X, O, or an empty square */
    
    public enum Mark {
        
        X("X"), 
        O("O"), 
        EMPTY("-");

        private String message;
        
        private Mark(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    /* Result (represents the final state of the game: X wins, O wins, a TIE,
       or NONE if the game is not yet over) */
    
    public enum Result {
        
        X("X"), 
        O("O"), 
        TIE("TIE"), 
        NONE("NONE");

        private String message;
        
        private Result(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    /* CONSTRUCTOR */
    
    public TicTacToeModel() {
        
        this(TicTacToe.DEFAULT_WIDTH);
        
    }
    
    /* CONSTRUCTOR */
    
    public TicTacToeModel(int width) {
        
        /* Initialize width; X goes first */
        
        this.width = width;
        xTurn = true;
        
        /* Create board (width x width) as a 2D Mark array */
        
        board = new Mark[width][width];

        /* Initialize board by filling every square with empty marks */
        for (int i = 0; i < width; i++){
            for (int j = 0; j < width; j++){
               board = new Mark[i][j];
            }
        }
        // INSERT YOUR CODE HERE !DONE MAYBE?????
        
    }
	
    public boolean makeMark(int row, int col) {
        
        /* Use "isValidSquare()" to check if the specified location is in range,
           and use "isSquareMarked()" to see if the square is empty!  If the
           specified location is valid, make a mark for the current player, then
           toggle "xTurn" from true to false (or vice-versa) to switch to the
           other player before returning TRUE.  Otherwise, return FALSE. */
        
        if (isValidSquare(row,col) == true){
            if (isSquareMarked(row,col) == false){
               board = new Mark[row][col];
               xTurn = false;
               return true;
            }
            else {
                return false;
            }
        }
          else {
               return false;
                    }
        // INSERT YOUR CODE HERE !Done Maybe????
        
        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return TRUE if the specified location is within the bounds of the board */
        if (row < 3 && row > -1){
            
            if (col < 3 && col > -1){
                
                return true;
            }
        }
       return false;
    }
	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return TRUE if the square at specified location is marked */
        if (board[row][col] != Mark.EMPTY){
            return true; 
        }
        
        else {
             return false;
        }
            
    }
	
    public Mark getMark(int row, int col) {
        
        /* Return the mark from the square at the specified location */

        return board[row][col]; // remove this line later!
            
    }
	
    public Result getResult() {
        
        /* Call "isMarkWin()" to see if X or O is the winner, if the game is a
           TIE, or if the game is not over.  Return the corresponding Result
           value */
        if (isMarkWin = true){
            if (isMarkWin.mark = Result.X){
               System.out.println(Result.X + " wins!");
            }
            if (isMarkWin.mark = Result.O) {
                System.out.println(Result.O + " wins!");
            }
        }
        if (isTie = true){
              System.out.println("It's a Tie!");  
        }
        if (isMarkWin != true && isTie != true){
               System.out.println("Game is not over!");
        }
        
        // INSERT YOUR CODE HERE !Done Maybe?

        return null; // remove this line later!
        
    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified mark is the
           winner */
        for (int i = 0; i < 3; i++) {
               
               if(board[i][0] == board[i][1] &&
                  board[i][1] == board[i][2]) {
                   mark = board[i][2];
                   return true;
               }

               if(board[0][i] == board[1][i] &&
                  board[1][i] == board[2][i]) {
                   mark = board[2][i];
                   return true;
               }
               
               if(board[0][0]==board[1][1] &&
                  board[1][1]==board[2][2]) {
                   mark = board[2][2];
                   return true;
               }
          
               if(board[0][2]==board[1][1] &&
                  board[1][1]==board[2][0]) {
                   mark = board[2][0];
                   return true;}
        
        // INSERT YOUR CODE HERE Done? Maybe?

    }
        return false; // remove this line later!
    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */
        
        for (int i = 0; i < width; i++){
            if (board[i][i] != Mark.EMPTY)
                return true;
        }
        
        // INSERT YOUR CODE HERE Done! Maybe?

        return false; // remove this line later!
        
    }

    public boolean isGameover() {
        
        /* Return TRUE if the game is over */
        
        return (Result.NONE != getResult());
        
    }

    public boolean isXTurn() {
        
        /* Getter for xTurn */
        
        return xTurn;
        
    }

    public int getWidth() {
        
        /* Getter for width */
        
        return width;
        
    }
    
    @Override
    public String toString() {
        
        StringBuilder output = new StringBuilder("  ");
        
        /* Output the board contents as a string (see examples) */
        for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
        output.append(board[i][j]);
        // INSERT YOUR CODE HERE !Done Maybe?
        
        return output.toString();
        
    }
    
}
