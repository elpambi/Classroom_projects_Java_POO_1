public class Animal {
    // Propiedades
    double precio;
    String descripcion;
    int cantidad;
    String especie;
    boolean oferta;
    boolean animalDeAyuda;

    // Constructor 1: Dados todos las propiedades
    public Animal(double precio, String descripcion, int cantidad, String especie, boolean oferta, boolean animalDeAyuda) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.especie = especie;
        this.oferta = oferta;
        this.animalDeAyuda = animalDeAyuda;
    }

    // Constructor 2: Dados todos las propiedades menos los boolean
    public Animal(double precio, String descripcion, int cantidad, String especie) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.especie = especie;
        this.oferta = false;  // Valor por defecto
        this.animalDeAyuda = false;  // Valor por defecto
    }

    // Constructor 3: Dadas todas las propiedades menos los boolean y la descripción (debe poner "sin descripción")
    public Animal(double precio, int cantidad, String especie) {
        this.precio = precio;
        this.descripcion = "Sin descripción";
        this.cantidad = cantidad;
        this.especie = especie;
        this.oferta = false;  // Valor por defecto
        this.animalDeAyuda = false;  // Valor por defecto
    }

    // Método para imprimir la información del animal
    public void imprimirInfo() {
        System.out.println("Especie: " + especie);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Oferta: " + (oferta ? "Sí" : "No"));
        System.out.println("Animal de ayuda: " + (animalDeAyuda ? "Sí" : "No"));
        System.out.println("------------------------------");
    }
}

