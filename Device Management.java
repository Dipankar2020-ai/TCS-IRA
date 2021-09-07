//https://venkivijay.github.io/Java-Solutions-TCS-Xplore-Proctored-Assessment/#/
import java.util.*;
class  Phone
{
    int phoneid;
    String os;
    String brand;
    int price;
    Phone(int phoneid,String os,String brand,int price)
    {
        this.phoneid=phoneid;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Phone[] p=new Phone[4];
		for(int i=0;i<p.length;i++)
		{
		    int phoneid=sc.nextInt();
		    sc.nextLine();
		    String os=sc.nextLine();
		    String brand=sc.nextLine();
		    int price=sc.nextInt();
		    sc.nextLine();
		    p[i]=new Phone(phoneid,os,brand,price);
		}
		String bran=sc.nextLine();
		String osp=sc.nextLine();
		int ans=findPriceForGivenBrand(p,bran);
		if(ans>0)
		{
		   System.out.println(ans);
		}
		else{
		    System.out.println("The given Brand is not available");
		}
		Phone pn=getPhoneIdBasedOnOs(p,osp);
		if(pn==null)
		{
		    System.out.println("No phones are available with specified os and price range");
		}
		else
		{
		    System.out.println(pn.phoneid);
		}
		
		
	}
	public static int findPriceForGivenBrand(Phone[] p,String bran)
	{
	    int sum=0;
	    for(int i=0;i<p.length;i++)
	    {
	        if(bran.equalsIgnoreCase(p[i].brand))
	        {
	            sum=sum+p[i].price;
	        }
	    }
	    return sum;
	}
	public static Phone getPhoneIdBasedOnOs(Phone[] p, String osp)
	{
	    for(int i=0;i<p.length;i++)
	    {
	        if(osp.equalsIgnoreCase(p[i].os))
	        {
	            if(p[i].price>=50000)
	            {
	                return p[i];
	            }
	        }
	    }
	    return null;
	}
}
