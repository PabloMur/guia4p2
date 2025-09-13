package Entidades;

public class Libro {
    private static int contador = 1;
    private final int id;
    private String titulo;
    private String autor;
    private double precio;
    private int cantidad;

    //Constructor
    public Libro(String titulo, String autor, double precio, int cantidad) {
        this.id = contador;
        contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Libro(){
        this.id = contador;
        contador++;
    }

    //Setters and Getters
    public int getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return this.precio;
    }
    public  void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Methods
    public void Vender(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " copias.");
        } else {
            System.out.println("No hay suficientes copias disponibles para vender " + cantidad + " unidades.");
        }
    }


    public void AumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Cantidad aumentada en " + cantidad + " copias.");
    }
    @Override
    public String toString() {
        return "Libro[" +
                "id=" + this.getId() +
                ", título=" + this.getTitulo() +
                ", autor=" + this.getAutor() +
                ", precio=" + this.getPrecio() +
                ", copias disponibles=" + this.getCantidad() +
                "]";
    }
}
