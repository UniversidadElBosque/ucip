/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.rest;

import co.edu.unbosque.entity.Acudiente;
import co.edu.unbosque.facade.AcudienteFacade;
import co.edu.unbosque.jwt.AuthenticateUser;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

/**
 *
 * @author eduardob
 */
@Path("/acudiente")
public class AcudienteService {

    private AcudienteFacade acudienteFacade = new AcudienteFacade();
    private AuthenticateUser authenticateUser = new AuthenticateUser();

    @Path("acudienteall")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Acudiente> getAcudienteAll(@Context HttpHeaders headers) {
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {
            return acudienteFacade.listar();
        } else {
            return new ArrayList<Acudiente>();
        }

    }

}
