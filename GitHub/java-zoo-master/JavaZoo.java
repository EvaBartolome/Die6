import java.util.concurrent.TimeUnit;

/**
 * Write a description of class JavaZoo here.
 * 
 * @author Mr. Jaffe
 * @version 2017-07-014
 */
public class JavaZoo
{
  
  public static void main(String[] args) {
    
    final int DELAY = 4;
        
    // Change BoopleSnoot to the name of your animal class and run the 'main' 
    // method to test your class.  You can also test your class using BlueJ
    String[] animalList = {"RogerJaffe"};
    
    try {
      for (int i=0; i<animalList.length; i++) {
        Object a = Class.forName(animalList[i]).newInstance();
        System.out.println("Animal #"+(i+1)+" by "+((Animal)a).getStudentName());
        System.out.println(a.toString());
        System.out.println();
        TimeUnit.SECONDS.sleep(DELAY);
      }
    } catch (Exception e) {
      System.out.println("Someone messed up!");
      System.out.println(e.toString());
    }
  }
}
