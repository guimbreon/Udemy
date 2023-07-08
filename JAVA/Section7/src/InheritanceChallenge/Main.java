package InheritanceChallenge;

public class Main {

    public static void main(String[] args) {
        Emploee tim = new Emploee("Tim","11/11/1985","12/12/2032");
        System.out.println(tim);
        System.out.println("Age = " + tim.getage());
        System.out.println("Pay = " + tim.collectPay());


        Emploee joey = new Emploee("jORE", "11/11/1990","03/03/2020");
        System.out.println(joey);
    }
}
