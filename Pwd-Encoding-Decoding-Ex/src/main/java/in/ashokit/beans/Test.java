package in.ashokit.beans;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Test {
	public static void main(String[] args) throws Exception {
		String pwd="abc@123";
		MessageDigest msgDigest = MessageDigest.getInstance("SHA-1");
		msgDigest.reset(); //clearing data n making obj as fresh
		msgDigest.update(pwd.getBytes());//setting the data to encrypt
		//msgDigest gives encrypted value in byte array format
		byte[] digest = msgDigest.digest();
		
		//byte Array converted to string
		String digestedPwd = new String(digest);
		System.out.println("Digested Pwd ::" +digestedPwd);//not readable format
	
	Encoder encoder = Base64.getEncoder();
	String encodeToString = encoder.encodeToString(digest);
	
	//digested +encoded value v store in DB
	System.out.println("Digested +Encoded value ::"+encodeToString);
	}
	
	
	
	

}
