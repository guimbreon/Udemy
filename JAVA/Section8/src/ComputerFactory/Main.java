package ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("22","Lenovo",
                "240");

        Monitor monitor = new Monitor("277inch","Lenovo",27,"2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("ub","Lenovo",4,5,"v2.23");
        PersonalComputer thePC = new PersonalComputer("2298","Lenovo",theCase,monitor,motherBoard);
/*
        thePC.getMonitor().drawPixelAt(10,10,"red");
        thePC.getMotherBoard().loadProgram("Windos OS");
        thePC.getComputerCase().powersuplyOn();

 */
        thePC.powerUp();
    }
}
