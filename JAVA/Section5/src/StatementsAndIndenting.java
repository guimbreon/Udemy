public class StatementsAndIndenting {
    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;
       System.out.println("This is a teste");

       System.out.println("This is" +
               "\nAnoter" +
               "\nAnoter" +
               "\nStill more");
       //Assim funciona mas não recomendado
        //int anotherVariable=50;myVariable--; System.out.println("myVariable = "+myVariable);
        //o recomendado é:
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);
        if (myVariable == 0){
            System.out.println("It's now zero");
        }
    }
}
