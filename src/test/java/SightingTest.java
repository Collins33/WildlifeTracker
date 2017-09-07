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
}
