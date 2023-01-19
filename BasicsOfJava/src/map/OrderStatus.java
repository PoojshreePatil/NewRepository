package map;

public class OrderStatus
  {
     String dDate,status;

	public OrderStatus(String dDate, String status) {
	
		this.dDate = dDate;
		this.status = status;
	}

	public String toString() {
		return "OrderStatus-[ dDate=" + dDate + ", status=" + status + "]";
	}
     
     
}
