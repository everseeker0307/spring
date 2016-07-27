package com.everseeker.spring.jersey;

import com.everseeker.spring.jersey.config.RootConfig;
import com.everseeker.spring.jersey.entity.Essay;
import com.everseeker.spring.jersey.service.EssayService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by everseeker on 16/7/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class Test {
    @Autowired
    private EssayService essayService;

    @org.junit.Test
    public void addEssayTest() {
        Essay essay = new Essay("mark", "Markdown语法说明");
        essayService.addEssay(essay);
    }
}
