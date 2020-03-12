package py.una.pol.par.parproductmcs.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import py.una.pol.par.commons.entity.Entity;
import py.una.pol.par.parproductmcs.model.entity.Category;
import py.una.pol.par.parproductmcs.model.entity.Product;

public class InMemProductRepository implements ProductRepository<Product, Integer>{
    
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public Collection<Product> searchProducts(String descripcion, Category category) {
        if(descripcion==null || category==null){
            return null;
        }else{
            ArrayList<Product> prod = new ArrayList<>();
            for(Product product : products){
                if(product.getNombre().toLowerCase().contains(descripcion.toLowerCase()) && category.getId().equals(product.getCategoria().getId())){
                    prod.add(product);
                }
            }
            Collections.sort(prod);
            return prod;
        }
    }
    
    @Override
    public Collection<Product> searchProducts(String descripcion) {
        if(descripcion==null){
            return null;
        }else{
            ArrayList<Product> prod = new ArrayList<>();
            for(Product product : products){
                if(product.getNombre().toLowerCase().contains(descripcion.toLowerCase())){
                    prod.add(product);
                }
            }
            Collections.sort(prod);
            return prod;
        }
    }

    @Override
    public Collection<Product> searchProducts(Category category) {
        if(category==null){
            return null;
        }else{
            ArrayList<Product> prod = new ArrayList<>();
            for(Product product : products){
                if(category.getId().equals(product.getCategoria().getId())){
                    prod.add(product);
                }
            }
            Collections.sort(prod);
            return prod;
        }
    }

    @Override
    public Product searchProducts(Integer id) {
        if(id==null){
            return null;
        }else{
            Product prod = new Product();
            for(Product product : products){
                if(id.equals(product.getId())){
                    prod=product;
                    break;
                }
            }
            return prod;
        }
    }

    @Override
    public void add(Product entity) {
        products.add(entity);
    }

    @Override
    public void remove(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Product entity) {
        Product retValue = null;
        for (Product product : products) {
            if (product.getId() == entity.getId()) {
                //
            }
        }
    }

    @Override
    public boolean contains(Integer id) {
        boolean retValue = false;
        for (Product product : products) {
            if (product.getId() == id) {
                retValue = true;
            }
        }
        return retValue;
    }

    @Override
    public Entity get(Integer id) {
        Product retValue = null;
        for (Product product : products) {
            if (product.getId() == id) {
                retValue = product;
            }
        }
        return retValue;
    }

    @Override
    public Collection<Product> getAll() {
        return products;
    }
    
}
