
package myudf;
import org.apache.hadoop.hive.ql.exec.UDF;


public class First extends UDF {
	
	private double result;
    public double evaluate(double num,double total) {
		result= (num*100)/total;
        return result;
    }
}