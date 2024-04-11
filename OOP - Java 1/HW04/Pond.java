public class Pond {

  public static void main(String[] args) {
    Frog frog1 = new Frog('Peepo');
    Frog frog2 = new Frog('Pepe', 10, 15);
    Frog frog3 = new Frog('Peepaw', 4.6, 5);
    Frog frog4 = new Frog('Lewis', 12, 100);

    Fly fly1 = new Fly(1, 3);
    Fly fly2 = new Fly(6);
    Fly fly3 = new Fly();

    frog1.setSpecies('1331 Frogs');
  }

}