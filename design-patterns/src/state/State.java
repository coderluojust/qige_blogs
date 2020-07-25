package state;

/**
 * 抽象状态接口
 * @author Administrator
 *
 */
public abstract class State {

	
	// 扣除积分 - 50
    public abstract void deductMoney();

    // 抽奖，是否中奖
    public abstract boolean raffle();

    // 发送奖品
    public abstract  void dispensePrize();

}
