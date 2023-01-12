package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after;

import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security.LoginHandler;
import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
//        AccountService accountService = new AccountService();
//        //accountService.findAccountByUsername("keesun");
//        UserDetailsService UserDetailsService = new AccountUserDetailsService(accountService);

        UserDetailsService UserDetailsService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(UserDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);

    }
}
