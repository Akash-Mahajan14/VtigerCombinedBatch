package genericLibrary;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/***
 * 
 * @author Sumanth
 *
 */
public class PropertyFileUtil implements IAutoConstants {
	
	public String readDataFromPropertyFile(String path,String key) {
		File abspath = new File(path); 
		Properties property = null;
		try {
			FileInputStream fin=new FileInputStream(abspath);
			property = new Properties();
			property.load(fin);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(key);
	}
}


