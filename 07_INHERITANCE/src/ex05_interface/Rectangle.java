package ex05_interface;

public class Rectangle implements Shape{
  private int width;
  private int height;

  public Rectangle(int w, int h){
    this.width = w;
    this.height = h;
  }
  @Override
  public double getPerimeter() {
    //둘레
    return 2*width + 2*height;
  }

  @Override
  public double getArea() {
    //넓이
    return width*height;
  }
}
