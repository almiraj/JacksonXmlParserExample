package pkg;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {

	public static void main(String[] args) throws Exception {
		Items items = new XmlMapper().readValue(new File("xml/main.xml"), Items.class);
		System.out.println(items);
	}

}
