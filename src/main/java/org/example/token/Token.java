package org.example.token;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class Token {
    private String password;
    private String username;

    public JwtBuilder generateToken(String username){
        return Jwts.builder().setSubject(username).setIssuedAt(new Date());

    }
}
