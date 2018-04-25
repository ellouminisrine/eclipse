package myudf;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import java.security.*;


public class RandomUUID extends UDF { 
	
	public String evaluate(String id) {
	        
		
		 try {
			  
			   byte[] bytesOfMessage = id.getBytes("UTF-16LE");

		        MessageDigest md = MessageDigest.getInstance("MD5");
		        		
		        byte[] md5 = md.digest(bytesOfMessage);
		           
		        ByteBuffer bb = ByteBuffer.wrap(md5);
		        LongBuffer ig = bb.asLongBuffer();
		      
		        return ( new UUID(ig.get(0), ig.get(1)).toString().toUpperCase());
		        
			  } catch (Exception e) {
				  return("");
			   
			}}}
		
            

		