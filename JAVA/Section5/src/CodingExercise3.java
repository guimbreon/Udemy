public class CodingExercise3 {
    public static void main(String[] args) {
        int kiloBytes = 0;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes;
        int EkiloBytes;
        EkiloBytes = (kiloBytes % 1024);
        megaBytes = (kiloBytes / 1024);


        if (kiloBytes < 0){
            System.out.println("Invalid Value");

        }else{
            System.out.println(kiloBytes+" KB = " + megaBytes + " MB and " + EkiloBytes + " KB" );

        }
    }
}
