package myudf;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomLastdigit extends UDF { 

	  public String evaluate(String input) {
		

         String upToNCharacters = input.substring(0, Math.min(input.length(),5));
         String n = input.substring(5, input.length());
         int length= n.length();
  
	     String  randomstr =RandomStringUtils.random(length,n);
	     return (upToNCharacters+ randomstr);
}
	}
