package parcial;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        try {
            int vehiculosCalcular = 0;
            String decadaDelVehiculo = 0;
            int avaluoDelVehiculo = $0;
            
            Scanner sc = new Scanner(System.in);

            System.out.println("cuantos vehiculos desea calcular");
            vehiculosCalcular = sc.nextInt();

            if (vehiculosCalcular <= 0){
                System.out.println("el numero de vehiculos debe ser mayor que 0");
                return;
            }

            System.out.println("que precio tiene el vehiculo");
            avaluoDelVehiculo = sc.nextInt();

            System.out.println("cual es la decada del modelo (90, 00, 10, 20): ");
            decadaDelVehiculo = sc = new Scanner(decadaDelVehiculo);

            for (int i = 0; i < vehiculosCalcular; i++) {
                
                if(decadaDelVehiculo == 90 ){
                tasaderodamiento = 4.09;
                tasaSeguro = 0.816;
                impuestoDeRodamiento = avaluoDelVehiculo * tasaderodamiento;
                seguro = avaluoDelVehiculo * tasaSeguro;
                totalPagar = impuestoDeRodamiento + seguro;
                }
    
                else if(decadaDelVehiculo == 00 ){
                tasaderodamiento = 4.34;
                tasaSeguro = 0.798;
                impuestoDeRodamiento = avaluoDelVehiculo * tasaderodamiento;
                seguro = avaluoDelVehiculo * tasaSeguro;
                totalPagar = impuestoDeRodamiento + seguro;
                }
    
                else if(decadaDelVehiculo == 10 ){
                tasaderodamiento = 4.93;
                tasaSeguro = 0.712;
                impuestoDeRodamiento = avaluoDelVehiculo * tasaderodamiento;
                seguro = avaluoDelVehiculo * tasaSeguro;
                totalPagar = impuestoDeRodamiento + seguro;
                }
    
                else if(decadaDelVehiculo == 20 ){
                tasaderodamiento = 5.680;
                tasaSeguro = 0.699;
                impuestoDeRodamiento = avaluoDelVehiculo * tasaderodamiento;
                seguro = avaluoDelVehiculo * tasaSeguro;
                totalPagar = impuestoDeRodamiento + seguro;
                }
            
            
            }



            
            catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
        }
    
    }
}
}
