import java.util.*;
class NavalVessel
{
    int vesselId;
    String vesselName;
    int noofvoyagesplanned;
    int voyagesCompleted;
    String classificiation;
    String purpose;
    NavalVessel(int vesselId,String vesselName,int noofvoyagesplanned,int voyagesCompleted,String purpose)
    {
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noofvoyagesplanned=noofvoyagesplanned;
        this.voyagesCompleted=voyagesCompleted;
        this.purpose = purpose;
    }
    int getvesselId()
    {
        return vesselId;
    }
    String  getvesselName()
     {
         return vesselName;
     }
     int getnoofvoyagesplanned()
     {
          return noofvoyagesplanned;
     }
     int getvoyagesCompleted()
       {
           return voyagesCompleted;
       }
       String getPurpose() {
            return purpose;
          }
     void setClassification(String classification) {
            this.classificiation = classification;
         }
     String getclassficiation()
     {
         return classificiation;
     }
}


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NavalVessel [] nb=new NavalVessel[4];
		for(int i=0;i<nb.length;i++)
		{
		    int vesselId=sc.nextInt();
		    sc.nextLine();
		    String vesselName=sc.nextLine();
		    int noofvoyagesplanned=sc.nextInt();
		    int voyagesCompleted=sc.nextInt();
		   // String classficiation=sc.nextLine();
		    sc.nextLine();
            String purpose = sc.nextLine();
		    nb[i]=new NavalVessel(vesselId,vesselName,noofvoyagesplanned,voyagesCompleted,purpose);
		    
		}
		int searchpercentage=sc.nextInt();
		sc.nextLine();
	    String searchPurposeValue = sc.nextLine();
	    int avgOfVoyagesCompleted = findAvgVoyagesByPct(nb, searchpercentage);

      if (avgOfVoyagesCompleted > 0)
              System.out.println(avgOfVoyagesCompleted);
      else
           System.out.println("There are no voyages completed with this percentage");
             
       NavalVessel nav=findVesselByGrade(nb, searchPurposeValue);
        if (nav == null)
                   System.out.println("No Naval Vessel is available with the specified purpose");
       else
           System.out.println(nav.getvesselName() + "%" + nav.getclassficiation());
	    
	}
	public static int findAvgVoyagesByPct(NavalVessel [] nb,int searchpercentage)
	{
	    int avg=0,count=0;
	    for(int i=0;i<nb.length;i++)
	     {
	         int percent=(nb[i].getvoyagesCompleted()*100)/nb[i].getvoyagesCompleted();
	         if(percent>=searchpercentage)
	         {
	              avg += nb[i].getvoyagesCompleted();
                  count++;
	         }
	     }
	     if(avg==0)
	     {
	         return 0;
	     }
	     else{
	         return avg/count;
	     }
	}
	public static NavalVessel findVesselByGrade(NavalVessel [] nb, String searchPurposeValue)
	{
	    for(int i=0;i<nb.length;i++)
	    {
	          if (searchPurposeValue.equalsIgnoreCase(nb[i].getPurpose()))
	              {
	                int percentage = (nb[i].getvoyagesCompleted() * 100) / nb[i].getnoofvoyagesplanned();
	                 if(percentage==100)  nb[i].setClassification("Star");
	                  else if (percentage >= 80 && percentage <= 99) nb[i].setClassification("Leader");
                      else if (percentage >= 55 && percentage <= 79) nb[i].setClassification("Inspirer");
                     else
                        nb[i].setClassification("Striver");
                            return nb[i];
        
	                 
	              }
	       }
	       return null;
	}
}
