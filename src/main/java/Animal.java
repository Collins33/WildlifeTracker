import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Animal {
private String name;
private String ranger;
private String status;
private LocalDateTime sighted;
private static List<Animal> instances=new ArrayList<Animal>();
public Animal(String name,String ranger,String status){
        this.name=name;
        this.ranger=ranger;
        this.status=status;
        sighted=LocalDateTime.now();
        instances.add(this);
}

public String getName(){
        return name;
}
public String getRanger(){
        return ranger;
}
public String getStatus(){
        return status;
}
public LocalDateTime getCreatedAt(){
        return sighted;
}
public static List<Animal> all(){
  return instances;
}
public static void clear(){
  instances.clear();
}
}
