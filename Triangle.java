public class Triangle extends GeometricObject {
private double side1;
private double side2;
private double side3;
public Triangle() {
side1 = 1.0;
side2 = 1.0;
side3 = 1.0;
}
public Triangle(double side1, double side2, double side3) {
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
public double getSide1() {
return side1;
}
public void setSide1(double side1) {
this.side1 = side1;
}
public double getSide2() {
return side2;
}
public void setSide2(double side2) {
this.side2 = side2;
}
public double getSide3() {
return side3;
}
public void setSide3(double side3) {
this.side3 = side3;
}
public String toString()
{ return "Triangle-side1= " +  side1+"\n"+"Triangle-side2= "+ side2+"\n"+"Triangle-side3= "+ side3;
}
@Override
public double getArea() {
	double area;
   double semiperimeter=( side1 + side2+ side3)/2.0;
   area = Math.sqrt(semiperimeter*(semiperimeter - side1)*(semiperimeter - side2)*(semiperimeter - side3));

   return area;
}
@Override
public double getPerimeter() {
	double perimeter;
   perimeter= side1+ side2+ side3;
   return perimeter;
}


}