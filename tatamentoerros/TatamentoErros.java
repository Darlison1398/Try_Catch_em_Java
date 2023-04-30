
package tatamentoerros;

import javax.swing.JOptionPane;

public class TatamentoErros {

    public static void main(String[] args) {
        
        double valorTotal = 1000.0;
        double entrada = 200.0;
        int parcelas = 5;
  
        
        try { 
            Financiamento f1 = new Financiamento (valorTotal, entrada, parcelas);       
            System.out.println(f1.prestacao());
            
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
