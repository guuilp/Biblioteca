package biblioteca;

import java.util.Comparator;

/**
 *
 * @author a110051
 */
public class ComparadorLivroPorTitulo implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Livro l1 = (Livro) t;
        Livro l2 = (Livro) t1;
        
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
    
}
