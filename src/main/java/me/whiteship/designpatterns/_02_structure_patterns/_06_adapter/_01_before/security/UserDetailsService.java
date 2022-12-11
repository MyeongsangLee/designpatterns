package me.whiteship.designpatterns._02_structure_patterns._06_adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
