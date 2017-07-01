package music_shop;


public abstract class Instrument{

  String material;
  int shopPurchasePrice;
  // int salePrice;


  public Instrument(String material, int shopPurchasePrice){
    this.material = material;
    this.shopPurchasePrice = shopPurchasePrice;
    // this.salePrice = salePrice;
  }

  public String getMaterial(){
    return this.material;
  }

  public int getShopPurchasePrice(){
    return this.shopPurchasePrice;
  }

  // public int getsalePrice(){
  //   return this.salePrice;
  // }











}