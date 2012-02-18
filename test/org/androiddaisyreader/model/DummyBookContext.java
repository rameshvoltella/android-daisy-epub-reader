/**
 * 
 */
package org.androiddaisyreader.model;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Represents a dummy book for testing purposes.
 * 
 * @author jharty
 */
public class DummyBookContext implements BookContext {

	private String contents;

	public DummyBookContext(String contents) {
		this.contents = contents;
	}

	public InputStream getResource(String uri) throws FileNotFoundException {
		return new ByteArrayInputStream(contents.getBytes());
	}

	public String getCharSet(String uri) {
		return "utf-8";
	}

	public String getBaseUri() {
		return File.separator;
	}

	
}
