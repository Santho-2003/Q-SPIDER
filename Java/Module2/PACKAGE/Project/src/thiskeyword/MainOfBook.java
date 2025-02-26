package thiskeyword;
public class MainOfBook 
{
public static void main(String[] args)
{
	Book b1=new Book("War & Peace",240,200,"Leo Tolstoy");
	Book b2=new Book("Waste Land",500,1200,"T.S Eliot");
	Book b3=new Book("Treasure Island",400,2500,"Leo Tolstoy");
	Book b4=new Book("Time Machine",680,200,"H.G.Wells");
	Book b5=new Book("The Tempest",180,2100,"William Shakespeare");
	Book b6=new Book("Romeo & Juliet",1500,2800,"William Shakespeare");
	System.out.println("Name\t\tPrice\t\tNOP\t\tAuthor");
	System.out.println("---------------------------------------------------------");
	System.out.println(b1.name+"\t"+b1.price+"\t\t"+b1.nop+"\t\t"+b1.author);
	System.out.println(b2.name+"\t"+b2.price+"\t\t"+b2.nop+"\t\t"+b2.author);
	System.out.println(b3.name+"\t"+b3.price+"\t\t"+b3.nop+"\t\t"+b3.author);
	System.out.println(b4.name+"\t"+b4.price+"\t\t"+b4.nop+"\t\t"+b4.author);
	System.out.println(b5.name+"\t"+b5.price+"\t\t"+b5.nop+"\t\t"+b5.author);
	System.out.println(b1.name+"\t"+b6.price+"\t\t"+b6.nop+"\t\t"+b6.author);

}
}
