package com.adeeb.func;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class Main extends MIDlet {

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {

		//establish connection
		ChatSession chat = new ChatSession("127.0.0.1", 999);
		Display d = Display.getDisplay(this);
	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

}
