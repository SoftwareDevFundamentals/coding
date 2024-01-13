package bo.usfx.simonchumacero.assignment5;

import java.util.logging.Logger;

// Character.java
public class Character {
  private static final Logger LOGGER = Logger.getLogger(Character.class.getName());

  private String name;
  private int health;

  public Character(final String name, final int health) {
    this.name = name;
    this.health = health;
  }

  /**
   * Displays information about the character.
   */
  public void displayInfo() {
    LOGGER.info(String.format("Name: %s, Health: %d", name, health));
  }

  /**
   * Performs an attack action.
   */
  public void attack() {
    LOGGER.info(String.format("%s is performing an action!", name));
  }

  /**
   * Gets the name of the character.
   *
   * @return The name of the character.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the health of the character.
   *
   * @return The health of the character.
   */
  public int getHealth() {
    return health;
  }
}
