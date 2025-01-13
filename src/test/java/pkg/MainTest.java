package pkg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class MainTest {

	@Test
	public void test1() throws Exception {
		Items items = new XmlMapper().readValue(new File(MainTest.class.getResource("test.xml").getFile()), Items.class);
		System.out.println(items.itemList);

		assertEquals("TITLE", items.title);

		assertEquals(2, items.itemList.size());

		assertEquals("TITLE1", items.itemList.get(0).title);
		assertEquals("ATTR1", items.itemList.get(0).type.attr);
		assertEquals("TYPE1", items.itemList.get(0).type.text);

		assertEquals("TITLE2", items.itemList.get(1).title);
		assertNull(items.itemList.get(1).type.attr);
		assertEquals("TYPE2", items.itemList.get(1).type.text);
	}

	@Test
	public void test_illegal_element() throws Exception {
		try {
			new XmlMapper().readValue(new File(MainTest.class.getResource("test_illegal_element.xml").getFile()), Items.class);
			fail();
		} catch (UnrecognizedPropertyException e) {
			assertTrue(e.getMessage().contains("Unrecognized field \"illegal-element\""));
		}
	}

	@Test
	public void test_illegal_attr() throws Exception {
		try {
			new XmlMapper().readValue(new File(MainTest.class.getResource("test_illegal_attr.xml").getFile()), Items.class);
			fail();
		} catch (UnrecognizedPropertyException e) {
			assertTrue(e.getMessage().contains("Unrecognized field \"illegal-attr\""));
		}
	}

}
