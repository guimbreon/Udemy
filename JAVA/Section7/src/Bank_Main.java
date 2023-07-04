public class Bank_Main {
    public static void main(String[] args) {
        Bank account = new Bank();

        //setting values
        account.setAccount_number(13);
        account.setBalance_number(12333);
        account.setEmail("gui.asc92@gmasadfoi.com");
        account.setPhone_number(91281791);

        //using them

        account.Deposit(122);
    }
}
