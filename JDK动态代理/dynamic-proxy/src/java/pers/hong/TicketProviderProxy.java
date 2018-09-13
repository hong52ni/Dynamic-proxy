package pers.hong;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Auther: hong
 * @Date: 2018/09/13
 */
public class TicketProviderProxy implements InvocationHandler {
    //实际对象，也就是代购要去的商店
    private Object target;

    //构造器赋值
    public TicketProviderProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----before in method invoke-----");
        //invoke()方法通过是实际对象和参数，找到对应的方法
        method.invoke(target, args);
        System.out.println("Add functionality to the method");
        System.out.println("-----after in method invoke-----");
        return null;
    }
}
