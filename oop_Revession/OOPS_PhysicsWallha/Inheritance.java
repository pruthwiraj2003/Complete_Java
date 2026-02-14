class Pokemon{
  int power;
  String type;

    

    public Pokemon(String type,int power) {
      this.power = power;
      this.type= type;
    }

    public Pokemon() {
    }
    

    void print(){
      System.out.println(this.power+" "+this.type);
    }
    
    
  
}
class LegendaryPokemon extends  Pokemon{
  String abality;
}
public class Inheritance {
  public static void main(String[] args) {
    LegendaryPokemon mewtwo =new LegendaryPokemon();
    mewtwo.abality="Pressure";
    Pokemon pikachu = new Pokemon();
    
  }

  
}
