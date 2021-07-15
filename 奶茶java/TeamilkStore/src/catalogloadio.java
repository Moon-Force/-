import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.DataFormatException;

public interface catalogloadio {
catalogteamilk loadcatalog(String flname)throws IOException,FileNotFoundException,DataFormatException;
}
