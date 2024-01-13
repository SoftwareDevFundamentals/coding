package bo.usfx.simonchumacero.assignment5;

import java.util.logging.Logger;

// Enemy.java
public class Enemy extends Character {
  private static final Logger LOGGER = Logger.getLogger(Enemy.class.getName());

  public Enemy(final String name, final int health) {
    super(name, health);
  }

  /**
   * {@inheritDoc}
   * Overrides the attack method for Enemy.
   */
  @Override
  public void attack() {
    LOGGER.info(String.format("%s is attacking with claws!", getName()));
  }

  /**
   * Defends against an attack.
   */
  public void defend() {
    LOGGER.info(String.format("%s is defending!", getName()));
  }
}
