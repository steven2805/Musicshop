package music_shop;
import behaviours.*;


public class Guitar extends Instrument implements Playable {

  int strings;

  public Guitar(String material, int shopPurchasePrice ,int strings){
    super(material, shopPurchasePrice);
    this.strings = strings;

  }

  public String play(){
    return "guitar noise";
  }



}