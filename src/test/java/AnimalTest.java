/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class AnimalTest {
@Test
public void instantiatesWell(){
        Animal myAnimal=new Animal("lion","collins","endangered");
        assertTrue(myAnimal instanceof Animal);
}

@Test
public void getterMethodsWorkwell_true(){
        Animal myAnimal=new Animal("lion","collins","endangered");
        assertEquals("lion", myAnimal.getName());
}
@Test
public void getCreatedAt_getsWhenAnimalWasInstantiated_now(){
        Animal myAnimal=new Animal("lion","collins","endangered");
        assertEquals(LocalDateTime.now().getDayOfWeek(),myAnimal.getCreatedAt().getDayOfWeek());
}
@Test
public void all_returnsAllInstancesOfAnimal_true(){
        Animal myAnimal=new Animal("lion","collins","endangered");
        Animal secondAnimal=new Animal("tiger","collins","endangered");
        assertEquals(true,Animal.all().contains(myAnimal));
        assertEquals(true,Animal.all().contains(secondAnimal));
}
@Test
public void clear_clearsTheArrayWithAnimals_true(){
        Animal myAnimal=new Animal("lion","collins","endangered");
        Animal.clear();
        assertEquals(0,Animal.all().size());
}
@Test
public void getId_returnsUniqueId_int(){
        Animal.clear();
        Animal myAnimal=new Animal("lion","collins","endangered");
        assertEquals(1,myAnimal.getId());
}
}
