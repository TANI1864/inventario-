import java.util.*;
public class cliente {
    protected String nombre;
    protected String correo;
    private List<String> compras = new ArrayList<>();
    protected double totalGastado = 0;

    public cliente() {
    }

    public cliente(String nombre, String correo, List<String> compras, double totalGastado) {
        this.nombre = nombre;
        this.correo = correo;
        this.compras = compras;
        this.totalGastado = totalGastado;
    }

    public cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<String> getCompras() {
        return compras;
    }

    public void setCompras(List<String> compras) {
        this.compras = compras;
    }

    public double getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(double totalGastado) {
        this.totalGastado = totalGastado;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", compras=" + compras +
                ", totalGastado=" + totalGastado +
                '}';
    }
    public void comprarProducto(producto producto, int cantidad) {
        if (producto.getCantidadStock() < cantidad) {
            System.out.println("No hay suficiente stock para " + producto.getNombre());
            return;
        }
        if (producto instanceof vendible vendible) {
            double costo = vendible.calcularPrecioVenta(cantidad);
            producto.reducirStock(cantidad);
            totalGastado += costo;
            compras.add(cantidad + " x " + producto.getNombre() + " - Total: $" + costo);
        }
    }
    public void mostrarCompra() {
        System.out.println("\nCliente: " + nombre + " (" + correo + ")");
        for (String detalle : compras) {
            System.out.println("  " + detalle);
        }
        System.out.println("Total gastado: $" + totalGastado);
    }
}

