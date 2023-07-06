public class HDFCBankAccount {
    private int balance = 100;
    public HDFCBankAccount(int balance) {
        this.balance  = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    @override
    public Boolean isMinimumBalance(int money) {
        if(this.balance + money > 2000) {
            return true;
        }else{
            return false;
        }
    }

    @override
    public Boolean withdrawMoney(int money) {
        if(this.balance >= money) {
            this.balance -= money;
            return true;
        }
        return false;
    }
}
