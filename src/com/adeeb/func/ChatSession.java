package com.adeeb.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
/*
 * Class for communicating with the server
 * Copyright 2013 Zola Mahlaza
 */
public class ChatSession {
	DataOutputStream out;
	DataInputStream in;
	public ChatSession(String ip, int port){
		try{
			StreamConnection gateway = (StreamConnection)Connector.open("socket://"+ip+":"+port);
			in = gateway.openDataInputStream();
			out = gateway.openDataOutputStream();
			System.err.println("debug: ChatSession constructor ok");
		}catch(Exception e){
			System.err.println("debug: ChatSession constructor ok");
			e.printStackTrace();
			System.exit(1); // might not work, dont know the mobile phone version
		}
	}
	/*
	 * Method for sending msg to server
	 */
	protected void send(String msg) throws IOException{
		out.writeUTF(msg);
	}
	/*
	 * Method for recieving msg from server
	 */
	protected void receive() throws IOException{
		String reply;
		while(!((reply = in.readUTF()).equals(""))){
			//while there more lines of text
		}
	}
}
