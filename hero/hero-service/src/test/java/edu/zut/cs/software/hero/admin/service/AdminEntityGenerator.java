package edu.zut.cs.software.hero.admin.service;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.admin.domain.Depot;
import edu.zut.cs.software.hero.admin.domain.Group;
import edu.zut.cs.software.hero.admin.domain.Order;
import edu.zut.cs.software.hero.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {

	@Autowired
	GroupManager groupManager;


	@Autowired
	DepotManager depotManager;
	
	@Autowired
	OrderManager orderManager;

	
	@Test
	public void gen_group11() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_depot(g);
			}
		}
	}
	public void gen_depot(Group g) {
		for (int i = 0; i < 10; i++) {
			Depot d = new Depot();
			d.setRaw("name" + i);
			d.setGroup(g);
			this.depotManager.save(d);
		}
	}
	

   @Test
   public void gen_group18() {
	     for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			this.groupManager.save(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_order(g);
			}
	     }
   }
	     
   public void gen_order(Group g) {
	   for (int i = 0; i < 10; i++) {
			Order u=new Order();
			u.setAddress("Orderaddress_"+i);
			u.setCustomer("ordercustomer_"+i);
			u.setFood_name("orderfood_name_"+i);
			u.setFood_number("order_food_number_"+i);
			u.setFood_price("order_food_price"+i);
			u.setGroup(g);
			this.orderManager.save(u);
   }
   }
}


