package myudf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Randcivility extends UDF { 

	 public static String evaluate(String input) {


	        int r = (int) (Math.random()*2);
	        String name = new String [] {"Mr","Mrs"}[r];
	        return(name);
	    }


		 }
