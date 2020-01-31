package dome13;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @className Audience
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/31 下午5:38
 * @Vsersion 1.0
 */
@Aspect
public class Audience {

    @Pointcut("execution(* dome12.Circus.perform())")
    public void performPoint(){}

    @Around("performPoint()")
    public void around(ProceedingJoinPoint pjp){
        try{
            System.out.print(" 1把电话设为静音 !");
            System.out.println(" 1taking seats!");
            pjp.proceed();
            System.out.println(" 1演出精彩");
        } catch (Throwable throwable) {
            System.out.println(" 1我要退票！");
            throwable.printStackTrace();
        }

    }
}
