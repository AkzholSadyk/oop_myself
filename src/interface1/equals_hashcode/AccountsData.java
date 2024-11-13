package interface1.equals_hashcode;

public class AccountsData {
    private Account[] accounts;

    public AccountsData(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] getAccounts(){
        return accounts;
    }
}
