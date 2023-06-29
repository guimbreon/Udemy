public class Sum3_and_5_Challenge {
    public static void main(String[] args) {
        int counter = 0;
        int summing = 0;
        for (int number = 0; number <= 1000; number++){
            if (number % 3 == 0 && number % 5 == 0 && counter <= 5) {
                System.out.println(number);
                counter += 1;
                summing += number;
            }
        }
        System.out.println(summing);
    }
}
