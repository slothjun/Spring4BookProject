package dome2;

import java.io.PrintStream;

/**
 * @className Minstrel
 * @Descirption
 * @Author WengLiangBao
 * @Date 2019/12/31 下午4:40
 * @Vsersion 1.0
 */
public class Minstrel {

    private PrintStream out;

    public Minstrel(PrintStream stream){
        this.out = stream;
    }

    public void beforeQuest(){
        out.println("啦啦啦，勇敢的骑士要开始执行任务了");
    }

    public void afterQuest(){
        out.println("啦啦啦，骑士执行完任务了");
    }

}
