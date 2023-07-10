package ComputerFactory;

public class PersonalComputer extends Product{

    private ComputerCase ComputerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerFactory.ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        ComputerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }


    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
    public void powerUp(){
        ComputerCase.powersuplyOn();
        drawLogo();
    }
/*
    public ComputerFactory.ComputerCase getComputerCase() {
        return ComputerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
    */

}
