import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface Add{
	int add(int num1, int num2);
	
}

interface Div{
	int div(int num1, int num2);
}

interface Calculate{
	int cal(int num1, int num2);
}

interface Generator{
	Set<Integer> randLotto();
	
}



public class LambdaMain2 {

	public static void main(String[] args) {
		
	      Generator lotto = () -> {            
	          
	      Set<Integer> lottoSet = new TreeSet<>();
	      final int LOTTO = 6;
	          
	      while(lottoSet.size() < LOTTO) {
	      int num = (int) ((Math.random() * 45) +1); 
	      lottoSet.add(num);
	    }
	        
	      return lottoSet;            
	    };
		
	    System.out.println(lotto.randLotto());
		
		
	
		
	Calculate c;
	
	c=(a,b) -> a + b;
	
	System.out.println(c.cal(5, 6));
	
	
	c = (a,b) -> a-b;
	System.out.println(c.cal(5, 6));
	 
	//=================================================================================
	Div div =(int num1, int num2) -> num1/num2;
	
	System.out.println(div.div(4, 2));

	Printable prn =  (s) -> System.out.println(s);
		
	
		
	prn.print("람다 완성");
	
	
	Add add = (num1,  num2) ->  num1 + num2;
	
	int hap = add.add(5, 6);
	System.out.println(hap);
	
	System.out.println(add.add(20, 90));

	}

}
