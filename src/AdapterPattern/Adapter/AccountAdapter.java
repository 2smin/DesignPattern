package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Account;
import AdapterPattern.UserDetail;

public class AccountAdapter implements UserDetail {

    Account account;

    public AccountAdapter(Account account) {
        this.account = account;
    }

    @Override
    public String getUserName() {
        return this.account.getUserName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
