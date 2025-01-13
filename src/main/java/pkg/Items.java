package pkg;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "items")
public class Items {

	// also public getter method
	@JacksonXmlProperty(localName = "title")
	public String title;

	@JacksonXmlProperty(localName = "item")
	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Item> itemList;

	@Override
	public String toString() {
		return "Items [title=" + this.title + ", itemList=" + this.itemList + "]";
	}

}
