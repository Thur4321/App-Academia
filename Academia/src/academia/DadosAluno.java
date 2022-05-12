
package academia;
    
public class DadosAluno {
    
    private String nome;
    
    private float peso;
    
    private float altura;
    
    private String situação;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String identificaçãoNome){
        nome=identificaçãoNome;
    
    }
    
    public float peso(){
        return peso;
    }
    
    public void setPeso(float pesoAluno){
        peso=pesoAluno;
    
    }
    
    public float altura(){
        return altura;
    }
    
    public void setAltura(float alturaAluno){
        altura=alturaAluno;
    
    }
    
    public float imc() {
        float imc=peso/(altura*altura);
        return imc;
    }
    
    public String situação(){
        if (imc() >= 30){
            situação="Obesidade";
        }
        else if (imc() < 18.6){
            situação="Abaixo do Peso";
        }
        else if (imc() >= 18.6 && imc() < 24.9) {
            situação="Peso Normal";
        }    
        else {
             situação="Excesso de Peso";
        }
        return situação;
    }    
}

