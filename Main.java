package proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================================");
        System.out.println("   SISTEMA PARQUEADERO AUTOS COLOMBIA - PROTOTIPO 1");
        System.out.println("==================================================");
        
        System.out.print("Ingrese la placa del vehiculo: ");
        String placa = scanner.nextLine();
        
        System.out.print("Tipo de vehiculo (1. Automovil / 2. Moto): ");
        int tipo = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();
        
        System.out.print("Ingrese el color del vehiculo: ");
        String color = scanner.nextLine();
        
        System.out.println("\n[PROCESANDO REGISTRO]...");
        System.out.println("[BD]: Verificando celdas disponibles para tipo " + tipo + "...");
        System.out.println("[BD]: Celda A-12 asignada exitosamente.");
        System.out.println("[BD]: Guardando datos de vehiculo (" + placa + ")...");
        System.out.println("[BD]: Registro de entrada creado correctamente.");
        
        System.out.println("\n==================================================");
        System.out.println("            TIQUETE DE INGRESO GENERADO          ");
        System.out.println("Placa: " + placa + " | Marca: " + marca + " | Color: " + color);
        System.out.println("Celda Asignada: A-12");
        System.out.println("Estado del Registro: ACTIVO");
        System.out.println("==================================================");
        
        scanner.close();
    }
}