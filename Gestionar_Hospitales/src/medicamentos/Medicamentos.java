
package medicamentos;

/**
 *
 * @author adcan
 */
public class Medicamentos {
    
    private String nombre;
    private int stock;
    
    public Medicamentos(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock para reducir.");
        }
    }
    
    public boolean stockBajo(int limite) {
        return stock < limite;
    }
}
