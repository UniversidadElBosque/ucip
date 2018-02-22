/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;
import javax.ws.rs.core.HttpHeaders;

/**
 *
 * @author eduardob
 */
public class AuthenticateUser {

    private static final Key private_key = MacProvider.generateKey();

    public String generarToken(String usuario) {
        //System.out.println("key: " + new String(private_key.getEncoded()));

        String compactJws = Jwts.builder()
                .setSubject(usuario)
                .signWith(SignatureAlgorithm.HS256, private_key)
                .compact();

        return compactJws;
    }

    public boolean validarToken(String token) {
        try {
            System.out.println("AuthenticateUser validarToken");

            Jwts.parser().setSigningKey(private_key).parseClaimsJws(token);

            //OK, El Token es legítimo
        } catch (SignatureException e) {
            //El token NO es confiable
            System.out.println("El token NO es confiable");
            return false;
        } catch (MalformedJwtException e) {
            //El token está corrupto
            System.out.println("El token está corrupto");
            return false;
        }
        return true;
    }

    public boolean authenticate(HttpHeaders headers) {

        String header = headers.getRequestHeader(HttpHeaders.AUTHORIZATION).get(0);
        if (header == null || header.trim().isEmpty() || header.split(" ").length != 2) {
            return false;
        } else {
            String token = header.split(" ")[1];
            return validarToken(token);
        }
    }
}
