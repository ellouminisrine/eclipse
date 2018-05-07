package myudf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class RandomChild  extends UDF { 
	
	 public static String evaluate(String mydata) {
		 int r = (int) (Math.random()*2);
	        String name = new String [] {"yes","no"}[r];
	        return(name);
	 }

	}

