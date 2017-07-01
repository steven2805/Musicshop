import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;


public class SheetMusicTest{

  SheetMusic sheetmusic;

  @Before 
  public void before(){
    sheetmusic = new SheetMusic("ACDC song sheet","ACDC", false,"Highway to Hell", 23, 100);
  }

  @Test
  public void hasName(){
    assertEquals("ACDC song sheet", sheetmusic.getItemName());
  }


}