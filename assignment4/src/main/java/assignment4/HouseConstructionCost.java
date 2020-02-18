package assignment4;

public class HouseConstructionCost
{
	public double cost(String standard_materials,String  fully_automated_home,double square_feet)
	{
		double construction_cost = 0;
		if(standard_materials=="use"&&fully_automated_home=="No")
		{
			construction_cost=square_feet*1200;
		}
		if(standard_materials=="above"&&fully_automated_home=="No")
		{
			construction_cost=square_feet*1500;
		}
		if(standard_materials=="high"&&fully_automated_home=="No")
		{
			construction_cost=square_feet*1800;
		}
		if(standard_materials=="high"&&fully_automated_home=="Yes")
		{
			construction_cost=square_feet*2500;
		}
		return construction_cost;
	}

}
