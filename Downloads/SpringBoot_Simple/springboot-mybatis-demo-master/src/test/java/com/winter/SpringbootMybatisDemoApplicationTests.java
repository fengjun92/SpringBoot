package com.winter;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.winter.model.Goods;
import com.winter.model.User;
import com.winter.service.GoodsService;
import com.winter.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private GoodsService goodsService;
	@Test
	public void contextLoads() {
		List<User> list = userService.findAllUser(1,10);
		for(User user : list){
			System.out.print(user.getPassword());
			System.out.print(user.getUserId());
			System.out.print(user.getUserName());
			System.out.print(user.getPhone());
		}
	}

	@Test
	public void getAllGoods(){
		List<Goods> list = goodsService.getAllGoods(1,10);
	}
}
