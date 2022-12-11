package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after;

import lombok.AllArgsConstructor;
import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security.UserDetails;
import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security.UserDetailsService;

@AllArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
