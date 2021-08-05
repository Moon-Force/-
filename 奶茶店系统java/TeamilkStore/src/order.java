import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class order{
private ArrayList<onecup> ordercup= new ArrayList<onecup>();

public  void addonecup(onecup Onecup) {
	ordercup.add(Onecup);
}
public int getnumberofonecup() {
	return ordercup.size();
}
public int gettotal() {
	int totalcost=0;
	for(onecup Onecup:ordercup) {
		totalcost +=Onecup.getonecup();
	}
	return totalcost;
	
}
public void display() {
for(onecup Onecup:ordercup) {
		System.out.println(Onecup.tostring());
	}
}

		

}

