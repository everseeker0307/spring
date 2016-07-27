package com.everseeker.spring.jersey.service;

import com.everseeker.spring.jersey.dao.EssayDao;
import com.everseeker.spring.jersey.entity.Essay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by everseeker on 16/7/26.
 */
@Service("essayService")
public class EssayService {

    @Autowired
    private EssayDao essayDao;

    public void addEssay(Essay essay) {
        essayDao.addEssay(essay);
    }

    public Essay getEssayByTitle(String title) {
        return essayDao.getEssayByTitle(title);
    }

}
