
public class TvIteratorDemo {

	public static void main(String[] args) {
	 
		
		CeilingfanRepository CeilingfanRepository = new CeilingfanRepository();

	  
	  System.out.println("Disply Telivision list \n");
	  
	  
	      for(Iterator iter = fanRepository.getIterator(); iter.hasNext();){
	         String tv = (String)iter.next();
	         System.out.println( tv);
	      } 	
	   }
	
	
	
}
