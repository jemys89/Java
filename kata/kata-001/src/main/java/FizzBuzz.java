
public class FizzBuzz {

    /**
     * This method accepts the numbers from 1 to 100 and returns them as a String.
     * But for multiples of three it returns the String "Fizz" instead of the number and for the
     * multiples of five it returns the String "Buzz". For numbers which are multiples of both
     * three and five the method returns the String "FizzBuzz".
     *
     * @param number a number from 1 to 100
     * @return a String representing the number or the Strings "Fizz", "Buzz" and "FizzBuzz"
     *         as described above
     * @throws IllegalArgumentException if the number is not in the 1-100 range.
     */
   
	private final String fizz = "Fizz";
	private final String buzz = "Buzz";
	
	public String toFizzBuzzString(int number) {
		try{
			
		
    	String parseado = String.valueOf(number);
    	
    	if(number%3 == 0){
    		if(number % 5 == 0){
    			return "FizzBuzz";
    		}
    		return fizz;
    	}else if(number%5 == 0){
    		if(number % 3 == 0){
    			return "FizzBuzz";
    		}
    		return buzz;
    	}return parseado; }catch(IllegalArgumentException e){
    		throw e ;
    	}
    	
		// TODO: implement me
		 }

}
