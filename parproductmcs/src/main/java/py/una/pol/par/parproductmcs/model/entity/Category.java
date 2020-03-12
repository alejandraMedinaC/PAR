package py.una.pol.par.parproductmcs.model.entity;

import py.una.pol.par.commons.entity.BaseEntity;

public class Category extends BaseEntity<Object> implements Comparable<Category>{

    public Category() {
        super(0,"");
    }

    public Category(Integer id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String toString() {
        return new StringBuilder("{id: ").append(this.getId()).append(", nombre: ")
                .append(this.getNombre()).toString();
    }

    @Override
    public int compareTo(Category o) {
        return String.valueOf(this.getId()).compareToIgnoreCase(String.valueOf(o.getId()));
    }
    
}
