package com.fortaleza.appfortaleza.model;

public class Location {
    private String id;
    private String latitud;
    private String longitud;
    private String razon_social;
    private String telefono;
    private String email;
    private String nombre_apellidos;
    private String representante_cargo;
    private String ruc;


    public Location(){

    }

    public Location(String id, String latitud, String longitud, String razon_social, String telefono, String email, String nombre_apellidos, String representante_cargo, String ruc) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.razon_social = razon_social;
        this.telefono = telefono;
        this.email = email;
        this.nombre_apellidos = nombre_apellidos;
        this.representante_cargo = representante_cargo;
        this.ruc = ruc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }

    public String getRepresentante_cargo() {
        return representante_cargo;
    }

    public void setRepresentante_cargo(String representante_cargo) {
        this.representante_cargo = representante_cargo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
