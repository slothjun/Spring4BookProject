package dome11;

/**
 * @className Disc
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/16 上午11:59
 * @Vsersion 1.0
 */
public class Disc {

    private String title;

    private String artist;
    public Disc(String title,String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getArtist(){ return this.artist;}
}
