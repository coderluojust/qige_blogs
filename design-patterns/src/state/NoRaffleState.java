package state;

/**
 * 不能抽奖状态
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	 // 初始化传入活动，扣除积分后改变状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 当前状态可以扣除积分，扣除后改为抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，你可以去抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才可以抽奖哦");
        return false;
    }

    // 当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
