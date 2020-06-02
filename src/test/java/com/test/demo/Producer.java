package com.test.demo;

import java.util.concurrent.BlockingDeque;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/4/15
 * @Description: com.test.demo
 * @version: 1.0
 */
public class Producer implements Runnable{
    private final BlockingDeque<Integer> blockingDeque;

    public Producer(BlockingDeque blockingDeque){
        this.blockingDeque=blockingDeque;
    }

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                blockingDeque.put(i);//往队列中添加数据
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
