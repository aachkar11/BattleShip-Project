public class Square{
  private boolean isHit;
  private boolean isOccupied;
  private boolean miss;
  
  public Square(boolean h, boolean o, boolean m){ //constructor
    isHit = h;
    isOccupied = o;
    miss = m;
  }
  public boolean getMiss(){
    return miss;
  }
public void setOccupied(boolean b){
  isOccupied = b;
}
  public boolean isOccupied(){
    return isOccupied;
  }
  public boolean isHit(){
    return isHit;
  }
  public void setHit(boolean h){
    isHit = h;
  }
  public String toString(){ //prints the status of the square
    if(!isOccupied && !miss){
      return "-";
  }
    if(!isOccupied && miss){
      return "*";
    }
    if(isOccupied && isHit){
      return "X";
    }
    if(isOccupied && !isHit){
      return "O";
    }
    return null;
}
}
