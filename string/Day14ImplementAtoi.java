package string;

public class Day14ImplementAtoi {
	    public int myAtoi(String s) {
	        int sign=1,res=0,idx=0;
	        
	        while(idx<s.length() && s.charAt(idx)==' ')
	        {
	            idx++; // ignore the white space if it comes before any sign or number
	        }
	        if(idx<s.length() && (s.charAt(idx)=='-'|| s.charAt(idx)=='+')){
	            if(s.charAt(idx++)=='-')
	            {
	                sign=-1;
	            }
	        }
	        
	        // construct the number digit by digit and check the overflow/underflow test case
	        while(idx<s.length() && s.charAt(idx)>='0'&&s.charAt(idx)<='9')
	        {
	            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && s.charAt(idx)-'0' > 7)){
	                return sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE;
	            }
	            res=10*res+(s.charAt(idx++)-'0');
	            
	        }
	        return res*sign;
	    }
}
