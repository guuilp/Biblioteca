package biblioteca;

import javax.swing.UIManager;

/**
 *
 * @author a110051
 */
public class Biblioteca {
    
    public static Prateleira p1;
    
    public static void main(String[] args) {
        p1 = new Prateleira();
        CadastroLivroJFrame clj = new CadastroLivroJFrame(p1);
        clj.setVisible(true);
    }
}
