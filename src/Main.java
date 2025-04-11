import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear productos
        Laptop laptop1 = new Laptop("Apple", "MacBook Pro", 950, 20, "Intel i7", 16);
        Celular celular1 = new Celular("Galaxy S22", "Samsung", 700, 40, 4500, "108MP");

        // Crear cliente
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();
        System.out.print("Ingrese su correo: ");
        String correoCliente = sc.nextLine();
        cliente cliente = new cliente(nombreCliente, correoCliente);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Comprar producto");
            System.out.println("3. Ver mis compras");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInventario actual:");
                    laptop1.mostrarDetalles();
                    celular1.mostrarDetalles();
                    break;
                case 2:
                    System.out.println("\n¿Qué producto desea comprar?");
                    System.out.println("1. Laptop");
                    System.out.println("2. Celular");
                    int productoOpcion = sc.nextInt();

                    System.out.print("¿Cuántas unidades desea comprar?: ");
                    int cantidad = sc.nextInt();

                    if (productoOpcion == 1) {
                        cliente.comprarProducto(laptop1, cantidad);
                    } else if (productoOpcion == 2) {
                        cliente.comprarProducto(celular1, cantidad);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
                case 3:
                    cliente.mostrarCompra();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
