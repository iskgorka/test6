class HomeTask {
}
abstract class Car {
    String licensePlate;
    String brand;
    abstract double getPrice();
    void getInfo(){
        System.out.println("This is a Car.");
    }
}
class LargeCar extends Car {
    double getPrice() {
        return 100;
    }
    void getInfo() {
        System.out.println("This is a Large Car.");
    }
    double carWeighs(){
        return 5000;
    }
    double carWeighs(double weight){
        return 5000 + weight;
    }
    int carWeighs(int weight){
        return 5000 + weight;
    }
}
class Bus extends LargeCar {
    int years;
    Bus(){
        licensePlate = "no license";
        brand = "no name";
        years = 0;
    }
    Bus(String licensePlate, String brand, int years) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.years = years;
    }
    void getInfo() {
        System.out.println("This is a Bus.");
    }
}
class MiniCar extends Car {
    double getPrice(){
        return 200;
    }
    void getInfo() {
        System.out.println("This is a Mini Car.");
    }
}
class SportCar extends MiniCar {
    boolean hasRoof;
    SportCar() {
        hasRoof = false;
        licensePlate = "no";
        brand = "no";
    }
    SportCar(boolean hasRoof, String licensePlate, String brand){
        this.hasRoof = hasRoof;
        this.licensePlate = licensePlate;
        this.brand = brand;
    }
    void getInfo() {System.out.println("This is a SportCar.");}
    int countPass() {return 0;}
    String countPass(String pass) {return "Count of passagers " + pass;}
}
class Main {
    public static void main(String[] args) {
        SportCar bmw = new SportCar();
        SportCar audi = new SportCar(false, "AA 2107 AA", "Audi");
        MiniCar mini = new MiniCar();
        Bus bogdan = new Bus();
        Bus etalon = new Bus("СВ 2209 АХ", "Etalon", 10);
        LargeCar largecar = new LargeCar();
        //
        double res = largecar.carWeighs(200.1);
        System.out.println("The car weighs " + res);
        largecar.getInfo();
    }
}
