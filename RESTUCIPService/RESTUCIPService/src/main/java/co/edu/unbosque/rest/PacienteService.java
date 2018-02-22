/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.rest;


import co.edu.unbosque.dto.CountData;
import co.edu.unbosque.entity.Paciente;
import co.edu.unbosque.facade.PacienteFacade;
import co.edu.unbosque.jwt.AuthenticateUser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
@Path("/paciente")
public class PacienteService {

    private PacienteFacade pacienteFacade = new PacienteFacade();
    private AuthenticateUser authenticateUser = new AuthenticateUser();

    @Path("pacienteall")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Paciente> getPcienteAll(@Context HttpHeaders headers) {

        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {
            return pacienteFacade.listar();
        } else {
            return new ArrayList<Paciente>();
        }
    }

    @Path("pacientecount/{fecha1}/{fecha2}/{fecha3}/{fecha4}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CountData getPacienteCount(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @PathParam(value = "fecha3") String fecha3Txt,
            @PathParam(value = "fecha4") String fecha4Txt,
            @Context HttpHeaders headers) {      

        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);
                Date fecha3 = sdf.parse(fecha3Txt);
                Date fecha4 = sdf.parse(fecha4Txt);

                return pacienteFacade.pacienteCount(fecha1, fecha2, fecha3, fecha4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return new CountData();
    }
}
