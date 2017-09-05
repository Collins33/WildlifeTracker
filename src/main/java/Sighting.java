public class Sighting {
private String name;
private String location;
private String time;

public Sighting(String name,String location,String time){
        this.name=name;
        this.location=location;
        this.time=time;
}

public String getName(){
        return name;

}
public String getLocation(){
        return location;
}
public String getTime(){
        return time;
}
}
