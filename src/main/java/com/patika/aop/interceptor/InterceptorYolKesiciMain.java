package com.patika.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciMain {

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("İlk hali: " + context.getMethod().getName());

        //jdbc : session ?
        boolean isLogin = true; //Yol kesici olacak degiskenimiz
        Object isContinue = null; //Eğer yol kesilmezse devam edecegim

        if(isLogin){
            //Once sisteme giris yapsın
            System.out.println("!!! Once sisteme giris yapsın");
            return null;
        }else{
            try {
                isContinue = context.proceed();
                System.out.println("Sonraki Hali " + isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
