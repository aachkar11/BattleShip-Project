public class BattleGrid{
  private Square[][] grid;

  public BattleGrid(){
    grid = new Square[10][10]; //creates a 2D array for the squares
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[0].length; j++){
        grid[i][j] = new Square(false, false, false); //all the squares are false at first
      }
    }
  }
  public void setSquare(int r, int c, boolean hit, boolean occupied, boolean miss){
    grid[r][c] = new Square(hit, occupied, miss); //changes a square within the 2D array, for public access
  }
  public Square getSquare(int r, int c){
    return grid[r][c]; //returns the square at a certain point
  }
  public String playTurn(int row, int col, BattleGrid otherBoard){
    if(otherBoard.getSquare(row, col).isOccupied()){ //if the square is occupied
      if(!otherBoard.getSquare(row, col).isHit()){ //hasn't been hit yet
      otherBoard.setSquare(row, col, true, true, false); //square is now hit
      return "Hit!"; //tells the user it is a hit
      }
      else{  //if it has been hit, still occupied, then tell the user it has already been hit
        return "This square has been hit before!";
      }
    }
    else{//if no ship is on the square
      otherBoard.setSquare(row, col, false, false, true); //make the square 'miss'
      return "You missed!";//tell user they missed
    }
  }
  public boolean gameOver(){ //checks if there are any ships left to be hit, returns true if the game is over
    boolean game = true;
    for(int i = 0; i < grid.length; i++){
      for(int k = 0; k < grid[i].length; k++){
        if(grid[i][k].isOccupied() && !grid[i][k].isHit()){ //if any ships remain unhit, then make it false
          game = false;
        }
      }
    }
    return game; //return the boolean value
  }
  public void printHiddenGrid(){ //prints the grid with the ships hidden
    System.out.print(" ");
    for(int i = 0; i < 10; i++){
      System.out.print(" " + i); //prints the numbers on the top
    }
    System.out.println();
    int counter = 0;
    System.out.print("0 ");
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[0].length; j++){
        if(grid[i][j].isHit()){ //if there is a hit, print X
          System.out.print("X ");
        }
        else if(grid[i][j].getMiss()){ //if miss, print *
          System.out.print("* ");
        }
        else{
          System.out.print("- "); //if neither, unknown prints -
        }
      }
      System.out.println(); //next lune
      counter++; //increases the number for the side counter
      if(counter < 10){
      System.out.print(counter + " "); //rprints the numbers on the side
    }
    }
    System.out.println();
  }
  public void printOpenGrid(){ //prints the unhidden grid
    System.out.print(" ");
    for(int i = 0; i < 10; i++){ //prints the numbers on the top
      System.out.print(" " + i);
    }
    System.out.println();
    int counter = 0;
    System.out.print("0 ");
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[0].length; j++){
        System.out.print(grid[i][j] + " "); //uses the toString method to print the status of the sqaures
      }
      System.out.println();
      counter++;
      if(counter < 10){ //side numbers
      System.out.print(counter + " ");
    }
    }
    System.out.println();
  }
  public int addShip(Ship ships){ //returns -1 or 1 to show the main method if the ship is valid
    if(ships.getHV().equals("H")){ //for horizontal ships
      boolean temp = true; //for whether the ship placement is valid
      for(int i = ships.getCol(); i < ships.getLength() + ships.getCol(); i++){
        if(grid[ships.getRow()][i].isOccupied()){
          temp = false;
        }
      }
      if(!temp){
        System.out.print("There is already a ship somewhere here, try again");
        System.out.println();
        return -1; //returns -1 to inform the main method to keep running
      }
      else{
        for(int i = ships.getCol(); i < ships.getLength() + ships.getCol(); i++){ //loops all the squares
          grid[ships.getRow()][i].setOccupied(true); //set all the squares to occupied
      }
        System.out.println("Your ship has been placed!");
        System.out.println();
        return 1; //breaks the main method loop
      }
    }
    else{ //same for horizontal
      boolean temp = true;
      for(int i = ships.getRow(); i < ships.getLength() + ships.getRow(); i++){
        if(grid[i][ships.getCol()].isOccupied()){
          temp = false;
        }
      }
      if(!temp){
        System.out.print("There is already a ship somewhere here, try again");
        System.out.println();
        return -1;
      }
      else{
        for(int i = ships.getRow(); i < ships.getLength() + ships.getRow(); i++){
          grid[i][ships.getCol()].setOccupied(true);
      }
        System.out.println("Your ship has been placed!");
        System.out.println();
        return 1;
      }
    }
  }

}
