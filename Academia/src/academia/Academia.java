
package academia;

import javax.swing.JOptionPane;

public class Academia {

    public static void main(String[] args) {
        
        String nome=JOptionPane.showInputDialog(null,"Informe seu nome:","AppAluno",3);
        
        float peso=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe seu peso (decimais depois de ponto):","AppAluno",3));
        
        float altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua altura (em metros e decimais depois de ponto):","AppAluno",3));
        
        DadosAluno objAluno = new DadosAluno();
       
        objAluno.setNome(nome);
        objAluno.setPeso(peso);
        objAluno.setAltura(altura);
        
        JOptionPane.showMessageDialog(null, "Nome: "+objAluno.getNome()+"\nIMC: "+objAluno.imc()+"\nSituação: "+objAluno.situação(),"AppAluno",1);
    }
    
}
