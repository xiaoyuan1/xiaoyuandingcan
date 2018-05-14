package edu.zut.cs.software.hero.customer.service;

import edu.zut.cs.software.hero.admin.domain.Foot;

import java.util.List;

public interface CustomerManager {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<Foot> findByPostcode(String postcode);
}
