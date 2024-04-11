public class Pond {

  public static void main(String[] args) {
    Frog peepo = new Frog('Peepo');
    Frog pepe = new Frog('Pepe', 10, 15);
    Frog peepaw = new Frog('Peepaw', 4.6, 5);
    Frog lewis = new Frog('Lewis', 12, 100);

    Fly fly1 = new Fly(1, 3);
    Fly fly2 = new Fly(6);
    Fly fly3 = new Fly();

    // Set the species of any Frog to “1331 Frogs”
    peepo.setSpecies('1331 Frogs');

    // Print out on a new line the description of the Frog named Peepo given by the toString method.
    System.out.println(peepo.toString());
    
    // Have the Frog named Peepo attempt to eat the Fly with a mass of 6.
    peepo.eat(fly2);
    
    // Print out on a new line the description of the Fly with a mass of 6 given by the toString method.
    System.out.println(fly2.toString());

    // Have the Frog named Peepo grow by 8 months.
    peepo.grow(8);

    // Have the Frog named Peepo attempt to eat the Fly with a mass of 6.
    peepo.eat(fly2);

    // Print out on a new line the description of the Fly with a mass of 6 given by the toString method.
    System.out.println(fly2.toString());
    
    // Print out on a new line the description of the Frog named Peepo given by the toString method.
    System.out.println(peepo.toString());

    // Print out on a new line the description of your own Frog given by the toString method.
    System.out.println(lewis.toString());

    // Have the Frog named Peepaw grow by 4 months.
    peepaw.grow(4);

    // Print out on a new line the description of the Frog named Peepaw given by the toString method.
    System.out.println(peepaw.toString());

    // Print out on a new line the description of the Frog named Pepe given by the toString method.
    System.out.println(pepe.toString());

  }

}