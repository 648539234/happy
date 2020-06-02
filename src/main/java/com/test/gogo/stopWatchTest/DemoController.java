package com.test.gogo.stopWatchTest;

import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/22
 * @Description: com.test.gogo.stopWatchTest
 * @version: 1.0
 */
@RestController
public class DemoController {
    DemoController(){
        System.out.println("gogo");
    }
    @RequestMapping("/StopWatch")
    public void test() throws InterruptedException {
        StopWatch sw = new StopWatch("watchNo.1");
        sw.start("task1");
        Thread.sleep(1000);
        sw.stop();
        sw.start("task2");
        Thread.sleep(2000);
        sw.stop();
        System.out.println(sw.prettyPrint());
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(sw.shortSummary());
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(sw.getTotalTimeMillis());
    }

}
