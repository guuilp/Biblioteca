package biblioteca;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a110051
 */
public class PrateleiraTabelaModelo extends AbstractTableModel {

    Prateleira prateleira;
    String[] cabecalhoColunas = { "Titulo", "Autores", "Ano Publicação", "ISBN" };
    
    public PrateleiraTabelaModelo (Prateleira prateleira) { 
        this.prateleira = prateleira;
    }
    
    public String getColumnName (int col) { 
        return cabecalhoColunas[col].toString();
    }
    
    @Override
    public int getRowCount() {
        return prateleira.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Livro livro = (Livro) prateleira.get(row);
        
        switch(col) {
            case 0:
                return livro.getTitulo();
            case 1:
                return livro.getAutores();
            case 2:
                return livro.getAnoPublicacao();
            case 3:
                return livro.getIsbn();
            default:
                return "Erro! não existe o atributo desejado.";
        }
    }

    @Override
    public boolean isCellEditable (int row, int col) {
        switch(col) {
            case 1: 
                return false;
            default: 
                return true;
        }
    }

    public void setValueAt(Object value, int row, int col) { 
        Livro livro = (Livro) prateleira.get(row);
        
        switch(col) {
            case 0:
                String titulo = value.toString();
                livro.setTitulo(titulo);
                break;
            case 1:
                String autores = value.toString();
                livro.setAutores(autores);
                break;
            case 2:
                int anoPublicacao = Integer.parseInt(value.toString());
                livro.setAnoPublicacao(anoPublicacao);
                break;
            case 3:
                int isbn = Integer.parseInt(value.toString());
                livro.setIsbn(isbn);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro! não existe o atributo desejado");
        }
    }
    
}
