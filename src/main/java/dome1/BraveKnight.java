package dome1;

import base.Knight;
import base.Quest;

/**
 * @className dome1.BraveKnight
 * @Descirption 英勇的骑士
 * @Author WengLiangBao
 * @Date 2019/12/31 下午2:02
 * @Vsersion 1.0
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }

}
