package music_shop;
import behaviours.*;


public class Customer{
  String name;
  Playable instrument;

  public Customer(String name, Playable instrument){
    this.name = name;
    this.instrument = instrument;
  }

  public String getName(){
    return this.name;
  }

  public Playable hasInstrument(){
    return this.instrument;
  }



}