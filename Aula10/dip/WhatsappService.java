package dip;

public class WhatsappService implements MessageService {
    public void enviar(String usuario, String mensagem) {
        // Lógica para enviar mensagem via WhatsApp
        System.out.println("Enviando WhatsApp para " + usuario + ": " + mensagem);
    }
    
}
