public class Producto {

    private String nombre = "";
    private float precio = 0;

    public Producto() {

    }

    public void mostrar() {
        // int no = 124750;
        String precioTexto = String.format("%d", (int)precio);
        //str = 124.750
        System.out.println(nombre + ": " + precio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }
    public float getPrecio() {
        return this.precio;
    }

}