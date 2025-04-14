package string;

public class Day17NonRepeating {

	    static char nonRepeatingChar(String s) {
	        int n=s.length();
	        for(int i=0;i<n;i++)
	        {
	            boolean isFound=false;
	            for(int j=0;j<n;++j)
	            {
	                if(i!=j&&s.charAt(i)==s.charAt(j)){
	                isFound=true;
	                break;
	                }
	            }
	        
	        if(!isFound)
	        return s.charAt(i);
	        }
	    return '$';
	    }
	

}
