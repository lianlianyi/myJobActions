package cc.chenwenxi.actions;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ThreadUtil;

/**
 * @author chenwenxi
 */
public class Run {
    public static void main(String[] args) {
        Console.log("另开线程,不要占用主线程");
        ThreadUtil.execAsync(()->{
            try{
                while(true){
                    System.out.println("执行成功");

                }
            }catch(Exception e){
               e.printStackTrace();
            }

        });
    }
}
