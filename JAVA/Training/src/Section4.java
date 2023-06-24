public class Section4{
    public static void main(String[] args) {

        boolean isAlien = true;
        if (isAlien == false){
            //print só ele deixa tudo numa linha só
            System.out.print("its not an alien");
            System.out.print("It's an alien");
        }
        else{
            //println ele separa as linhas
            System.out.println("It's an alien");
            System.out.println("It's an alien");
        }
        int topScore = 90;
        if (topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 70;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greathen than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This in not supposed to happen");
        }


        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to out contry");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);



        double firstNumber = 20.00d;
        double secondNumber = 80.00d;

        double thirdNumber = (firstNumber + secondNumber) * 100d;

        double result = thirdNumber % 40.00d;

        boolean booleanResult = result == 0.00;

        System.out.println(booleanResult);

        if (!booleanResult){
            System.out.println("got some remainder");
        }

    }
}