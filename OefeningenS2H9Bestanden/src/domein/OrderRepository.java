package domein;

import java.util.List;

import persistentie.OrderMapper;

public class OrderRepository {
	private OrderMapper om;
	private List<Order> list;
	
	public OrderRepository() {
		this.om = new OrderMapper();
	}

	public List<Order> getLijst() {
		om.openRead();
		list =  om.readOrders();
		om.closeReadWrite();
		return list;
	}
	
	public void writeList(List<Order>list) {
		om.openWrite();
		om.writeList(list);
		om.closeReadWrite();
		
		
	}

}
