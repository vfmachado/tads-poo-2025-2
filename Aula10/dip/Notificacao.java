package dip;

public class Notificacao {
    
    private MessageService messageService;

    // Injecao de dependencia via construtor
    public Notificacao(MessageService messageService) {
        this.messageService = messageService;

    }

    public void enviarMensagem(String usuario, String mensagem) {
        // poderia salvar em um log, ou fazer outra coisa antes de enviar a mensagem
        messageService.enviar(usuario, mensagem);
    }

    // public void enviarMensagem(String usuario, String mensagem) {
    //     // Lógica para enviar a mensagem ao usuário
    //     emailService.enviar(usuario, mensagem);
    //     // System.out.println("Enviando mensagem para " + usuario + ": " + mensagem);
    // }

    // public void enviarSMS(String usuario, String mensagem) {
    //     smsService.enviar(usuario, mensagem);
    // }

}
