package mock;

/**
 * Created by CharlesYang on 2018/6/30/030.
 */
public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;
    public BraveKnight(Quest quest, Minstrel minstrel){
        this.quest = quest;
        this.minstrel = minstrel;
    }
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest(){
//        minstrel.singAfterQuest();使用切面实现
        quest.embark();
//        minstrel.singAfterQuest();
    }
}
