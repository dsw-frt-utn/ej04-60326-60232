package data;

import domain.*;
import java.util.ArrayList;
import java.util.Optional;

public class Persistencia {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Responsable> responsables = new ArrayList<>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<>();
    private static ArrayList<Marca> marcas = new ArrayList<>();
    
    private static void inicializarResponsables(){
        Responsable r1 = new Responsable("Carlos Gómez", "25444111", "3815551111");
        Responsable r2 = new Responsable("Laura Pérez", "30111222", "3815552222");
        responsables.add(r1);
        responsables.add(r2);
    }
    
    private static void inicializarSucursales(){
        Sucursal s1 = new Sucursal("SUC01", "Av. Belgrano 1200", "Tucumán", responsables.get(0));
        Sucursal s2 = new Sucursal("SUC02", "San Martín 450", "Yerba Buena", responsables.get(1));
        
        sucursales.add(s1);
        sucursales.add(s2);
    }
    
    private static void inicializarMarcas(){
        Marca m1 = new Marca("Renault", "Francia");
        Marca m2 = new Marca("Toyota", "Japon");
        Marca m3 = new Marca("Volkswagen", "Alemania");
        Marca m4 = new Marca("Mercedes Benz", "Alemania");
        Marca m5 = new Marca("Mazda", "Japon");
        Marca m6 = new Marca("Peugeot", "Francia");
        
        marcas.add(m1);
        marcas.add(m2);
        marcas.add(m3);
        marcas.add(m4);
        marcas.add(m5);
        marcas.add(m6);
    }
    
    public static void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public static ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
    public static java.util.ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }
    
    public static java.util.ArrayList<Marca> getMarcas() {
        return marcas;
    }
    
    public static Optional<Vehiculo> getVehiculo(String patente){
        return vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente))
                .findFirst();
    }
    
    public static void inicializar(){
        inicializarResponsables();
        inicializarSucursales();
        inicializarMarcas();
    }
}