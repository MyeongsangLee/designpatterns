package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security;

public class DefaultUserDetails implements UserDetails{

    private String username;
    private String password;

    public DefaultUserDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUserName() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
