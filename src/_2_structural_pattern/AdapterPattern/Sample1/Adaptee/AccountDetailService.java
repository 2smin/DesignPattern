package _2_structural_pattern.AdapterPattern.Sample1.Adaptee;

public class AccountDetailService {

    public Account findByUserName(String userName){

        Account account = new Account();
        account.setUserName(userName);
        account.setPassword(userName);
        account.setAge(45);

        return account;
    }


}
