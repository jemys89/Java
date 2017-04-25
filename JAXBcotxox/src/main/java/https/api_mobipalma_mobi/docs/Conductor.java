//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.19 a las 06:43:03 PM CEST 
//


package https.api_mobipalma_mobi.docs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Conductor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Conductor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediaValoracion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valoraciones" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ocupado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conductor", propOrder = {
    "nombre",
    "matricula",
    "modelo",
    "mediaValoracion",
    "valoraciones",
    "ocupado"
})
public class Conductor {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    protected String modelo;
    protected double mediaValoracion;
    @XmlElement(type = Double.class)
    protected List<Double> valoraciones;
    protected boolean ocupado;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad mediaValoracion.
     * 
     */
    public double getMediaValoracion() {
        return mediaValoracion;
    }

    /**
     * Define el valor de la propiedad mediaValoracion.
     * 
     */
    public void setMediaValoracion(double value) {
        this.mediaValoracion = value;
    }

    /**
     * Gets the value of the valoraciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valoraciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValoraciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValoraciones() {
        if (valoraciones == null) {
            valoraciones = new ArrayList<Double>();
        }
        return this.valoraciones;
    }

    /**
     * Obtiene el valor de la propiedad ocupado.
     * 
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Define el valor de la propiedad ocupado.
     * 
     */
    public void setOcupado(boolean value) {
        this.ocupado = value;
    }

}
