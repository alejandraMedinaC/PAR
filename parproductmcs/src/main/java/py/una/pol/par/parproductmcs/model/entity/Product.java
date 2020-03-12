package py.una.pol.par.parproductmcs.model.entity;
import py.una.pol.par.commons.entity.BaseEntity;

public class Product extends BaseEntity<Object> implements Comparable<Product>{
    private Double precio;
    private Integer cantidad;
    private Category category;
    
    public Product() {
        super(0,"");
    }

    public Product(Integer id, String nombre) {
        super(id, nombre);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Category getCategoria() {
        return category;
    }

    public void setCategoria(Category categoria) {
        this.category = categoria;
    }

    @Override
    public String toString() {
        return new StringBuilder("{id: ").append(this.getId()).append(", descripcion: ")
        .append(this.getNombre()).append(", precio: ").append(precio).append(", cantidad: ")
        .append(cantidad).append("}").toString();
    }

    @Override
    public int compareTo(Product o) {
        return this.getNombre().compareToIgnoreCase(o.getNombre());
    }
    
}
