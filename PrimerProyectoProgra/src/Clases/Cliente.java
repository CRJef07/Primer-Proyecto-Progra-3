package Clases;

import java.util.ArrayList;

public class Cliente {

    private ArrayList<Pedido> pedidos;
    private String nombre, direccion, numero;

    public Cliente(String nombre, String direccion, String numero, ArrayList<Pedido> pedidos) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        this.pedidos = pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumero() {
        return numero;
    }
}
