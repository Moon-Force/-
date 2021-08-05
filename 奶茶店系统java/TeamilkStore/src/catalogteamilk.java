import java.util.ArrayList;
import java.util.Iterator;

public class catalogteamilk implements Iterable<teamilk>{
	
private ArrayList<teamilk> Teamilk=new ArrayList<teamilk>();
public void addteamilk(teamilk newteamilk) {
	Teamilk.add(newteamilk);
}
public teamilk getteamilk(String code) {
	for(teamilk teamilk:Teamilk) {
		if(teamilk.getcode().equals(code)) {
			return teamilk;
		}
		}
     return null;
	}






@Override
public Iterator<teamilk> iterator() {
	// TODO Auto-generated method stub
	return Teamilk.iterator();
}

}