/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.rest;

import co.edu.unbosque.entity.ClasificacionPaciente;
import co.edu.unbosque.entity.DashItem;
import co.edu.unbosque.facade.ClasificacionPacienteFacade;
import co.edu.unbosque.facade.DashItemFacade;
import co.edu.unbosque.jwt.AuthenticateUser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

/**
 *
 * @author eduardob
 */
@Path("/items")
public class DashItemService {

    private DashItemFacade dashItemFacade = new DashItemFacade();
    private ClasificacionPacienteFacade clasificacionFacade = new ClasificacionPacienteFacade();
    private AuthenticateUser authenticateUser = new AuthenticateUser();

    @Path("tablas")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DashItem> getListaTablas(@Context HttpHeaders headers) {
        //TODO Generalizar en un Filter
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {
            return dashItemFacade.listarTablas();
        } else {
            return new ArrayList<DashItem>();
        }
    }

    @Path("campos/{idpadre}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DashItem> getListaCampos(@PathParam(value = "idpadre") Long idpadre, @Context HttpHeaders headers) {

        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {
            return dashItemFacade.listarPorTabla(new DashItem(idpadre));
        } else {
            return new ArrayList<DashItem>();
        }

    }

    @Path("consulta/{seleccion}/{clasificacion}/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String consultar(
            @PathParam(value = "seleccion") String seleccion,
            @PathParam(value = "clasificacion") String clasificacion,
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {

        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                String[] listaVariables = seleccion.split("-");
                String[] listaClasificacion = clasificacion.split("-");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);

                System.out.println("lista variables: " + listaVariables.length);
                System.out.println("lista clasificacion: " + listaClasificacion.length);
                System.out.println("Fecha 1: " + fecha1.toString());
                System.out.println("Fecha 2: " + fecha2.toString());

                List<DashItem> variables = dashItemFacade.listarPorListaId(Arrays.asList(listaVariables));
                //Verificando variables seleccionadas
                for (DashItem d : variables) {
                    System.out.println("valor variable: " + d.getValor());
                }

                List<ClasificacionPaciente> clasificaciones = clasificacionFacade.listarPorListaId(Arrays.asList(listaClasificacion));

                for (ClasificacionPaciente c : clasificaciones) {
                    System.out.println("valor clasificación: " + c.getValor());
                }

                return dashItemFacade.listarDatos(variables, clasificaciones, fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "";
    }

}
