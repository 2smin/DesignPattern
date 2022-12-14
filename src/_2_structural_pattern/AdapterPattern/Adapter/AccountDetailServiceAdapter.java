package _2_structural_pattern.AdapterPattern.Adapter;

import _2_structural_pattern.AdapterPattern.Adaptee.Account;
import _2_structural_pattern.AdapterPattern.Adaptee.AccountDetailService;
import _2_structural_pattern.AdapterPattern.UserDetail;
import _2_structural_pattern.AdapterPattern.UserDetailService;

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
