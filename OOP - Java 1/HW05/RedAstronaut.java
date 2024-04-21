public class RedAstronaut extends Player implements Imposter {

  // a String that represents skill of the Red crewmate a String value of either inexperienced, experienced, or expert.
  private String skill;

  public RedAstronaut(String name, int susLevel, String skill) {
    super(name, susLevel);
    this.skill = skill;
  }

  public RedAstronaut(String name) {
    super(name, 15);
    this.skill = "experienced";
  }

  public void emergencyMeeting() {
    if (this.isFrozen()) {
      return;
    }

    Player[] players = getPlayers();

    // find player with highest sus level to freeze them if they aren't frozen already
    int highestSusLevel = 0;
    Player sussestPlayer;
    for (Player p : players) {
      if (!p.isFrozen()) {
        if (p.getSusLevel() > highestSusLevel && this != p) {
          sussestPlayer = p;
        } else if (p.getSusLevel() == highestSusLevel) {
          return;
        }
      }
    }

    sussestPlayer.setFrozen(true);

    gameOver();
  }

  public void freeze(Player p) {
    if (p instanceof RedAstronaut || this.isFrozen()) {
      return;
    }

    if (this.getSusLevel() < p.getSusLevel()) {
      p.setFrozen(true);
    } else {
      this.setSusLevel(this.getSusLevel() * 2);
    }

    gameOver();
  }

  public void sabotage(Player p) {
    if (p instanceof RedAstronaut || this.isFrozen()) {
      return;
    }
  }
}