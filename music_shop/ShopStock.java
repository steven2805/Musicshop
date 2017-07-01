package music_shop;


public abstract class ShopStock{

  String name;


  public ShopStock(String name){
    this.name = name;
  }
  
  public String getItemName(){
    return this.name;
  }
}