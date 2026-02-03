package dio.spring_web_api.repository;

import dio.spring_web_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user){
        if(user.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");

        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo um id: para excluir um usuário0" + id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");

        List<User> users = new ArrayList<>();

        users.add(new User("thigo", "1234556"));
        users.add(new User("suany", "0987653"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo um id: para localizar um usuário" + id));
        return new User("thiago", "password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo um id: para localizar um usuário0" + username));
        return new User("thiago", "password");
    }
}
