package music_shop;


public abstract class Instrument extends ShopStock {

  String material;
  int shopPurchasePrice;
  int salePrice;


  public Instrument(String name,String material, int shopPurchasePrice, int salePrice){
    super(name);
    this.material = material;
    this.shopPurchasePrice = shopPurchasePrice;
    this.salePrice = salePrice;
  }

  public String getMaterial(){
    return this.material;
  }

  public int getShopPurchasePrice(){
    return this.shopPurchasePrice;
  }

  public int getSalePrice(){
    return this.salePrice;
  }











}