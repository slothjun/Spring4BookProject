package dome12;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @className Audience
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/24 下午4:44
 * @Vsersion 1.0
 */
@Aspect
@Component
public class Audience {

    @Before("execution(* dome12.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println(" 把电话设为静音");
    }

    @Before("execution(* dome12.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("taking seats!");
    }

    @AfterReturning("execution(* dome12.Performance.perform(..))")
    public void applause(){
        System.out.println(" 演出精彩！");
    }

    @AfterThrowing("execution(* dome12.Performance.perform(..))")
    public void demandRefund(){
        System.out.println(" 我要退票！");
    }

}
