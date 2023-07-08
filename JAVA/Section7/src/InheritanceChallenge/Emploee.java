package InheritanceChallenge;

public class Emploee extends Worker{
    private long employeeID;



    private String hireDate;
    private static int employeeNo = 1;

    public Emploee(String name, String birthDate,String hireDate) {
        super(name, birthDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
        this.employeeID = Emploee.employeeNo++;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
