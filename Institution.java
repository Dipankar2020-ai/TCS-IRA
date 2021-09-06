//https://venkivijay.github.io/Java-Solutions-TCS-Xplore-Proctored-Assessment/#/
import java.util.*;
class Institution
{
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;
    Institution(int institutionId,String institutionName,int noOfStudentsPlaced,int noOfStudentsCleared, String location)
    {
        this.institutionId=institutionId;
        this.institutionName=institutionName;
        this.noOfStudentsPlaced=noOfStudentsPlaced;
        this.noOfStudentsCleared=noOfStudentsCleared;
        this.location=location;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Institution[] in=new Institution[4];
		for(int i=0;i<in.length;i++)
		{
		    int institutionId=sc.nextInt();
		    sc.nextLine();
		    String institutionName=sc.nextLine();
		    int noOfStudentsPlaced=sc.nextInt();
		    int noOfStudentsCleared=sc.nextInt();
		    sc.nextLine();
		    String location=sc.nextLine();
		    in[i]=new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
		}
		String loc=sc.nextLine();
	
		String iname=sc.nextLine();
		int ans=findNumClearancedByLoc(in,loc);
		if(ans>0)
		{
		   System.out.println(ans);
		}
		else{
		    System.out.println("There are no cleared students in this particular location");
		}
		Institution ins= updateInstitutionGrade( in, iname);
		if(ins==null)
		{
		    System.out.println("No Institute is available with the specified name");
		}
		else{
		    System.out.println(ins.institutionName+":"+ins.grade);
		}
		
	}
	public static int findNumClearancedByLoc(Institution[] in,	String loc)
	{
	    int sum=0;
	    for(int i=0;i<in.length;i++)
	    {
	        if(loc.equals(in[i].location))
	        {
	            sum=sum+in[i].noOfStudentsCleared;
	        }
	    }
	    return sum;
	}
	public static Institution updateInstitutionGrade(Institution[] in,	String iname)
	{
	    int rating;
	    for(int i=0;i<in.length;i++)
	    {
	        if(iname.equals(in[i].institutionName))
	        {
	           rating=(in[i].noOfStudentsPlaced * 100)/(in[i].noOfStudentsCleared);
	            if(rating==80)
	            {
	                in[i].grade="A";
	            }
	            else{
	                in[i].grade="B";
	            }
	            return in[i];
	        }
	    }
	    return null;
	}
}
