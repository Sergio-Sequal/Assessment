package poo;

public class Principal {

    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();        
        Auto a = new Auto(true, "Audi", "DFDF8989", "2023");

        //(UPCASTING) Generalización en acción
        Vehiculo v = a;
        //(DOWNCASTING) Especialización en acción
//        Auto a2 = (Auto) v;
//        a2.prenderAire();

        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(7, "Auteco", "FFD89SD", "2023"));
        c.listarVehiculos();

    }

}
