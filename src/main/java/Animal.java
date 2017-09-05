import java.time.LocalDateTime;

public class Animal {
private String name;
private String ranger;
private String status;
private LocalDateTime sighted;
public Animal(String name,String ranger,String status){
        this.name=name;
        this.ranger=ranger;
        this.status=status;
        sighted=LocalDateTime.now();
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
}
