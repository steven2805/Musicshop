package music_shop;
import behaviours.*;


public class Guitar extends Instrument implements Playable, Sellable {

  int strings;
  int markup;

  public Guitar(String material, int shopPurchasePrice, int salePrice ,int strings){
    super(material, shopPurchasePrice, salePrice);
    this.strings = strings;

  }

  public String play(){
    return "guitar noise";
  }

  public int markUp(){
    markup = salePrice - shopPurchasePrice;
    return markup;
  }



}