import java.util.List;

public class Zoo {
  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<? extends Bird> list) {
    // TODO fix method declaration
    System.out.println("Feeding birds");
    // TODO feed birds in the cycle
    for (Bird bird : list) {
      System.out.print(bird + " - ");
      bird.eat();
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting a bird to a section - " + bird);
    // TODO check flying bird wings
    bird.checkWings();
    // TODO add a bird to the list and print it
    list.add(bird);
    System.out.println("Birds in the list:");
    list.forEach(System.out::println);


  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<? super Bird> list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding a bird to the birds list");
    // TODO add a bird to list
    list.add(newBird);
    // TODO print birds in the cycle
    list.forEach(System.out::println);

  }

}