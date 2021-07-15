import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.zip.DataFormatException;

public class catalogload implements catalogloadio {
	private final static String DELIM = "_";

	static private catalogload singletonInstant = null;
	

	public catalogteamilk loadcatalog(String flname) throws 
	                             IOException, FileNotFoundException, DataFormatException {
		File file = new File(flname);
		catalogteamilk Catalogt = new catalogteamilk();
		if (!file.exists() || file.isDirectory()) {
			throw new FileNotFoundException();

		}
		InputStream input = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
		String line = reader.readLine();

		while (line != null) {
			teamilk tmk = null;
			tmk = readteamilk(line);
			Catalogt.addteamilk(tmk);
			line = reader.readLine();
		}
		reader.close();
		return Catalogt;
	}

	private teamilk readteamilk(String line) throws DataFormatException {
		// TODO Auto-generated method stub
		StringTokenizer tokenizer = new StringTokenizer(line, DELIM);
		if (tokenizer.countTokens() != 4) {
			throw new DataFormatException(line);
		} else {

			try {

				return new teamilk(tokenizer.nextToken(), tokenizer.nextToken(),
						Integer.parseInt(tokenizer.nextToken()), tokenizer.nextToken());

			} catch (NumberFormatException nfc) {
				throw new DataFormatException(line);
			}
		}
	}
}