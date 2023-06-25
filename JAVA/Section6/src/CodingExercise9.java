import java.awt.event.MouseAdapter;

public class CodingExercise9 {
    public static void main(String[] args) {

    }
    public static double area(double radius){
        double area;

        if (radius < 0 ) {
            area = -1;
        }else{
            area = Math.PI * radius * radius;
        }
        return area;
    }

    public static double area(double x, double y) {
        double area;
        if (x < 0 || y < 0){
            area = -1;
        }else{
            area = x * y;
        }

        return area;
    }
}
