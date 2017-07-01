package music_shop;
import behaviours.*;


public abstract class ShopStock{

  String name;
  int shopPurchasePrice;
  int salePrice;
  int markUp;


  public ShopStock(String name, int shopPurchasePrice, int salePrice){
    this.name = name;   
    this.shopPurchasePrice = shopPurchasePrice;
    this.salePrice = salePrice;
    
    
  }
  
  public String getItemName(){
    return this.name;
  }

  public int getShopPurchasePrice(){
    return this.shopPurchasePrice;
  }

  public int getSalePrice(){
    return this.salePrice;
  }

  public int calculateMarkup(){
   return this.salePrice - this.shopPurchasePrice;
  }
}