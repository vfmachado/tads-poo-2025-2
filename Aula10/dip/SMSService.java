package dip;

public class SMSService implements MessageService {
    public void enviar(String usuario, String mensagem) {
        // Lógica para enviar SMS
        System.out.println("Enviando SMS para " + usuario + ": " + mensagem);
    }
}
