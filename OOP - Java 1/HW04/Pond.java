public class Pond {

  public static void main(String[] args) {
    Frog peepo = new Frog('Peepo');
    Frog pepe = new Frog('Pepe', 10, 15);
    Frog peepaw = new Frog('Peepaw', 4.6, 5);
    Frog lewis = new Frog('Lewis', 12, 100);

    Fly fly1 = new Fly(1, 3);
    Fly fly2 = new Fly(6);
    Fly fly3 = new Fly();

    peepo.setSpecies('1331 Frogs');

    System.out.println(peepo.toString());
    
    peepo.eat(fly2);
    
  }

}