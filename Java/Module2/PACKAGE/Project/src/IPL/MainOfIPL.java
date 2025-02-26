package IPL;
public class MainOfIPL 
{
  public static void main(String[] args) 
  {
	IPL i1=new IPL("Chennai Super Sings",10,10,0,20);
	IPL i2=new IPL("Royal Challengs Bangalore",10,9,1,18);
	IPL i3=new IPL("Punjab Kings",11,8,2,10);
	IPL i4=new IPL("Sunrises Hyderabad",12,6,6,12);
	IPL i5=new IPL("Mumbai Indians",10,5,5,10);
	IPL i6=new IPL("Delhi Derdevils",11,4,7,8);
	IPL i7=new IPL("Kolkata Knight Riders",12,2,10,4);
	IPL i8=new IPL("Rajasthan Royals",10,1,9,2);
	System.out.println("Team\t\t\tNo Of Match\t\tWon\t\tLost\t\tPoints");
	System.out.println("---------------------------------------------------------------------------------------");
    System.out.println(i1.Team+"\t\t"+i1.NoOfMatch+"\t\t"+i1.Won+"\t\t"+i1.Lost+"\t\t"+i1.Points);
    System.out.println(i2.Team+"\t"+i2.NoOfMatch+"\t\t"+i2.Won+"\t\t"+i2.Lost+"\t\t"+i2.Points);
    System.out.println(i3.Team+"\t\t\t"+i3.NoOfMatch+"\t\t"+i3.Won+"\t\t"+i3.Lost+"\t\t"+i3.Points);
    System.out.println(i4.Team+"\t\t"+i4.NoOfMatch+"\t\t"+i4.Won+"\t\t"+i4.Lost+"\t\t"+i4.Points);
    System.out.println(i5.Team+"\t\t\t"+i5.NoOfMatch+"\t\t"+i5.Won+"\t\t"+i5.Lost+"\t\t"+i5.Points);
    System.out.println(i6.Team+"\t\t\t"+i6.NoOfMatch+"\t\t"+i6.Won+"\t\t"+i6.Lost+"\t\t"+i6.Points);
    System.out.println(i7.Team+"\t\t"+i7.NoOfMatch+"\t\t"+i7.Won+"\t\t"+i7.Lost+"\t\t"+i7.Points);
    System.out.println(i8.Team+"\t\t"+i8.NoOfMatch+"\t\t"+i8.Won+"\t\t"+i8.Lost+"\t\t"+i8.Points);
  } 
}
