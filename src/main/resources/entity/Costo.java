package entity;
// Generated 19/05/2017 05:19:01 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Costo generated by hbm2java
 */
public class Costo  implements java.io.Serializable {


     private int idCosto;
     private CategoriaInscripcion categoriaInscripcion;
     private String descripcion;
     private Date fechaAntes;
     private Date fechaDespues;
     private BigDecimal cantidadAntes;
     private BigDecimal cantidadDespues;

    public Costo() {
    }

    public Costo(int idCosto, CategoriaInscripcion categoriaInscripcion, String descripcion, Date fechaAntes, Date fechaDespues, BigDecimal cantidadAntes, BigDecimal cantidadDespues) {
       this.idCosto = idCosto;
       this.categoriaInscripcion = categoriaInscripcion;
       this.descripcion = descripcion;
       this.fechaAntes = fechaAntes;
       this.fechaDespues = fechaDespues;
       this.cantidadAntes = cantidadAntes;
       this.cantidadDespues = cantidadDespues;
    }
   
    public int getIdCosto() {
        return this.idCosto;
    }
    
    public void setIdCosto(int idCosto) {
        this.idCosto = idCosto;
    }
    public CategoriaInscripcion getCategoriaInscripcion() {
        return this.categoriaInscripcion;
    }
    
    public void setCategoriaInscripcion(CategoriaInscripcion categoriaInscripcion) {
        this.categoriaInscripcion = categoriaInscripcion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaAntes() {
        return this.fechaAntes;
    }
    
    public void setFechaAntes(Date fechaAntes) {
        this.fechaAntes = fechaAntes;
    }
    public Date getFechaDespues() {
        return this.fechaDespues;
    }
    
    public void setFechaDespues(Date fechaDespues) {
        this.fechaDespues = fechaDespues;
    }
    public BigDecimal getCantidadAntes() {
        return this.cantidadAntes;
    }
    
    public void setCantidadAntes(BigDecimal cantidadAntes) {
        this.cantidadAntes = cantidadAntes;
    }
    public BigDecimal getCantidadDespues() {
        return this.cantidadDespues;
    }
    
    public void setCantidadDespues(BigDecimal cantidadDespues) {
        this.cantidadDespues = cantidadDespues;
    }




}


