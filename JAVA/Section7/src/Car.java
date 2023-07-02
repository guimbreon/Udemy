public class Car{
    private String make = "Tesla";
    private String model = "Model 3";
    private String color = "Blue";
    private int doors = 3;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        this.make = make;
    }

    public  void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model  + " " + (convertible ? "Convertible" : ""));

    }
}
