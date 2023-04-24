package com.ecomerce.ecomerce.model;

import java.util.Date;

public class Orden {

    private Integer id;
    private String numero;
    private Date fechaDeCreacion;
    private Date fechaDeRecibida;

    private Double total;

    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaDeCreacion, Date fechaDeRecibida, Double total) {
        this.id = id;
        this.numero = numero;
        this.fechaDeCreacion = fechaDeCreacion;
        this.fechaDeRecibida = fechaDeRecibida;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Date getFechaDeRecibida() {
        return fechaDeRecibida;
    }

    public void setFechaDeRecibida(Date fechaDeRecibida) {
        this.fechaDeRecibida = fechaDeRecibida;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", fechaDeRecibida=" + fechaDeRecibida +
                ", total=" + total +
                '}';
    }
}
