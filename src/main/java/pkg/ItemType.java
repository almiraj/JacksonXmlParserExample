package pkg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class ItemType {

	@JacksonXmlProperty(localName = "attr", isAttribute = true)
	public String attr;

	@JacksonXmlText
	public String text;

	@Override
	public String toString() {
		return "ItemType [attr=" + this.attr + ", text=" + this.text + "]";
	}

}
