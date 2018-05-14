package edu.zut.cs.software.hero.customer.service.impl;

import edu.zut.cs.software.hero.admin.domain.Foot;
import edu.zut.cs.software.hero.customer.service.CustomerManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerManagerImpl implements CustomerManager {

    @Override
    public List<Foot> findByPostcode(String postcode) {
        List<Foot> result = new ArrayList<Foot>();
        for (int i = 0; i < 10; i++) {
            Foot u = new Foot();
            result.add(u);
        }
        return result;
    }

}
