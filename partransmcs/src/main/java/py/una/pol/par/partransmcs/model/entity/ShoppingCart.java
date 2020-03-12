package py.una.pol.par.partransmcs.model.entity;

import java.util.ArrayList;
import py.una.pol.par.commons.entity.BaseEntity;
import py.una.pol.par.parproductmcs.model.entity.Product;

public class ShoppingCart extends BaseEntity<Object>{
    
    private ArrayList <Product> products = new ArrayList<>();
    private String direccion_envio;
    private PaymentType forma_pago;
    private Double total;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public PaymentType getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(PaymentType forma_pago) {
        this.forma_pago = forma_pago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public ShoppingCart() {
        super(0,"");
    }

    public ShoppingCart(Integer id, String descripcion) {
        super(id, descripcion);
    }
}
