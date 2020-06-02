package com.test.demo;

import java.util.concurrent.BlockingDeque;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/4/15
 * @Description: com.test.demo
 * @version: 1.0
 */
public class Consumer implements Runnable{
    private final BlockingDeque<Integer> blockingDeque;

    public Consumer(BlockingDeque blockingDeque){
        this.blockingDeque=blockingDeque;
    }

    @Override
    public void run() {
        while (true){
            try {
                Integer i = blockingDeque.take();//阻塞获取任务
                System.err.println("消费："+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
