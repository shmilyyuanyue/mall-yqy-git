package com.shmily.mall.parent;

import com.shmily.mall.parent.test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallParentApplication {

    public static void main(String[] args) {

        SpringApplication.run(MallParentApplication.class, args);
        Test test = new Test();
        test.test1();
    }

}
