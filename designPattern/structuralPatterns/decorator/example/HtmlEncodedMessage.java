package com.coffeepoweredcrew.decorator;

import org.apache.commons.text.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	// argument type is not TextMessage because we want to allow decorator be use recursive composition 
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

	
}
