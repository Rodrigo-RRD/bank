package conta;
import aplication.Interative;
import java.util.Random;

public class Acesso {
    Interative inte = new Interative();
    private String name = "rodrigo rodrigues";
    private int cConta = 581961;
    private int senha = 6969;
    private int gerada;



    public int getGerada() {
        return gerada;
    }
    public int randomConta() {
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            gerada = gerador.nextInt(600000);
        }
        return cConta = gerada;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }


    public int getcConta() {
        return this.cConta = cConta;
    }

    public int getSenha() {
        return senha = senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
