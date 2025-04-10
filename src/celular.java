class Celular extends producto implements vendible {
    private int capacidadBateria;
    private String camaraResolucion;


    public Celular() {
    }

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, String camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Celular: " + nombre + ", Marca: " + marca + ", Precio: $" + precio + ", Stock: " + cantidadStock +
                ", Batería: " + capacidadBateria + "mAh, Cámara: " + camaraResolucion);
    }
    @Override
    public double calcularPrecioVenta(int cantidad) {
        double precio = 0;
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.95; // 5% de descuento
        }
        return total;

    }
}

