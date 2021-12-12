public class Pyramid {
    Point center = new Point();
    private double height;
    private int lengthOfTheBottomSide;
    Pyramid(Point center, double height, int length){
        this.center = center;
        this.height = height;
        this.lengthOfTheBottomSide = length;
    }
    public Point getCenter(){
        return center;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public int getLengthOfTheBottomSide(){
        return lengthOfTheBottomSide;
    }
    public void setLengthOfTheBottomSide(int length){
        this.lengthOfTheBottomSide = length;
    }
}

