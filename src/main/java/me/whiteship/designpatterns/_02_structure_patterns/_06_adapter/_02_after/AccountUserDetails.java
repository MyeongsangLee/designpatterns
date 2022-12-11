package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after;

import lombok.AllArgsConstructor;
import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security.UserDetails;

@AllArgsConstructor
public class AccountUserDetails implements UserDetails {

    private Account account;

    @Override
    public String getUserName() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
