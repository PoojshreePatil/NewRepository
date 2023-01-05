
public interface Cake {

	void bake();
	

class Strawberry implements Cake
{
	public void bake()
	{
		System.out.println("bake the cake of Strawberry Flavour");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
		System.out.println("bake the cake of Black Forest Flavour");
	}

 
 public static void main(String[] args) {
	
	 Cake c = new Strawberry();
	 c.bake();
	  Cake c1 = new BlackForest();
	  c1.bake();
 }
}
}
