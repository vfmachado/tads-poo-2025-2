package dip;

public class EmailService implements MessageService {
    
    public void enviar(String usuario, String mensagem) {
        // Lógica para enviar email
        System.out.println("Enviando email para " + usuario + ": " + mensagem);
    }

}
