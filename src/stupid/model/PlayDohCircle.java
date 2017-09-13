package stupid.model;



public class PlayDohCircle 
{
	//Declaration section
	//Data member section
	//NEED TO BE PRIVATE
	private int size;

	public PlayDohCircle()
	{
		this.size = 5;
	}
	
public PlayDohCircle(int size)
{
	this.size = size;
}
public String toString()
{
	String description = "I am a playdoh circle and my size is " + size;
	return description;
}
	public void setSize(int updateSize)
	{
		this.size = updateSize;
	}


}