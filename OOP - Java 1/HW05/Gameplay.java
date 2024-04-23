public class Gameplay {

  public static void main(String[] args) {
   BlueAstronaut b1 =  new BlueAstronaut("Bob", 20, 6, 30);
   BlueAstronaut b2 =  new BlueAstronaut("Heath", 30, 3, 21);
   BlueAstronaut b3 =  new BlueAstronaut("Albert", 44, 2, 0);
   BlueAstronaut b4 =  new BlueAstronaut("Angel", 0, 1, 0);

   RedAstronaut a1 = new RedAstronaut("Liam", 19, "experienced");
   RedAstronaut a2 = new RedAstronaut("Suspicious Person", 100, "expert");
  
    
   // 1. Have RedAstronaut Liam sabotage BlueAstronaut Bob. After the sabotage:
   a1.sabotage(b1);

   // 2. Have RedAstronaut Liam freeze RedAstronaut Suspicious Person:
   a1.freeze(a2);

   // 3. Have RedAstronaut Liam freeze BlueAstronaut Albert. After the freeze:
   a1.freeze(b3);

   // 4. Have BlueAstronaut Albert call an emergency meeting:
   b3.emergencyMeeting();

   // 5. Have RedAstronaut Suspicious Person call an emergency meeting:
   a2.emergencyMeeting();
   
   // 6. Have BlueAstronaut Bob call an emergency meeting:
   b1.emergencyMeeting();

   // 7. Have BlueAstronaut Heath complete tasks:
   b2.completeTask();

   // 8. Have BlueAstronaut Heath complete tasks:
   b2.completeTask();

   // 9. Have BlueAstronaut Heath complete tasks:
   b2.completeTask();

   // 10. Have RedAstronaut Liam freeze Angel:
   a1.freeze(b4);

   // 11. Have RedAstronaut Liam sabotage Bob twice:
   a1.sabotage(b1);
   a1.sabotage(b1);

   // 12. Have RedAstronaut Liam freeze Bob:
   a1.freeze(b1);

   // 13. Have BlueAstronaut Angel call emergency meeting:
   b4.emergencyMeeting();

  }
}