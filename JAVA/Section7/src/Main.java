public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.model = "Carrera";
//        car.color = "Red"
//        car.describeCar();
        System.out.println("make = " + car.getMake());

        car.setMake("Porsche");
        System.out.println("make = " + car.getMake());

    }
}