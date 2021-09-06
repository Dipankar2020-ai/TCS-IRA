
//https://venkivijay.github.io/Java-Solutions-TCS-Xplore-Proctored-Assessment/#/
import java.util.*;
class AutonomousCar 
{
 int carld;
 String brand;
 int noOfTestsConducted;
 int noOfTestsPassed;
 String environment;
 String grade;
 AutonomousCar(int carld,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
 {
     this.carld=carld;
     this.brand=brand;
     this.noOfTestsConducted=noOfTestsConducted;
     this.noOfTestsPassed=noOfTestsPassed;
     this.environment=environment;
     //this.grade=grade;
 }
 
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		AutonomousCar[] au=new AutonomousCar[4];
		for(int i=0;i<au.length;i++)
		  {
		       int carld=sc.nextInt();
		       sc.nextLine();
		       String brand=sc.nextLine();
		       int noOfTestsConducted=sc.nextInt();
		       int noOfTestsPassed=sc.nextInt();
		       sc.nextLine();
		       String environment=sc.nextLine();
		       
		       //String grade=sc.nextLine();
		       au[i]=new AutonomousCar(carld,brand,noOfTestsConducted,noOfTestsPassed,environment);
		  }
		 // sc.nextLine();
		  String environ=sc.nextLine();
		  //sc.nextLine();
		  String bran=sc.nextLine();
		  int ans=findTestPassedByEnv(au,environ);
		  if(ans>0)
		  {
		       System.out.println(ans);
		  }
		  else{
		      System.out.println("There are no tests passed in this particular environment");
		  }
		  AutonomousCar aut=updateCarGrade(au ,bran);
		  if(aut==null)
		  {
		      System.out.println("No Car is available with the specified brand");
		  }
		  System.out.println(aut.brand+":"+aut.grade);
		 
		
	}
   public static int findTestPassedByEnv(AutonomousCar[] au,String environ)
	{
	    int sum=0;
	    for(int i=0;i<au.length;i++)
	    {
	        if(environ.equals(au[i].environment))
	        {
	          sum=sum+au[i].noOfTestsPassed;
	        }
	    }
	    return sum;
	}
	public static AutonomousCar updateCarGrade(AutonomousCar[] au,String bran)
	{
	    for(int i=0;i<au.length;i++)
	    {
	        if(bran.equals(au[i].brand))
	        {
	            int rating=(au[i].noOfTestsPassed * 100)/au[i].noOfTestsConducted;
	            if(rating>=80)
	            {
	                au[i].grade="A1";
	            }
	            else{
	                au[i].grade="B2";
	            }
	            return au[i];
	        }
	        
	    }
	    
	    return null;
	}
}
