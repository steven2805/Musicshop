package music_shop;


public abstract class Instrument extends ShopStock {

  String material;

  public Instrument(String name, int shopPurchasePrice, int SalePrice,String material){
    super(name,shopPurchasePrice,SalePrice);
    this.material = material;


  }

  public String getMaterial(){
    return this.material;
  }
}


