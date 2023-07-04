public class Bank {
    //adicional things

    public void Withdraw(int account_number, int withdraw_value){
        if (withdraw_value > balance_number) {
            System.out.println("The value you inputed is not possible");
        }else{
            this.balance_number -= withdraw_value;
            System.out.println("The value you now have has balance is : " + this.balance_number);
        }
}

     public void Deposit(int deposit_value){
        int balance_number = this.balance_number + deposit_value;
         System.out.println("The value you now have has balance is : " + balance_number);
     }
//informations
    private int account_number;
    private int balance_number;
    private String customer_name;
    private String email;

    private int phone_number;

//getters


    public int getAccount_number() {
        return account_number;
    }

    public int getBalance_number() {
        return balance_number;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone_number() {
        return phone_number;
    }


    //setters

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setBalance_number(int balance_number) {
        this.balance_number = balance_number;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}
