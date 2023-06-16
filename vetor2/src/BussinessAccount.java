import entities.Account;

public class BussinessAccount extends Account {

    private double loanLimit;

    private BussinessAccount(){
        super();
    }

    public BussinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
}
