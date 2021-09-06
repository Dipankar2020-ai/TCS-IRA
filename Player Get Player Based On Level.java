//https://github.com/venkivijay/Java-Solutions-TCS-Xplore-Proctored-Assessment/blob/master/Player_Get_Player_Based_On_Level/Question.md
import java.util.*;
class Player
{
    int playerId;
    String skill;
    String level;
    int points;
    Player(int playerId,String skill,String level,int points)
    {
        this.playerId=playerId;
        this.skill=skill;
        this.level=level;
        this.points=points;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		 Player[] pl=new Player[4];
		 for(int i=0;i<pl.length;i++)
		 {
		     int playerId=sc.nextInt();
		     sc.nextLine();
             String skill=sc.nextLine();
             String level=sc.nextLine();
             int points=sc.nextInt();
              sc.nextLine();
             pl[i]=new Player(playerId,skill,level,points);
		 }
		 String sk=sc.nextLine();
		 String lev=sc.nextLine();
		 int ans=findPointsForGivenSkill(pl,sk);
		 if(ans>0)
		 {
		     System.out.println(ans);
		 }
		 else{
		     System.out.println("The given Skill is not available");
		 }
		 Player pla= getPlayerBasedOnLevel(pl,sk,lev);
		 if(pla==null)
		 {
		     System.out.println("No player is available with specified level, skill and eligibility points");
		 }
		 else
		 {
		     System.out.println(pla.playerId);
		 }
		
		 
	}
	public static int findPointsForGivenSkill(Player[] pl,String sk)
	{
	    int sum=0;
	    for(int i=0;i<pl.length;i++)
	    {
	        if(sk.equals(pl[i].skill))
	        {
	            sum=sum+pl[i].points;
	        }
	    }
	    return sum;
	}
	public static Player getPlayerBasedOnLevel(Player[] pl,String sk,String lev)
	{
	    for(int i=0;i<pl.length;i++)
	    {
	        if(sk.equals(pl[i].skill) && lev.equals(pl[i].level))
	        {
	            if(pl[i].points>=20)
	            {
	                return pl[i];
	            }
	        }
	    }
	    return null;
	}
}
