package myudf;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
//import org.apache.commons.codec.*;
import java.util.UUID;
//import org.apache.commons.codec.binary.Hex;

public class RandomUUID extends UDF { 
	
	public UUID evaluate(String input) {
	        
             String md5 = DigestUtils.md5Hex(input);
             String fromatUuid =  md5.replaceFirst( "([0-9a-fA-F]{8})([0-9a-fA-F]{4})([0-9a-fA-F]{4})([0-9a-fA-F]{4})([0-9a-fA-F]+)", "$1-$2-$3-$4-$5" );
             java.util.UUID myUuid = java.util.UUID.fromString( fromatUuid );
             return myUuid ;
			}

		}