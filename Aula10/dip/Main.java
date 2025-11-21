package dip;

public class Main {
    public static void main(String[] args) {
        
        // teu sistema envia uma msg para um usuario
        // Notificacao notificacao = new Notificacao();
        // notificacao.enviarMensagem("vini", "teste email");
        // notificacao.enviarSMS("vini", "teste sms");

        Notificacao notificacaoEmail = new Notificacao(new EmailService());
        notificacaoEmail.enviarMensagem("vini", "teste email");

        Notificacao notificacaoSMS = new Notificacao(new SMSService());
        notificacaoSMS.enviarMensagem("vini", "teste sms");

        Notificacao notificacaoWhatsapp = new Notificacao(new WhatsappService());
        notificacaoWhatsapp.enviarMensagem("vini", "teste whatsapp");
    }
}
