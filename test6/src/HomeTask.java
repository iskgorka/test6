class HomeTask {
}
abstract class Figure {
    abstract double getArea();
    void getName() {
        System.out.println("This is a Figure.");
    }
}
class Twodimensional extends Figure {
    double dim1;
    double dim2;
    Twodimensional(double a, double b){
        this.dim1 = a;
        this.dim2 = b;
    }
    Twodimensional(){
        dim1 = -1;
        dim2 = -1;
    }
    double getArea() {
        return dim1 * dim2;
    }
    void getName(){
        System.out.println("This is an override method in Twodimensional");
    }
}
class Threedimentional extends Figure {
    double dim1;
    double dim2;
    double weight;
    Threedimentional(double a, double b, double w){
        this.dim1 = a;
        this.dim2 = b;
        this.weight = w;
    }
    Threedimentional(){
        dim1 = -1;
        dim2 = -1;
        weight = -1;
    }
    double getArea() {
        return dim1 * dim2 * weight;
    }
    void getName(){
        System.out.println("This is an override method in Threedimentional");
    }
}
class Rectangle extends Twodimensional {
    Rectangle(double a, double b){
        super(a,b);
    }
    Rectangle(double a, int side){
        this.dim1 = a;
        this.dim2 = side;
    }
    void getName(String str){
        System.out.println("This is an overload method show in Rectangle." + str);
    }

}
class Parallelepiped extends Threedimentional {
    Parallelepiped(double a, double b, double w){
        super(a, b, w);
    }
    void getName(String str, double count){
        System.out.println("This is an overload method in Parallelepiped." + str + " count of sides: " + count);
    }
}

class Main {
    public static void main(String[] args) {
        // Figure f = new Figure(); I can`t create abstract class from object

    }
}
