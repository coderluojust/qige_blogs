package state;

/**
 * 发放奖品状态
 * @author Administrator
 *
 */
public class DispenseState extends State {

	 // 初始化时传入活动引用，发送奖品后更改其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            // 改变状态为不能中奖
            activity.setState(activity.getNoRafflleState());
        } else {
            System.out.println("很遗憾奖品发送完了");
            // 活动状态为发送完了，之后不能在抽奖
            activity.setState(activity.getDispensOutState());
            //System.out.println("抽奖活动结束");
            //System.exit(0);
        }

    }
}
