package dome1;

import base.Quest;

import java.io.PrintStream;

/**
 * @className dome1.SlayDragonQuest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2019/12/31 下午2:13
 * @Vsersion 1.0
 */
public class SlayDragonQuest implements Quest {

    private PrintStream out;

    public SlayDragonQuest(PrintStream printStream){
        this.out = printStream;
    }

    public void embark() {
        out.println("探险去杀龙！");
    }
}
