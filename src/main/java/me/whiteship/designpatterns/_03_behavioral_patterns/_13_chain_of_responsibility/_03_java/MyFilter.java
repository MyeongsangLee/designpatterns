package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibility._03_java;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("게임에 참여하신 여러분 모두 진심으로 환형합니다");
        chain.doFilter(request, response);
        System.out.println("당첨");
    }

}
