import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;


public class GuitarTest{

  Guitar guitar;

  @Before 
  public void before(){
    guitar = new Guitar("Good Guitar","wood",100, 150 ,6);
  }

  @Test
  public void checkName(){
    assertEquals("Good Guitar",guitar.getItemName());
  }

  @Test 
  public void hasMaterial(){
    assertEquals("wood", guitar.getMaterial());
  }

  @Test 
  public void checkPurchasePrice(){
    assertEquals(100, guitar.getShopPurchasePrice());
  }

  @Test
  public void checkSalePrice(){
    assertEquals(150, guitar.getSalePrice());
  }


  @Test 
  public void checkGuitarIsMakingNoise(){
    assertEquals("guitar noise", guitar.play());
  }

  @Test
  public void checkMarkUp(){
    assertEquals(50, guitar.markUp());
  }
}










