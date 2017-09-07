import org.junit.Test;
import static org.junit.Assert.*;

public class SightingTest{
  @Test
  public void InstantiatesCorrectly_true(){
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");
    assertTrue(newSighting instanceof Sighting);
  }
  @Test
  public void getterMethodsWorkWell(){
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");
    assertEquals("firstSighting",newSighting.getName());
  }
  @Test
  public void clear_emptiesArrayList(){
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");
    Sighting.clear();
    assertEquals(0,Sighting.all().size());
  }
  @Test
  public void getId_returnsId_int(){
    Sighting.clear();
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");

    assertEquals(1,newSighting.getId());

  }
  @Test
  public void find_returnsTheObjectFromId_true(){
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");
    Sighting secondSighting=new Sighting("firstSighting","riverbed","morning");
    assertEquals(Sighting.find(newSighting.getId()),newSighting);
  }
  @Test
  public void getAnimal_initiallyReturnsEmptyList_ArrayList(){
    Sighting.clear();
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");
    assertEquals(0,newSighting.getAnimals().size());
  }
  @Test
  public void addAnimal_addAnimalToList_true(){
    Sighting newSighting=new Sighting("firstSighting","riverbed","morning");
    Animal myAnimal=new Animal("lion","collins","endangered");
    newSighting.addAnimal(myAnimal);
    assertTrue(newSighting.getAnimals().contains(myAnimal));
  }

}
