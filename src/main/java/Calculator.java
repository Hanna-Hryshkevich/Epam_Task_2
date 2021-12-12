import java.math.*;

public class Calculator {
    int bottomSideLength;
    double height;
    Point center;
    double volume;
    int bottomAreaSize;
    double pyramidSize;
    double heightOfTheTriangle;
    Calculator(Pyramid pyramid){
        this.bottomSideLength = pyramid.getLengthOfTheBottomSide();
        this.height = pyramid.getHeight();
        this.center = pyramid.getCenter();
    }
    public int getBottomAreaSize(){
        return (this.bottomSideLength * this.bottomSideLength);
    }
    public void setBottomAreaSize(){
        bottomAreaSize = this.bottomSideLength * this.bottomSideLength;
    }
    public double getHeightOfTheTriangle(){
        return heightOfTheTriangle;
    }
    public void setHeightOfTheTriangle(){
        double squaredHeight = this.height * this.height;
        double squaredHalfOfTheBottomSide = (bottomSideLength/2) * (bottomSideLength/2);
        double pifagorTheoremeImplementation = squaredHeight + squaredHalfOfTheBottomSide;
        heightOfTheTriangle = Math.sqrt(pifagorTheoremeImplementation);
    }
    public double calculateVolume(){
        volume = (getBottomAreaSize() * this.height) / 3;
        return volume;
    }
    public double calculateSize(){
        double singleTriangleSize = (getHeightOfTheTriangle() * bottomSideLength)/2;
        pyramidSize = singleTriangleSize * 3 + getBottomAreaSize();
        return pyramidSize;
    }
    public void calculateTheRatioOvVolumesDividedByPlane (){

    }
}
