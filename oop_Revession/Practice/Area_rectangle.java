public class Area_rectangle {
  int lenght;
  int width;

    public Area_rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }
  int Area(){
    
    return lenght*width;
  }
  public static void main(String[] args) {
    Area_rectangle area = new Area_rectangle(12, 34);
    System.out.println("Area of the rectangle "+area.Area());

  }
  
}
