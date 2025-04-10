public class Main {
    public static void main(String[] args) {
        // Crear productos
        Laptop laptop1 = new Laptop("Inspiron 15", "Dell", 800, 10, "Intel i7", 16);
        Celular celular1 = new Celular("Galaxy S22", "Samsung", 700, 20, 4500, "108MP");

        // Crear clientes
        cliente cliente1 = new cliente("Tania Beltran", "tanis@example.com");
        cliente cliente2 = new cliente("Le dong ming", "lee30@example.com");


        //mostrar productos
        cliente1.comprarProducto(laptop1, 6);
        cliente1.comprarProducto(celular1, 3);

        cliente2.comprarProducto(celular1, 10);

       //mostrar compras
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();

        //mostrar el inventario actualizado
        System.out.println("Inventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();

    }
}