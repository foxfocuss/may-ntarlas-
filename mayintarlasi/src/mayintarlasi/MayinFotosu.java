
package mayintarlasi;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;

public class MayinFotosu extends Mayintarlasi{
    public ImageIcon mayin(){
        java.net.URL dosyaYolu = getClass().getResource("mayin.jpg");
        ImageIcon resim = new ImageIcon(dosyaYolu);
        return resim;
    }
    
}
