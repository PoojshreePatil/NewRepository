package map;

public class Order

 {
   int id,totalcost;
   String city;
   OrderStatus os;
   
  public Order(int id, int totalcost, String city, OrderStatus os) {
	
	this.id = id;
	this.totalcost = totalcost;
	this.city = city;
	this.os = os;
 }

  public String toString()
  {
	return "\nOrder id:" + id + ", totalcost:" + totalcost + ", city:" + city +", " + os;
   }   
}
