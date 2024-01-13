package bo.usfx.simonchumacero.assignment5;

// RPGGamePolymorphism.java
public final class RPGGamePolymorphism {
  private RPGGamePolymorphism() {
    // Evitar la instanciación de esta clase ya que es de utilidad y no necesita ser instanciada.
  }

  public static void main(final String[] args) {
    Character[] characters = new Character[3];
    characters[0] = new Player("Hero", 100);
    characters[1] = new Enemy("Dragon", 150);
    characters[2] = new Player("Wizard", 120);

    for (Character character : characters) {
      character.displayInfo();

      // Performing a common action (Polymorphism)
      character.attack();
    }
  }
}
