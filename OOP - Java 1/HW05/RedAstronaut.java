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



}