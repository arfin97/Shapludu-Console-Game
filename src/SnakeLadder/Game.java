package SnakeLadder;
import java.util.Random;
import java.util.*;



public class Game {
	Random rand = new Random();
	Board board = new Board();
	
	
	int rolldice(int player){
	    int dice = rand.nextInt(6) + 1;
	    System.out.printf("\nDICE GAVE YOU: %d\n", dice);
	    return player + dice;
	}
	
	int boardposition(int player){
	    Globals.shapKatse = false;
	    Globals.chongeUtsi = false;
	    int index = 0;
	    //board e loop chalaya cell er index ber kore
	    for(int i = 0; i < Globals.n ; i++){
	        if(player == board.board[i]){
	            index = i;
	        }
	    }

	    //cell er index e shap ase ki na check kore..
	    if(board.snake[index] < 0){
	    	System.out.printf("%d te Shape katse\n", board.board[index]);
	        System.out.printf("Tore %d ghor theika %d ghore namai diche\n\n",board.board[index], board.board[(-1)*board.snake[index]]);
	        Globals.shapKatse = true;
	        index = (-1)*board.snake[index];
	    }

	    //cell er index e ladder ase ki na chek kore..
	    if(board.ladder[index] > 0){
	    	System.out.printf("%d te laf dichos\n", board.board[index]);
	    	System.out.printf("Tore %d ghor theika %d ghore uthai diche\n\n",board.board[index], board.board[(1)*board.ladder[index]]);
	    	Globals.chongeUtsi = true;
	        index = (1)*board.ladder[index];
	    }
	    return index;
	}
	
	
	void displayboard(int player){
		System.out.printf("               \n");
	    for(int i = 0; i < Globals.n; i++){
	        if(i != player){
	        	System.out.printf("%02d ", board.board[i]);
	        }else{
	        	System.out.printf("* ");
	        }
	        if((i+1)%10 == 0) System.out.printf("\n");
	    }
	    System.out.printf("\n");
	}
}
