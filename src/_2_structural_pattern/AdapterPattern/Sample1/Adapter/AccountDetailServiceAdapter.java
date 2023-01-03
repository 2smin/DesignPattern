package _2_structural_pattern.AdapterPattern.Sample1.Adapter;

import _2_structural_pattern.AdapterPattern.Sample1.Adaptee.Account;
import _2_structural_pattern.AdapterPattern.Sample1.Adaptee.AccountDetailService;
import _2_structural_pattern.AdapterPattern.Sample1.UserDetail;
import _2_structural_pattern.AdapterPattern.Sample1.UserDetailService;

public class AccountDetailServiceAdapter implements UserDetailService {


    AccountDetailService accountDetailService;

    public AccountDetailServiceAdapter(AccountDetailService accountDetailService) {
        this.accountDetailService = accountDetailService;
    }

    @Override
    public UserDetail loadUser(String userName) {
        Account account = accountDetailService.findByUserName(userName);

        return new AccountAdapter(account);
    }
}
