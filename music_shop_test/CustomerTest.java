import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class CustomerTest {
  Customer customer ;
  Guitar guitar;

  @Before 
  public void before(){
    guitar = new Guitar("Good guitar",100,150,"wood",5);
    customer = new Customer("sam", guitar);

  }

  @Test 
  public void hasName(){
    assertEquals("sam", customer.getName());
  }

  @Test 
  public void hasInstrument(){
    assertNotNull(customer.hasInstrument());
  }







}