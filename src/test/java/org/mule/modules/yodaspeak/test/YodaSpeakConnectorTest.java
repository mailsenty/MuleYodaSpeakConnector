package org.mule.modules.yodaspeak.test;

import org.junit.Before;
import org.junit.Test;

import org.mule.modules.yodaspeak.YodaSpeakConnector;
import junit.framework.Assert;

public class YodaSpeakConnectorTest {

	YodaSpeakConnector yodaSpeakConnector;
	
	@Before
    public void setUp() {
		yodaSpeakConnector = new YodaSpeakConnector();
    }

	@Test
	public void testGetYodaSpeak() {
		String sentence="Hello World";
		Assert.assertNotNull(yodaSpeakConnector.getYodaSpeak(sentence));		
	}

	

}