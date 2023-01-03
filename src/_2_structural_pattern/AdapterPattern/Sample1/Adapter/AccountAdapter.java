package _2_structural_pattern.AdapterPattern.Sample1.Adapter;

import _2_structural_pattern.AdapterPattern.Sample1.Adaptee.Account;
import _2_structural_pattern.AdapterPattern.Sample1.UserDetail;

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
