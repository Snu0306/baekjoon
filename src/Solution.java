class Solution {
	static int product=1;
	
	
    public static String solution(int[] numbers) {
        String answer = "";
        int[] real = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	
        }
        
        for(int i : real) {
        	//System.out.println(i);
        }
        
        return answer;
    }
    
    
    public static int theNumberOf(int number) {
    	product *= number;
    	if(number==1) return product;
    	return theNumberOf(--number);
    }
    
    public static void main(String[] args) {
		int[] temp ={6,10,2}; 
    	solution(temp);
	}
}