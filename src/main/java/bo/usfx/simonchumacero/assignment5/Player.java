package bo.usfx.simonchumacero.assignment5;

import java.util.logging.Logger;

// Player.java
public class Player extends Character {
  private static final Logger LOGGER = Logger.getLogger(Player.class.getName());

  public Player(final String name, final int health) {
    super(name, health);
  }

  /**
   * {@inheritDoc}
   * Overrides the attack method for Player.
   */
  @Override
  public void attack() {
    LOGGER.info(String.format("%s is attacking!", getName()));
  }

  /**
   * Uses a skill.
   *
   * @param skill The skill to be used.
   */
  public void useSkill(final String skill) {
    LOGGER.info(String.format("%s is using %s!", getName(), skill));
  }
}
