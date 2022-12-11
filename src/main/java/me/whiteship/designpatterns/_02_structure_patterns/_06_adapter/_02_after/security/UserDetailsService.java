package me.whiteship.designpatterns._02_structure_patterns._06_adapter._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
