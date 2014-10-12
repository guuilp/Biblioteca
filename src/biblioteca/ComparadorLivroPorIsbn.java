package biblioteca;

import java.util.Comparator;

/**
 *
 * @author a110051
 */
public class ComparadorLivroPorIsbn implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Livro l1 = (Livro) t;
        Livro l2 = (Livro) t1;
        if (l1.getIsbn() == l2.getIsbn()) {
            return 0;
        }
        else if (l1.getIsbn() < l2.getIsbn()) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
