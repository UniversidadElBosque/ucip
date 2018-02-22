/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.jwt;

import java.io.IOException;
import java.security.Principal;
import java.util.List;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author eduardob
 */
@Provider
@Priority(Priorities.AUTHENTICATION)
public class SecurityFilter implements ContainerRequestFilter, ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        SecurityContext originalContex = requestContext.getSecurityContext();
        String outHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        if (outHeader == null || outHeader.isEmpty() || outHeader.split(" ").length != 2) {

        } else {

        }
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().putSingle("Acces-Control-Allou-Origin", "*");
        responseContext.getHeaders().putSingle("Acces-Control-Allou-Methods", "OPTION, GET, POST, PUT, DELETE");
        responseContext.getHeaders().putSingle("Acces-Control-Allou-headers", "Content-Type, Authorization");
    }

    public static class Authorizer implements SecurityContext {
        
        List<Roles> roles;
        String username;
        boolean isSecure;

        public Authorizer(List<Roles> roles, String username, boolean isSecure) {
            this.roles = roles;
            this.username = username;
            this.isSecure = isSecure;
        }       

        @Override
        public Principal getUserPrincipal() {
            return new User(username);
        }

        @Override
        public boolean isUserInRole(String role) {
           return roles.contains(new Roles(role));
        }

        @Override
        public boolean isSecure() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getAuthenticationScheme() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public static class User implements Principal{
        
        String name;

        public User(String name) {
            this.name = name;
        }
        
        @Override
        public String getName() {
            return name;
        }
    }

}
