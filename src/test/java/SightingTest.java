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
}
