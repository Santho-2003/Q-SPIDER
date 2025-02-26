package Abstraction;
public class BankFactory 
{
public void get(bank b)
{
	if(b instanceof HDFCBank)
	{
		HDFCBank h=(HDFCBank)b;
		h.amount();
		h.roi();
		h.tenure();
	}
	else if(b instanceof IndianBank)
	{
		IndianBank i=(IndianBank)b;
		i.amount();
		i.roi();
		i.tenure();
	}
	else if(b instanceof IcicBank)
	{
		IcicBank i1=(IcicBank)b;
		i1.amount();
		i1.roi();
		i1.tenure();
	}
	else
	{
		IdfcBank i2=(IdfcBank)b;
		i2.amount();
		i2.roi();
		i2.tenure();
	}	
}
}
