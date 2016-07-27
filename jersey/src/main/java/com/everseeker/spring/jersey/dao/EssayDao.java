package com.everseeker.spring.jersey.dao;

import com.everseeker.spring.jersey.entity.Essay;
import org.springframework.stereotype.Repository;

/**
 * Created by everseeker on 16/7/26.
 */
@Repository
public interface EssayDao {
    void addEssay(Essay essay);

    Essay getEssayByTitle(String title);
}
