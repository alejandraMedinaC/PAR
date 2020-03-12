import java.util.ArrayList;
import py.una.pol.par.parusrmcs.model.entity.User;
import py.una.pol.par.parusrmcs.repository.InMemUserRepository;

public class NewMain {

    public static void main(String[] args) {
        
        InMemUserRepository imur = new InMemUserRepository();
        
        User u = new User();
        
        u.setNombre("David");
        u.setApellido("Bareiro");
        u.setId(1);
        imur.add(u);
        
        ArrayList<User> users = (ArrayList<User>) imur.getAll();
        for (User user : users) {
            System.out.println("Usuario: " + user+"\n");
        }
        
    }
    
}
