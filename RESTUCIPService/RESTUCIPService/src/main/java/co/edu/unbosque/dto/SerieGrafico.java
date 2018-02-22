package co.edu.unbosque.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@XmlRootElement
public class SerieGrafico {

    private String ejeX;
    private double ejeY;

    public SerieGrafico() {
    }

    public String getEjeX() {
        return ejeX;
    }

    public void setEjeX(String ejeX) {
        this.ejeX = ejeX;
    }

    public double getEjeY() {
        return ejeY;
    }

    public void setEjeY(double ejeY) {
        this.ejeY = ejeY;
    }

}
