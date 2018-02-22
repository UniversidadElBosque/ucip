package co.edu.unbosque.rest;

import co.edu.unbosque.entity.ClasificacionPaciente;
import co.edu.unbosque.facade.ClasificacionPacienteFacade;
import co.edu.unbosque.jwt.AuthenticateUser;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eduardob
 */
@Path("/claspaciente")
public class ClasificacionPacienteService {

    //private  UsuarioFacade usuarioFacade = new UsuarioFacade();
    private AuthenticateUser authenticateUser = new AuthenticateUser();
    private ClasificacionPacienteFacade claspacienteFacade = new ClasificacionPacienteFacade();

    @Path("clasifi")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ClasificacionPaciente> getListaCLasificacion(@Context HttpHeaders headers) {
        System.out.println("prueba: " + headers.getRequestHeader(HttpHeaders.AUTHORIZATION));
        //TODO Generalizar en un Filter
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {
            return claspacienteFacade.listarClasificacion();
        } else {
            return new ArrayList<ClasificacionPaciente>();
        }
    }
}
