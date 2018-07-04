package concert;

import org.aspectj.lang.annotation.*;

/**
 * Created by CharlesYang on 2018/7/2/002.
 */
@Aspect
public class Audience {

    @Pointcut("excution(**  concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("Clap Clap Clap!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a Refund");
    }
}
