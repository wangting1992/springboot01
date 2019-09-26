package com.zyzx.springboot;

import com.zyzx.springboot.demo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println("wangting");
        System.out.println("idea再次天剑输出2");
        System.out.println("idea再次天剑输出3");
        System.out.println("idea再次天剑输出4");
        System.out.println("github再次天剑输出2");
        System.out.println("github再次天剑输出3");
        System.out.println("github再次天剑输出4");
            
    }

}
