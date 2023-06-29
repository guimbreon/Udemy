public class SwitchExpressionChallenge {
    public static void main(String[] args) {
        int Day = 12;
        printDayOfWeek(Day);
    }
    public  static  void printDayOfWeek(int Day){
        if (Day <= 6 && Day >= 0){
            switch (Day) {
                case 0 -> System.out.println("Today is Sunday");
                case 1 -> System.out.println("Today is Monday");
                case 2 -> System.out.println("Today is Terça");
                case 3 -> System.out.println("Today is Quarta");
                case 4 -> System.out.println("Today is Quinta");
                case 5 -> System.out.println("Today is Sexta");
                case 6 -> System.out.println("Today is Sabado");
            }
        }else{
                System.out.println("Invalid Day");
            }
        }


}
