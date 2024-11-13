package interface1.equals_hashcode;

public class Runner {
    public static void main(String[] args) {
        Account account1 = new Account("akzholsadyk", "Akjol006");
        Account account2 = new Account("eroha12", "erasyl");
        Account account3 = new Account("ersultan", "1234");
        Account account4 = new Account("nurs", "1235");

        Account[] accounts = {account1, account2, account3, account4};
        AccountsData accountsData = new AccountsData(accounts);

        boolean result = false;

        Account accountfind = new Account("akzholsadyk", "Akjol006");

        for(Account account : accounts) {
            if(account.getLogin().equals(accountfind.getLogin()) && account.getPassword().equals(accountfind.getPassword()) ) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
