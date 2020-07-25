package state;

import java.util.Random;

/**
 * 可以抽奖状态
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除积分不能再扣
    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    //可以抽奖，抽完奖，根据实际情况更改状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖请稍等");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中奖机会
        if(num == 0){
            // 更改活动状态为发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾，没有抽中奖品");
            // 更改状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    // 不能发送奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖不能发送奖品");
    }
}
