package daos;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    
    T get(Class<T> t,int id);
     
    List<T> getAll(Class<T> t);
     
    void save(T t);
     
    void update(T t);
     
    void delete(T t);
}