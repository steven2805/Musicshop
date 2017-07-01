package music_shop;
import behaviours.*;



public class SheetMusic extends Accessories{

  String songName;
  String artistName;

  public SheetMusic(String accessoryname, String artistName, Boolean memorabilia,String songname, int shopPurchasePrice, int salePrice){
    super(accessoryname, shopPurchasePrice, salePrice, memorabilia );
    this.artistName = artistName;
    this.songName = songName;
  }


  public String getArtistname(){
    return this.artistName;
  }

  public String getSongName(){
    return this.songName;
  }

}