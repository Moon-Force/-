
import java.util.ArrayList;
import java.util.List;

public class school {
   static List<Class> classes=new ArrayList<Class>();
    public static void addclass()
    {
        classes.add(new Class("1"));
        classes.add(new Class("2"));
    }
}
