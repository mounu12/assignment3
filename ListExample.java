package assignment3;

public class ListExample {
	Object arr[];
	int i=-1;
	int size;
	int check=0;
	public ListExample(int s)
	{
		size=s;
		arr=new Object[s];
	}
	public void insert(Object item)
	{
	if(i==size-1)
		System.out.println("can't insert more objects");
	else
	{
	i++;
	arr[i]=item;
	check++;
	}
	}
	public int find(Object item)
	{
		for(Object o:arr)
		{
			if(o==item)
				return (Integer)o;
		}
		return -1;
	}
	public void delete(Object item)
	{
		for(Object o:arr)
			if(o==item)
			{
				check--;
			}
		
	}
	public boolean isEmpty()
	{
		
		if(check==0)
			return true;
		else 
			return false;
	}
}
