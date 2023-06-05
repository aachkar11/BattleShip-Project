import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //creation of temperary variables for user input, as well as the grids
    Scanner in = new Scanner(System.in);
    BattleGrid g = new BattleGrid();
    BattleGrid g2 = new BattleGrid();
    int temp1 = 0;
    int temp2 = 0;
    String temp3 = "";
    int valid = -1;








    //user input for the player 1 ships
    System.out.println("Player 1 is placing their ships!");
    while(valid < 0){ //the end of the code detirmines whether the loops keeps going
    System.out.println("Do you want your Destroyer to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.next().toUpperCase(); //takes in the horizontal or vertical
    if(temp3.equals("H")){ //if horizontal do this
      //take in the corrindates for the placement
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-8) for your column");
      temp2 = in.nextInt();
      valid = g.addShip(new Destroyer(temp1, temp2, temp3)); //add the ship with the length of the child class
    }
    else{
      System.out.println("Pick a number (0-8) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g.addShip(new Destroyer(temp1, temp2, temp3));
    }
      //REPEATS FOR THE NEXT 9 ITERNATIONS FOR THE NEXT 9 SHIPS
    }
    g.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Submarine to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-7) for your column");
      temp2 = in.nextInt();
      valid = g.addShip(new Submarine (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-7) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g.addShip(new Submarine (temp1, temp2, temp3));
    }
    }
    g.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Cruiser to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-7) for your column");
      temp2 = in.nextInt();
      valid = g.addShip(new Cruiser (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-7) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g.addShip(new Cruiser (temp1, temp2, temp3));
    }
    }
    g.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Battleship to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-6) for your column");
      temp2 = in.nextInt();
      valid = g.addShip(new Battleship (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-6) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g.addShip(new Battleship (temp1, temp2, temp3));
    }
    }
    g.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Carrier to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-5) for your column");
      temp2 = in.nextInt();
      valid = g.addShip(new Carrier (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-5) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g.addShip(new Carrier (temp1, temp2, temp3));
    }
    }




    //print statements in order to give player 2 a clean slate for their placements
    g.printOpenGrid();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("-----------------------------");




      //player 2 is placing thier ships, all 5
      System.out.println("Player 2 is placing their ships!");
    g2.printOpenGrid();
    valid = -1;
        while(valid < 0){ //ensure the ship is placed correctly
    System.out.println("Do you want your Destroyer to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.next().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-8) for your column");
      temp2 = in.nextInt();
      valid = g2.addShip(new Destroyer(temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-8) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g2.addShip(new Destroyer(temp1, temp2, temp3));
    }
    }
    g2.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Submarine to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-7) for your column");
      temp2 = in.nextInt();
      valid = g2.addShip(new Submarine (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-7) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g2.addShip(new Submarine (temp1, temp2, temp3));
    }
    }
    g2.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Cruiser to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-7) for your column");
      temp2 = in.nextInt();
      valid = g2.addShip(new Cruiser (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-7) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g2.addShip(new Cruiser (temp1, temp2, temp3));
    }
    }
    g2.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Battleship to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-6) for your column");
      temp2 = in.nextInt();
      valid = g2.addShip(new Battleship (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-6) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g2.addShip(new Battleship (temp1, temp2, temp3));
    }
    }
    g2.printOpenGrid();
    valid = -1;
    while(valid < 0){
    temp3 = in.nextLine();
    System.out.println("Do you want your Carrier to be Horizontal(H) or Vertical(V)? ");
    temp3 = in.nextLine().toUpperCase();
    if(temp3.equals("H")){
      System.out.println("Pick a number (0-9) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-5) for your column");
      temp2 = in.nextInt();
      valid = g2.addShip(new Carrier (temp1, temp2, temp3));
    }
    else{
      System.out.println("Pick a number (0-5) for your row");
      temp1 = in.nextInt();
      System.out.println("Pick a number (0-9) for your colomn");
      temp2 = in.nextInt();
      valid = g2.addShip(new Carrier (temp1, temp2, temp3));
    }
    }



    //print statements to clean out the console
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    
    //this if for testing purposes
  System.out.println("------------------------------------------");

    System.out.println();
    System.out.println();
    System.out.println();

    int count = 0;
    while(true){ //keeps going until one board is wiped clean
    if(count % 2 == 0){ //alernates who's turn it would be
      System.out.println("Player 2 Board");
        g2.printHiddenGrid(); //displays the players board for guessing
      //takes in the guess with temp variables from before
      System.out.println("It is Player 1's turn, enter a row for your guess");
      temp1 = in.nextInt();
      System.out.println("Enter a column for your guess");
      temp2 = in.nextInt();
      System.out.println(g.playTurn(temp1, temp2, g2));//play the turn, shows whether hit or miss
      System.out.println("-------------------------------------------------");
      System.out.println();
      if(g2.gameOver()){ //use the gameOver method to check if any ships are left standing
        System.out.println("Player 1 Wins!");
        break; //breaks from the game loop
      }
      count++; //alternates the turn
    }

      
      else{
        System.out.println("Player 1 Board"); //shows grid for guessing
        g.printHiddenGrid();
        System.out.println("It is Player 2's turn, enter a row for your guess");
        //takes in input
      temp1 = in.nextInt();
      System.out.println("Enter a column for your guess");
      temp2 = in.nextInt();
      System.out.println(g2.playTurn(temp1, temp2, g)); //playTurn method
      System.out.println("-------------------------------------------------");
      System.out.println();
        if(g.gameOver()){ //checks if the game is over
        System.out.println("Player 2 Wins!");
        break;
      }
      count++;
      }
  }
    
    /*
    to do list

    Add stuff to the grid
    */
  }
}
