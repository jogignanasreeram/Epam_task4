package epam.interest;

public class Calculating
{
	
	public double simpleInterest(int principle_amount,int time,double rate)
	{
		double si=(principle_amount*time*rate)/100;
		return si;
	}
	public double compoundInterest(int principle_amount,int time,double rate)
	{
		double ci=principle_amount*(Math.pow((1 + rate/100),time));
		return ci;
	}

}
