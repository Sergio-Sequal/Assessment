package sequal.practica;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        
        ArrayList<Auto> misAutos = new ArrayList<>();
        
        Motor m = new Motor("3434", 2.5, "Todo terreno");
        Auto car1 = new Auto("Audi", 45, "Nuevo", m);
        Auto car2 = new Auto("Mercedez benz", 67, "Nuevo", m);
        Auto car3 = new Auto("Camaro", 49, "Nuevo", m);
        Auto car4 = new Auto("Porsche", 120);
        
        System.out.println(m);
        
//        System.out.println(car1.precioPromocional());
//        System.out.println(car2.precioPromocional());
//        System.out.println(car3.precioPromocional());
//        System.out.println(car4.precioPromocional());
//        
//        Auto.anularDescuento();
//        
//        System.out.println(car1.precioPromocional());
//        System.out.println(car2.precioPromocional());
//        System.out.println(car3.precioPromocional());
//        System.out.println(car4.precioPromocional());
        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        
        Auto.anularDescuento();
        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        
        
//      En este apartado vamos a implementar esa mala practica del TELL, DON'T ASK
        System.out.println("TELL, DON'T ASK");
        System.out.println(car1);
//        car1.getMotor().setRpmActuales(car1.getMotor().getRpmActuales() + 100);
//      Esta es la foma correcta de aplicar el TELL DON'T ASK
        car1.acelerar();
        System.out.println(car1);
//        car1.getMotor().setRpmActuales(car1.getMotor().getRpmActuales() + 100);
//      Esta es la foma correcta de aplicar el TELL DON'T ASK
        car1.acelerar();
        System.out.println(car1);
        
        
        
        
        
        
        
        
        
        
        

    }

}
