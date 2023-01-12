package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security;

import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.AccountService;
import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.AccountUserDetailsService;

public class Client {
    public static void main(String[] args) {

        UserDetailsService userDetailsService = new DefaultUserDetailsService();
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);

    }
}
