package chap02;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");  // 예외 처리코드
			
		}

	}
	
	
	/*
	 * public static int safeAdd(int left, int right) { return 0; }
	 */
	
	
	  public static int safeAdd(int left, int right) { 
		  if((right>0)) {
			  if(left>(Integer.MAX_VALUE - right)) { 
				  throw new ArithmeticException("오버플로우 발생"); // 예외 발생코드 
			  } 
		     }else { // right<= 0일경우
			  if(left>(Integer.MIN_VALUE - right)) { 
				  throw new ArithmeticException("오버플로우 발생"); // 예외 발생코드 } 
			    }
			 }
			  return left + right; 
	  
	    }
}
	  