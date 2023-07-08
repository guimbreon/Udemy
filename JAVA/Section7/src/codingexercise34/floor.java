package codingexercise34;

public class floor {
    private double width;
    private double lenght;

    public floor(double width, double lenght) {
        if (width < 0) {
            this.width = 0;
        }else {
            this.width = width;
        }
        if(lenght < 0){
            this.lenght = 0;
        }else{
            this.lenght = lenght;
        }
    }

    public double getArea(){
        return this.lenght * this.width;
    }
}
