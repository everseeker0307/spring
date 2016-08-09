package com.everseeker.spring.validator;

import com.everseeker.spring.validator.support.ValidateService;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by everseeker on 16/8/9.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("a1b2c3", "123", "a1b2c3@", "19011100011");
        Map<String, String> map = ValidateService.valid(user);
        if (map.isEmpty())
            System.out.println("数据验证成功");
        else {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = (Map.Entry)iterator.next();
                System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            }
        }
    }
}
