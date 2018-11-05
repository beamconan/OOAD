package pkg10192018java;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pisit
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
       /* Movie new1 = new Movie(1);
        Movie new2 = new Movie(2, "english", "thai");
        System.out.println(new1);
        Showtime st1 = new Showtime(new2);*/
       List<String> list = new ArrayList<String>();
       
        Cinema cinema = Cinema.getInstance();
        cinema.addTest("Test1");
        cinema.addTest("Test2");
        list = cinema.getTest();
        System.out.println(list);
    }
    
}
