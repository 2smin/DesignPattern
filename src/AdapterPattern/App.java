package AdapterPattern;

import AdapterPattern.Adaptee.AccountDetailService;
import AdapterPattern.Adapter.AccountDetailServiceAdapter;

public class App {


    public static void main(String[] args) {

        AccountDetailService accountDetailService = new AccountDetailService();
        AccountDetailServiceAdapter accountDetailServiceAdapter = new AccountDetailServiceAdapter(accountDetailService);
        LoginHandler loginHandler = new LoginHandler(accountDetailServiceAdapter);

        System.out.println(loginHandler.login("smlee","smlee"));
    }
}
