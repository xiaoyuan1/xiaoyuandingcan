package edu.zut.cs.software.hero.customer.service;



import java.util.List;

import edu.zut.cs.software.hero.Foot.domain.Foot;

public interface CustomerManager {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<Foot> findByPostcode(String postcode);
}
