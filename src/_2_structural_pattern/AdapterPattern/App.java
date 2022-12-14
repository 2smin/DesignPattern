package _2_structural_pattern.AdapterPattern;

import _2_structural_pattern.AdapterPattern.Adaptee.AccountDetailService;
import _2_structural_pattern.AdapterPattern.Adapter.AccountDetailServiceAdapter;

public class App {


    public static void main(String[] args) {

        AccountDetailService accountDetailService = new AccountDetailService();
        AccountDetailServiceAdapter accountDetailServiceAdapter = new AccountDetailServiceAdapter(accountDetailService);
        LoginHandler loginHandler = new LoginHandler(accountDetailServiceAdapter);

        System.out.println(loginHandler.login("smlee","smlee"));
    }
}
