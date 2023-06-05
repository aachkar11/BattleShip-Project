public class Ship{
  private int row;
  private int col;
  private int length;
  private String HV;
  public Ship(int x, int y, int l, String z){ //length comes from child classes
    row = x;
    col = y;
    HV = z;
    length = l;
  }
  public String getHV(){
    return HV;
  }
  public int getLength(){
    return length;
  }
  public int getCol(){
    return col;
  }
  public int getRow(){
    return row;
  }
}
