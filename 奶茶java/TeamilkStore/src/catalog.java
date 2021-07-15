import java.util.ArrayList;
import java.util.Iterator;

public class catalog implements Iterable<addfood>{
	
private ArrayList<addfood> AddFood=new ArrayList<addfood>();
public void addaddfood(addfood newAddfood) {
	AddFood.add(newAddfood);
}
public addfood getaddfood(String code) {
	for(addfood Addfood:AddFood) {
		if(Addfood.getcode().equals(code)) {
			return Addfood;
		}
		}
     return null;
	}





@Override
public Iterator<addfood> iterator() {
	// TODO Auto-generated method stub
	return AddFood.iterator();
}

}
