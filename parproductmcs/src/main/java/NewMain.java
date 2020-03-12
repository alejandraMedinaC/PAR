import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import py.una.pol.par.parproductmcs.model.entity.Category;
import py.una.pol.par.parproductmcs.model.entity.Product;
import py.una.pol.par.parproductmcs.repository.InMemProductRepository;

public class NewMain {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        InMemProductRepository impr = new InMemProductRepository();
        ArrayList <Category> categories = new ArrayList<>();
        
        Product p = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        
        System.out.println("Ingrese 3 categorias:");
        for (int i = 0; i < 3; i++) {
            Category c = new Category();
            System.out.println("Ingrese el id del producto ");
            c.setId(read.nextInt());
            System.out.println("Ingrese la descripcion del producto "+c.getId());
            c.setNombre(read.next());
            categories.add(c);
        }
        
        Collections.sort(categories);
        
        p.setId(1);
        p.setNombre("Jabon de mano");
        p.setPrecio(12.34);
        p.setCantidad(3);
        p.setCategoria(categories.get(0));
        impr.add(p);
        
        p2.setId(2);
        p2.setNombre("Jabon alergenico");
        p2.setPrecio(20.99);
        p2.setCantidad(2);
        p2.setCategoria(categories.get(0));
        impr.add(p2);

        p3.setId(3);
        p3.setNombre("Jabon de burbujas");
        p3.setPrecio(15.55);
        p3.setCantidad(1);
        p3.setCategoria(categories.get(2));
        impr.add(p3);
        
        p4.setId(4);
        p4.setNombre("Cargador Portatil");
        p4.setPrecio(55.40);
        p4.setCantidad(5);
        p4.setCategoria(categories.get(1));
        impr.add(p4);
        
        for(Category category : categories){
            System.out.print("\nCategoria: " + category+ ", Producto: [");
            ArrayList<Product> products = (ArrayList<Product>) impr.searchProducts(category);
            for (Product product : products) {
                if(category.getId().equals(product.getCategoria().getId())){
                    if(products.indexOf(product)+1==products.size())
                        System.out.print(products.get(products.indexOf(product)));
                    else
                        System.out.println(products.get(products.indexOf(product))+", ");
                }
            }
            System.out.println("]}");
        }
        
//        System.out.println("\nIngrese producto a buscar:");
//        read.nextLine();
//        ArrayList<Product> products = (ArrayList<Product>) impr.searchProducts(read.nextLine());
//        System.out.println("Productos buscados:\n\t"+products);

//        ArrayList<Product> products = (ArrayList<Product>) impr.searchProducts("Jabon", categories.get(0));
//        System.out.println("Productos buscados:\n\t"+products);

        System.out.println("Productos Buscados: "+ impr.searchProducts(categories.get(0)));
        
        System.out.println("\nProducto buscado:\n\t"+impr.searchProducts(2));
    }
    
}
