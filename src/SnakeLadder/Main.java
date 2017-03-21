package SnakeLadder;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game();
		Board board = new Board();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> player = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		int p;
	    System.out.printf("How many players? \n");
	    p = Integer.parseInt(sc.nextLine());
	    for(int i = 0; i < p; i++) player.add(0);
	    for(int i = 0; i < p; i++){
            String temp = "p" + (i+1);;
            name.add(temp);
        }
	    
	    //int player = 0;
	    int boardpositionarrayindex = 0; //board index, for mapping purpose;
	    int chal = 0; //for counting the number of dice rolls;
		
	    //Game starts
	    while(true){
	        int pause;
	        System.out.printf("enter any key to roll the dice: \n");
	        pause = Integer.parseInt(sc.nextLine());

	        //rolling the dice;
	        //player = game.rolldice(player);
	        player.set(0, game.rolldice(player.get(0)));
	        
	            if(player.get(0) >= 100){
	                System.out.println(player  + " game jitsos");
	                System.out.printf(":D won won. \n%d chal e jitsos. JOSS!\n", chal);
	                //game.displayboard(player.get(0), name.get(0));
	                break;
	            }
	            
	            boardpositionarrayindex = game.boardposition(player.get(0));
	            
	            game.displayboard(player, name);

	            if(Globals.shapKatse == true) player.set(0, board.board[boardpositionarrayindex]);
	            if(Globals.chongeUtsi == true) player.set(0, board.board[boardpositionarrayindex]);
	            
	            player.add(player.get(0));
	            player.remove(0);
	            name.add(name.get(0));
	            name.remove(name.get(0));
	            System.out.println(name.get(0) + " - player er chal");
	    }
	
	}

}
