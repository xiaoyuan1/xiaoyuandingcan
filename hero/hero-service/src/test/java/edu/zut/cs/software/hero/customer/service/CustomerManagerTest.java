package edu.zut.cs.software.hero.customer.service;

import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.admin.service.AdminServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class CustomerManagerTest {

    @Autowired
    CustomerManager customerManager;

    @Test
    public void testFindByPostcode() {
        String postcode = "NR74DU";
        List<Foot> result = this.customerManager.findByPostcode(postcode);
        List<Foot> expected = new ArrayList<Foot>();
        for (int i = 0; i < 10; i++) {
            Foot u = new Foot();
            expected.add(u);
        }
        assertEquals(expected.size(), result.size());

    }

}
