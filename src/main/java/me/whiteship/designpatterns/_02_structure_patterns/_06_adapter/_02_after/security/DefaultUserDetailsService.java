package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security;

public class DefaultUserDetailsService implements UserDetailsService{
    @Override
    public UserDetails loadUser(String username) {
        return new DefaultUserDetails(username, username);
    }
}
