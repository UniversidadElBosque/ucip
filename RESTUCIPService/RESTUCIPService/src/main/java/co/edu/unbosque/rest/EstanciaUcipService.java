/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.rest;

import co.edu.unbosque.dto.CountData;
import co.edu.unbosque.dto.DataSoporteVentilatorio;
import co.edu.unbosque.dto.IndMortalidad;
import co.edu.unbosque.dto.SerieGrafico;
import co.edu.unbosque.dto.SerieGraficoClasificacion;
import co.edu.unbosque.facade.EstanciaUcipFacade;
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
@Path("/estanciaucip")
public class EstanciaUcipService {

    private EstanciaUcipFacade estanciaUcipFacade = new EstanciaUcipFacade();
    private AuthenticateUser authenticateUser = new AuthenticateUser();

    @Path("estadisticaIngresos/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SerieGrafico> getEstadisticaIngresos(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);

                return estanciaUcipFacade.getEstadisticaIngresos(fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return new ArrayList<SerieGrafico>();
    }

    @Path("estadisticaClasificacion/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SerieGraficoClasificacion> getEstadisticaClasificacion(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);

                return estanciaUcipFacade.getEstadisticaClasificacion(fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return new ArrayList<SerieGraficoClasificacion>();
    }

    @Path("estadisticaExtubacion/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SerieGraficoClasificacion> getEstadisticaExtubacion(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);

                return estanciaUcipFacade.getEstadisticaExtubacion(fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return new ArrayList<SerieGraficoClasificacion>();
    }

    @Path("indicadorMortalidad/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IndMortalidad getIndicadorMortalidad(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);

                return estanciaUcipFacade.getIndicadorMortalidad(fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Path("causaMortalidad/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SerieGraficoClasificacion> getCausaMortaliad(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {

        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);
                return estanciaUcipFacade.getCausaMortalidad(fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<SerieGraficoClasificacion>();
    }   

    @Path("coutestanciaucip/{fecha1}/{fecha2}/{fecha3}/{fecha4}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CountData getCountEstanciasucip(
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

                return estanciaUcipFacade.getCountEstancias(fecha1, fecha2, fecha3, fecha4);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return new CountData();
    }

    @Path("pacientesventilados/{fecha1}/{fecha2}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DataSoporteVentilatorio getPacientesVentilados(
            @PathParam(value = "fecha1") String fecha1Txt,
            @PathParam(value = "fecha2") String fecha2Txt,
            @Context HttpHeaders headers) {
        System.out.println("servicio------------------------------------------------------: pacientes ventilados");
        boolean esAutorizado = authenticateUser.authenticate(headers);

        if (esAutorizado) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = sdf.parse(fecha1Txt);
                Date fecha2 = sdf.parse(fecha2Txt);

                return estanciaUcipFacade.getPacientesVentilados(fecha1, fecha2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return new DataSoporteVentilatorio();
    }
}
