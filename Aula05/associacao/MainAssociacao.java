package associacao;

public class MainAssociacao {
    
    public static void main(String[] args) {
        
        // todas as classes existem de maneira independente
        // mas a classe clinica usa a classe medico e paciente para realizar uma consulta

        Medico m = new Medico("Theodoro");
        Paciente p = new Paciente("paciente");
        Clinica c = new Clinica("MINHA CLINICA");
        c.fazerConsulta(m, p);

    }

}
