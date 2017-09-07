import java.util.List;
import java.util.ArrayList;


public class Sighting {

private String name;
private String location;
private String time;
private static List<Sighting> instances=new ArrayList<Sighting>();
private int mId;
private static List<Animal> mAnimals;

public Sighting(String name,String location,String time){
        this.name=name;
        this.location=location;
        this.time=time;
        instances.add(this);
        mId=instances.size();
        mAnimals=new ArrayList<Animal>();
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
public static List<Sighting> all() {
    return instances;
  }
public static void clear(){
  instances.clear();
}
public int getId(){
  return mId;
}
public static Sighting find(int id){
  return instances.get(id-1);
}
public List<Animal> getAnimals(){
  return mAnimals;
}
public void addAnimal(Animal animal){
  mAnimals.add(animal);
}
}
