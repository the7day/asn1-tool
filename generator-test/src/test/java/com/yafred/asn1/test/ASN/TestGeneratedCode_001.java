/*******************************************************************************
 * Copyright (C) 2020 Fred D7e (https://github.com/yafred)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.yafred.asn1.test.ASN;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import com.yafred.asn1.runtime.ASNValueReader;

import g_001.ColorType;
import g_001.MyInteger;

public class TestGeneratedCode_001 {

	@Test
	public void test_1() throws Exception {
		MyInteger pdu = new MyInteger();
		pdu.setValue(Integer.valueOf(10));

		String asnValue = "10";
    	InputStream inputStream = new ByteArrayInputStream(asnValue.getBytes(StandardCharsets.UTF_8));
    	ASNValueReader asnValueReader = new ASNValueReader(inputStream);

		MyInteger decodedPdu = MyInteger.readPdu(asnValueReader);
		
		assertEquals(pdu.getValue(), decodedPdu.getValue());		
	}
	
	@Test
	public void test_2() throws Exception {
		ColorType pdu = new ColorType();
		pdu.setValue(Integer.valueOf(10));

		String asnValue = "10";
    	InputStream inputStream = new ByteArrayInputStream(asnValue.getBytes(StandardCharsets.UTF_8));
    	ASNValueReader asnValueReader = new ASNValueReader(inputStream);

    	ColorType decodedPdu = new ColorType();
    	ColorType.read(decodedPdu, asnValueReader);
		
		assertEquals(pdu.getValue(), decodedPdu.getValue());		
	}
	
	@Test
	public void test_3() throws Exception {
		ColorType pdu = new ColorType();
		pdu.setValue(Integer.valueOf(1));

		String asnValue = "white";
    	InputStream inputStream = new ByteArrayInputStream(asnValue.getBytes(StandardCharsets.UTF_8));
    	ASNValueReader asnValueReader = new ASNValueReader(inputStream);

    	ColorType decodedPdu = new ColorType();
    	ColorType.read(decodedPdu, asnValueReader);
		
		assertEquals(pdu.getValue(), decodedPdu.getValue());		
	}
}