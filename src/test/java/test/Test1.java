package test;

import com.shop.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.mappers.newone.UserMapper;

public class Test1 {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OrderService orderService;
	@Test
	public void daotest(){
		System.out.println(orderService.getlist());
	}

	@Test
	public void tuofengtoxiahua(){
		String name = "ordersIdOrders";
		StringBuffer sb = new StringBuffer();
		for (int i = 0;i<name.length();i++){
			if (Character.isUpperCase(name.charAt(i))) {
				sb.append("_");
				sb.append(Character.toLowerCase(name.charAt(i)));
			}else{
				sb.append(name.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
