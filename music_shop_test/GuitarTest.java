import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;


public class GuitarTest{

  Guitar guitar;

  @Before 
  public void before(){
    guitar = new Guitar("Good Guitar",100, 150 ,"wood" ,6);
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
    assertEquals(50, guitar.markUpPecentage());
  }

  @Test 
  public void whatsMyProfitInPounds(){
    assertEquals(50, guitar.calculateMarkup());
  }
}










