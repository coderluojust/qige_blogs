package state;

/**
 * 奖品发放完毕状态
 * 说明，当我们activity 的状态改为DispenseOutState，抽奖活动结束
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

	// 活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次参加");
    }
}
