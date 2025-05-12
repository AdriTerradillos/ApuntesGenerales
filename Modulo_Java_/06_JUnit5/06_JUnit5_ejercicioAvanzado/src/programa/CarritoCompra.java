package programa;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Producto> productos = new ArrayList<>();

    /**  
     * Añade un producto al carrito.  
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**  
     * Elimina el producto con id dado.  
     * @throws IllegalArgumentException si no existe  
     */
    public void eliminarProducto(int id) {
        boolean removed = productos.removeIf(p -> p.getId() == id);
        if (!removed) {
            throw new IllegalArgumentException("Producto con id " + id + " no encontrado");
        }
    }

    /**  
     * @return número de productos en el carrito  
     */
    public int getCantidadProductos() {
        return productos.size();
    }

    /**  
     * @return array de IDs de los productos  
     */
    public int[] listarIds() {
        return productos.stream().mapToInt(Producto::getId).toArray();
    }

    /**  
     * @return suma de PVP (sin IVA) de cada producto  
     */
    public double calcularTotalSinIva() {
        return productos.stream()
                        .mapToDouble(Producto::damePvp)
                        .sum();
    }
}
