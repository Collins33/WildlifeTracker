import org.junit.Test;
import static org.junit.Assert.*;

public class SightingTest{
  @Test
  public void InstantiatesCorrectly_true(){
    Sighting newSighting=new Sighting();
    assertTrue(newSighting instanceof Sighting);
  }
}
