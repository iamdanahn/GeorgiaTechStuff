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


}