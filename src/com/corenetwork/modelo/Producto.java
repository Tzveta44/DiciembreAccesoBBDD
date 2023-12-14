package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioUnitario;
    private int unidadesStock;

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                '}'+ "\n";
    }
