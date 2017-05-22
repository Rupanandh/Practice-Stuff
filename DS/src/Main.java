
public class Main {

	
	public static void main(String[] args)
	{
		
		System.out.println("Score:"+totalScore(new String[]{"5","-2","4","Z","X","9","+","+"},8));
	}
	
	
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static int totalScore(String[] blocks, int n)
	{
	    int totalScore =0;
	    int [] scores= new int [n];
	    int scoreIndex=0;
		// WRITE YOUR CODE HERE
		if(n<=0){
		    return totalScore;
		}
		else{
		    for(int index=0; index<blocks.length;index++)
		    {
		       if(!(blocks[index]=="Z" || blocks[index]=="+" || blocks[index]=="X"))
		       {
		    	   
		           System.out.println(blocks[index]);
		           scores[scoreIndex]=Integer.parseInt(blocks[index]);
		           
		       }
		       else if(blocks[index]=="Z")
		       {  System.out.println("Z "+blocks[index]);
		           scoreIndex--;
		           scoreIndex--;
		       }
		       else if(blocks[index]=="X")
		       {  System.out.println("X "+blocks[index]);
		           scores[scoreIndex]=2*scores[scoreIndex-1];
		           
		       }
		       else if(blocks[index]=="+")
		       {  System.out.println("+ "+blocks[index]);
		           scores[scoreIndex]=scores[scoreIndex-1]+scores[scoreIndex-2];
		       }
		       
		 	scoreIndex++;	  
		   }
		   for(int score:scores)
		   {
			   System.out.println(score);
		       totalScore +=score;
		   }
		}
		return totalScore;
	}

}
