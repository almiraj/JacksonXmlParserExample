package pkg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Item {

	// can be omit tag name if field name is the same
	public String title;

	@JacksonXmlProperty(localName = "type")
	public ItemType type;

	@Override
	public String toString() {
		return "Item [title=" + this.title + ", type=" + this.type + "]";
	}

}
