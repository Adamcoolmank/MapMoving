package hello;
import java.util.*;
public class Simple {	
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int row = 10;
		int col = 10;
		int playerPos = 0;
		int playerWas = 0;
		int playerPosY = 0;
		int playerWasY = 0;
		int[][] map = new int[row][col];
		map [0][0] = 1;
		
		
		while(true) {
	    System.out.println("Hello There! Pick a direction to move. You start as the 1.");
	    System.out.println();
	    
	    
	    
	    for(int i = 0; i < row; i++) {
	    	for(int j = 0; j < col; j++){
	    		System.out.print(map[i][j] + " ");
	    		
	    	}
	    	System.out.println(" ");
	 
	    }
	    
	    
	    	System.out.println();
	    	System.out.print("Pick from, right , left , up , or down!(You may quit by typing cancel ---- ");
	    	
	    	 String userDirection = myObj.nextLine(); 
	    	
	    	
	    	
	    	
	    
		
		
		
		if(userDirection.equals("right") ) {
			playerPos++;
			map[playerPosY][playerPos] = 1;
			map[playerPosY][playerWas] = 0;
			playerWas++;
		}
		
		
		if(userDirection.equals("left")) {
			playerPos--;
			map[playerPosY][playerPos] = 1;
			map[playerPosY][playerWas] = 0;
			playerWas--;
			
		}
		
		
		if(userDirection.equals("down")){
			playerPosY++;
			map[playerPosY][playerPos] = 1;
			map[playerWasY][playerPos] = 0;
			playerWasY++;
		}
		
		if(userDirection.equals("up")) {
			playerPosY--;
			map[playerPosY][playerPos] = 1;
			map[playerWasY][playerPos] = 0;
			playerWasY--;
		}
		
		if(userDirection.equals("dr down")) {
			playerPos++;
			playerPosY++;
			map[playerPosY][playerPos] = 1;
			map[playerWasY][playerWas] = 0;
			playerWas++;
			playerWasY++;
		}
		
		
		if(userDirection.equals("dr up")) {
			playerPos++;
			playerPosY--;
			map[playerPosY][playerPos] = 1;
			map[playerWasY][playerWas] = 0;
			playerWas++;
			playerWasY--;
		}
		
		if(userDirection.equals("dl up")) {
			playerPos--;
			playerPosY--;
			map[playerPosY][playerPos] = 1;
			map[playerWasY][playerWas] = 0;
			playerWas--;
			playerWasY--;
		}
		
		if(userDirection.equals("dl down")) {
			playerPos--;
			playerPosY++;
			map[playerPosY][playerPos] = 1;
			map[playerWasY][playerWas] = 0;
			playerWas--;
			playerWasY++;
		}
		
		
		
		
		
		
		
		
		if(userDirection.equals("cancel")) {
			System.out.println("You ended the game....");
			break;
		}
		
		
		
		System.out.println();
		
		for(int i = 0; i < row; i++) {
	    	for(int j = 0; j < col; j++){
	    		System.out.print(map[i][j] + " ");
	    		
	    	}
	    	System.out.println(" ");
		}
		
		
			System.out.println();
			if(map[9][9] == 1) {
				System.out.println("YOU WON, CONGRATS!!!!");
				break;
			}
		
		}
		
		
	   }
}

			
		
	
	
	    
	


