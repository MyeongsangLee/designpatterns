package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after;


import lombok.Getter;
import lombok.Setter;
import me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security.UserDetails;

@Getter @Setter
public class Account implements UserDetails {

    private String name;

    private String password;

    private String email;

    @Override
    public String getUserName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
