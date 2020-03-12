package py.una.pol.par.parproductmcs.repository;

import java.util.Collection;
import py.una.pol.par.commons.repository.Repository;
import py.una.pol.par.parproductmcs.model.entity.Category;

public interface ProductRepository <Product, Integer> extends Repository<Product, Integer> {
    
    public Collection<Product> searchProducts(String descripcion, Category category);
    
    public Collection<Product> searchProducts(String descripcion);
    
    public Collection<Product> searchProducts(Category category);
    
    public Product searchProducts(Integer id);
}
