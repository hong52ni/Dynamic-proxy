package pers.hong;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Auther: hong
 * @Date: 2018/09/13
 */
public class ProxyTest {
    public static void main(String[] args) {
        //接口实现类
        TicketProvider ticketProvider = new TicketProviderImpl();
        //InvocationHandler实现类，用到了刚才定义的构造器
        InvocationHandler handler = new TicketProviderProxy(ticketProvider);
        //newProxyInstance（）生成动态代理类实例，args[0]是实现类，args[1]是要接口类，
        //args[2]是InvocationHandler实现类，即处理器，处理传入的需要被代理的真实对象
        TicketProvider ticketProviderProxy = (TicketProvider) Proxy.newProxyInstance(
                ticketProvider.getClass().getClassLoader(),
                ticketProvider.getClass().getInterfaces(),
                handler);
        //传入参数测试
        ticketProviderProxy.getTrainTicket();
        ticketProviderProxy.getTrainTicket(5);
    }
}
