package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadObject {
	public static Properties getProperties() {
		File f=new File("src\\test\\resources\\config.properties");
		FileInputStream fis;
		Properties prop=new Properties();
		try {
			fis = new FileInputStream(f.getAbsolutePath());
			prop.load(fis);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
