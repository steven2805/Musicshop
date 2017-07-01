import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;


public class GuitarTest{

  Guitar guitar;

  @Before 
  public void before(){
    guitar = new Guitar("wood",100 ,6);
  }

  @Test 
  public void hasMaterial(){
    assertEquals("wood", guitar.getMaterial());
  }

  @Test 
  public void checkPurchasePrice(){
    assertEquals(100, guitar.getShopPurchasePrice());
  }
}