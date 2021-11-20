package com.example.foodorderingapplication.Security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.foodorderingapplication.JwtTools;

public class AuthorizationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
       
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);

        if( header == null || !header.startsWith("Bearer")){
            filterChain.doFilter(request, response);
            return;
        }

        String tokenText = header.substring("Bearer".length()+1);

        UsernamePasswordAuthenticationToken authToken = JwtTools.validateJwt(tokenText);

        if(authToken != null){
            SecurityContextHolder.getContext().setAuthentication(authToken);
        }

        filterChain.doFilter(request, response);

    }
    
}
