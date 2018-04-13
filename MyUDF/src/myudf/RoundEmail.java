package myudf;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class RoundEmail extends UDF { 

	  public String evaluate(String input) {
		  
	  Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+(@.+)$");
      Random rand = new Random();

       int  n = rand.nextInt(20) + 7;	
       Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
           
        }
        char[] possibleCaracter= (new String ("AZERTYUIOPQSDFGHJKLMWXCVBNazertyuiopqsdfghjklmwxcvbn123456789-")).toCharArray();
    	String  randomstr = RandomStringUtils.random(n, possibleCaracter);
    
       
        return(randomstr + matcher.group(1)); 
    }}