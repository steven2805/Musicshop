import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class CustomerTest {
  Customer customer ;

  @Before 
  public void before(){
    customer = new Customer("sam");
  }

  @Test 
  public void hasName(){
    assertEquals("sam", customer.getName());
  }
}