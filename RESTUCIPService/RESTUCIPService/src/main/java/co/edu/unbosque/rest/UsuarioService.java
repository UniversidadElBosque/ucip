/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.rest;

import co.edu.unbosque.dto.LlaveSesion;
import co.edu.unbosque.entity.Usuario;
import co.edu.unbosque.facade.UsuarioFacade;
import co.edu.unbosque.jwt.AuthenticateUser;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eduardob
 */
@Path("/usuario")
public class UsuarioService {

    private final UsuarioFacade usuarioFacade = new UsuarioFacade();
    private final AuthenticateUser authenticateUser = new AuthenticateUser();

    @Path("validarUsuario/{usuario}/{password}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public LlaveSesion getValidarUsuario(
            @PathParam(value = "usuario") String usuarioTxt,
            @PathParam(value = "password") String passwordTxt) {
        //System.out.println("solisitud validacion usuario");

        List<Usuario> us = usuarioFacade.validateUser(usuarioTxt, passwordTxt);
        LlaveSesion llaveSesion = new LlaveSesion();

        if (!us.isEmpty()) {
            llaveSesion.setNombre("token");
            llaveSesion.setToken(authenticateUser.generarToken(us.get(0).getNombreUsuario()));
            System.out.println("retorno:" + llaveSesion.getToken());
            return llaveSesion;
        } else {
            llaveSesion.setNombre("token");
            llaveSesion.setToken("false");
            return llaveSesion;
        }
    }
}
