package abstractmethod;
public class AmazonV2 extends AmazonV1
{
@Override
public void paybills()
{
	System.out.println("Bills payed");
}
}