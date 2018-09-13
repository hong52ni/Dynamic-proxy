package pers.hong;

/**
 * @Description:
 * @Auther: hong
 * @Date: 2018/09/13
 */
public class TicketProviderImpl implements TicketProvider {

    @Override
    public void getTrainTicket() {
        System.out.println("购买火车票");
    }

    @Override
    public void getTrainTicket(int count) {
        System.out.println("购买火车票"+count+"张");
    }
}
