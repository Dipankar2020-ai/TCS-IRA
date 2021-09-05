import java.util.*;
class TravelAgencies
{ 
   int regNo;
   String agencyName;
   String pakageType;
   int price;
   boolean flightFacility;
   TravelAgencies(int regNo,String agencyName,String pakageType,int price,boolean flightFacility)
     {
          this.regNo=regNo;
          this.agencyName=agencyName;
          this.pakageType=pakageType;
          this.price=price;
          this.flightFacility=flightFacility;
        
      }
     int getregno()
     {
         return regNo;
      }
    String getagencyName()
     {
       return agencyName;
      }
     String getpakageType()
      {
        return pakageType;
     }
    int getprice()
     {
       return price;
      }
    boolean getflightFacility()
     {
       return flightFacility;
     }
}
public class Main
{
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       TravelAgencies[] ta=new TravelAgencies[4];
       for(int i=0;i<ta.length;i++)
         {
            int regNo=sc.nextInt();
            sc.nextLine();
            String agencyName=sc.nextLine();
            String pakage=sc.nextLine();
            int price=sc.nextInt();
            boolean flightFacility=sc.nextBoolean();
             ta[i]=new TravelAgencies(regNo,agencyName,pakage,price,flightFacility);
      
          }
          int getregNo=sc.nextInt();
          sc.nextLine();
          String pakagetype=sc.nextLine();
          int highestprice=findAgencyWithHighestPackagePrice(ta);
          TravelAgencies travel=agencyDetailsForGivenldAndType(ta,getregNo,pakagetype);
          System.out.println(highestprice);
          if(travel==null)
           { 
              System.out.println("A string value should be printed");
            }
           else
            {
              System.out.println(travel.getagencyName()+":"+travel.getprice());

             }
      }
     public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies)
      {
         int max=agencies[0].getprice();
         for(int i=1;i<agencies.length;i++)
            {
                    if(agencies[i].getprice()>max)
                       {
                          max=agencies[i].getprice();
                        }
             }
             return max;
       }
               
    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] agencies,int getregNo,String pakagetype)
     {
        for(int i=0;i<agencies.length;i++)
        {
          if(agencies[i].getflightFacility())
             {
                if(agencies[i].getregno()==getregNo &&  pakagetype.equalsIgnoreCase(agencies[i].getpakageType()))
                   {
                         return agencies[i];
                      }
              }
           }
        return null;
     }
}