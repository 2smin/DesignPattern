package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Account;
import AdapterPattern.Adaptee.AccountDetailService;
import AdapterPattern.UserDetail;
import AdapterPattern.UserDetailService;

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
