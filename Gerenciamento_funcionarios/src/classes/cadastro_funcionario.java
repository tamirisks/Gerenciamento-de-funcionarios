
package classes;

import java.time.LocalTime;


public class cadastro_funcionario {
    
    private String nome;
    private String email;
    private LocalTime entrada;
    private LocalTime saida;
    private String trabalhou_hoje;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

    public String getTrabalhou_hoje() {
        return trabalhou_hoje;
    }

    public void setTrabalhou_hoje(String trabalhou_hoje) {
        this.trabalhou_hoje = trabalhou_hoje;
    }
      
}
