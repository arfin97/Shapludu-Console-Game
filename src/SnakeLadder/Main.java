package SnakeLadder;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game();
		Board board = new Board();
		Scanner sc = new Scanner(System.in);

	    int player = 0;
	    int boardpositionarrayindex = 0; //board index, for mapping purpose;
	    int chal = 0; //for counting the number of dice rolls;
		
	    //Game starts
	    while(true){
	        int pause;
	        System.out.printf("enter any key to roll the dice: \n");
	        pause = Integer.parseInt(sc.nextLine());

	        //rolling the dice;
	        player = game.rolldice(player);
	        
	            if(player >= 100){
	                System.out.println(player  + " game jitsos");
	                System.out.printf(":D won won. \n%d chal e jitsos. JOSS!\n", chal);
	                game.displayboard(player);
	                break;
	            }

	            boardpositionarrayindex = game.boardposition(player);

	            game.displayboard(boardpositionarrayindex);

	            if(Globals.shapKatse == true) player = board.board[boardpositionarrayindex];
	            if(Globals.chongeUtsi == true) player = board.board[boardpositionarrayindex];
	            chal++;
	    }
	
	}

}
