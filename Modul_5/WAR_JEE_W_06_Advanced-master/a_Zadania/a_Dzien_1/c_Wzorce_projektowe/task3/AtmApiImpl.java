package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.task3;

public class AtmApiImpl {
    private BankAccount bankAccount;
    private Loan loan;
    private PhoneCard phoneCard;
    private Transfer transfer;

    public AtmApiImpl(){
        this.bankAccount = new BankAccount();
        this.loan = new Loan();
        this.phoneCard = new PhoneCard();
        this.transfer = new Transfer();
    }

    public void deposit(){
        this.bankAccount.deposit();
    }

    public void payOut(){
        this.bankAccount.payOut();
    }

    public void transferMoney(){
        this.transfer.transferMoney();
    }

    public void recharge(){
        this.phoneCard.recharge();
    }
    public void getLoan(){
        this.loan.getLoan();
    }

}
