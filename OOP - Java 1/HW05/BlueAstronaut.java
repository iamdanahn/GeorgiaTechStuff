public class BlueAstronaut extends Player implements Crewmate {
  // number of tasks that needs to be completed as an integer number
  private int numTasks; 
  // speed at which the astronaut is completing each task as a positive, nonzero integer number
  private int taskSpeed;

  public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
    super(name, susLevel);
    this.numTasks = numTasks;
    this.taskSpeed = taskSpeed;
  }
  
  public BlueAstronaut(String name) {
    this(name, 15, 6, 10);
  }

  public void emergencyMeeting() {
    if (this.isFrozen()) {
      return;
    }

    Player[] players = getPlayers();

    // find player with highest sus level to freeze them if they aren't frozen
    // already
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

  public void completeTask() {
    if (this.isFrozen()) return;
    int originalNumTasks = this.numTasks;

    if (this.taskSpeed > 20) {
      this.numTasks -= 2;
    } else {
      this.numTasks--;
    }

    if (this.numTasks < 0) {
      this.numTasks = 0;
    }

    if (this.numTasks == 0 && originalNumTasks > 0) {
      System.out.println("I have complete all my tasks");
      this.setSusLevel( (int)this.getSusLevel() * 0.5 );
    }
  }
}