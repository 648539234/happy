package com.test.demo;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/19
 * @Description: com.test.demo
 * @version: 1.0
 */
public class ConcurrentDemo {
    public static Executor executor= Executors.newCachedThreadPool();

    public static void main(String[] args) {
        AtomicInteger n = new AtomicInteger(0);
        ConcurrentDemo m=new ConcurrentDemo();
        m.dg(m,n);
    }
    public String getValue(AtomicInteger n){
        int m = n.incrementAndGet();
        try{
            System.out.println("执行了第"+ m +"次");
            Random random = new Random();
            int v = random.nextInt(100)+950;
            System.out.println(v);
            Thread.sleep(5000);
        }catch (Exception e) {
            System.out.println("中断");
        }
        return "阿斯顿撒旦阿斯顿 sad";
    }

    public void dg(ConcurrentDemo m, AtomicInteger n){
        FutureTask<String> future=new FutureTask<String>(new Callable<String>() {
            public String call() throws Exception {
                // TODO Auto-generated method stub
                return m.getValue(n);
            }
        });
        executor.execute(future);
        try{
            String result=future.get(1, TimeUnit.SECONDS);
            System.out.println(result);
        }catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("方法执行中断");
            // future.cancel(true);
        }catch (ExecutionException e) {
            System.out.println("Excution异常");
            // TODO: handle exception
            future.cancel(true);
        }catch (TimeoutException e) {
            // TODO: handle exception
            System.out.println("方法执行时间超时");
            future.cancel(true);
            while(n.get()<3){
                m.dg(m, n);
            }
            if(n.get()>=3) {
                throw new RuntimeException("支付宝差评");
            }
        }
    }
}
