package edu.zut.cs.software.hero.feedback.service;

import edu.zut.cs.software.hero.feedback.domain.FeedBack;

import java.util.List;

public interface FeedbackManager {


    List<FeedBack> findByCustomer(String customerId);
}
