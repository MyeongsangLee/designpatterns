package me.whiteship.designpatterns._02_structure_patterns._06_adapter._01_before;

import me.whiteship.designpatterns._02_structure_patterns._06_adapter._01_before.Account;

public class AccountService {

    public Account findAccountByUsername(String username){
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}
