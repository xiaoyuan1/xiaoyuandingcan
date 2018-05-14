package edu.zut.cs.software.hero.feedback.service.impl;

import edu.zut.cs.software.hero.feedback.domain.FeedBack;
import edu.zut.cs.software.hero.feedback.service.FeedbackManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeedBackManagerImpl implements FeedbackManager {

    @Override
    public List<FeedBack> findByCustomer(String customerId) {
        List<FeedBack> all = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            all.add(feedback);
        }
        return all;
    }

}
