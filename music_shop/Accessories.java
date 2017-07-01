package music_shop;


public abstract class Accessories extends ShopStock{

  Boolean memorabilia;


  public Accessories(String name,int shopPurchasePrice, int salePrice, Boolean memorabilia){
    super(name,shopPurchasePrice, salePrice);
    this.memorabilia = memorabilia;
  }

  public String getAccessoryname(){
    return this.name;
  }

  public Boolean memorabilia(){
    return this.memorabilia;
  }

}