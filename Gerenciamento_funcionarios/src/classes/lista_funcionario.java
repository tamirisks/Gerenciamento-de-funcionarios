
package classes;

import java.util.ArrayList;
import java.util.List;

public class lista_funcionario {
 
    private static List<cadastro_funcionario> DadosFuncionario = new ArrayList<>();

    public static List<cadastro_funcionario> getDadosFuncionario() {
        return DadosFuncionario;
    }

    public static void setDadosFuncionario(cadastro_funcionario funcionario) {
        DadosFuncionario.add(funcionario);
    }    

   
}
    

