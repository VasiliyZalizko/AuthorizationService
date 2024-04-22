package ru.netology.authorizationservice;
import org.springframework.stereotype.Repository;



import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthoritires(String user, String password) {;
    List<Authorities> list = new ArrayList<>();
    Map<String, String> users = new ConcurrentHashMap<>();
    users.put("Slava","11111");
    users.put("Oleg","22222");
    users.put("Igor","33333");
    users.put("Ivan","44444");
    users.put("Ira","55555");
    if(users.containsKey(user)&&users.get(user).equals(password)) {
        list.add(Authorities.WRITE);
        list.add(Authorities.READ);
        list.add(Authorities.DELETE);
    } else {
        return new ArrayList<>();
    }
    return list;
    }
}
