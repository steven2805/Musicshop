package music_shop;
import behaviours.*;


public class Guitar extends Instrument implements Playable, Sellable {

  int strings;
  int increase;
  

  public Guitar(String name, int shopPurchasePrice, int salePrice, String material ,int strings){
    super(name, shopPurchasePrice, salePrice, material);
    this.strings = strings;

  }

  public String play(){
    return "guitar noise";
  }

  public int markUpPecentage(){
    return shopPurchasePrice / 100 * salePrice;
  }




}