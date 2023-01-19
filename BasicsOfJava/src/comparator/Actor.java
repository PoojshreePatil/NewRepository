package comparator;

public class Actor {

	int id,age;
	String name;
	public Actor(int id, String name)
	{
		this.id =id;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n Actor id=" + id + ",name:" + name;// + "age:" + age;
	}
	
	
}
