// public class OLDMain {
    
//     public static float apagar(float tamanho, int resistencia, String texto) {
//         int textLength = texto.length();
//         return tamanho - textLength * 0.01f / resistencia;
//     }
    
//     public static void main(String[] args) {
        
//         // vamos fazer um programa que simule o desgaste de uma borracha.
//         // alem disso vamos guardar informacoes com marca, formato.

//         float tamanhoEmCm3;
//         int resistencia;
//         String marca;
//         String cor;

//         // 4 x 3 x 2
//         tamanhoEmCm3 = 24;

//         // 1 a 3
//         resistencia = 2;

//         marca = "MERCUR";
//         cor = "VERDE";

//         // apagar um texto, desgata um tanto do tamanho total
//         // a cada 1 caracteres gasta 0.01 cm3  / resistencia
//         String text1 = "quero apagar primeiro isto aqui";

//         // apaga
//         // int textLength;
//         // textLength = text1.length();
//         // tamanhoEmCm3 = tamanhoEmCm3 - textLength * 0.01f / resistencia;
//         // verifica o tamanho da borracha
//         tamanhoEmCm3 = apagar(tamanhoEmCm3, resistencia, text1);
//         System.out.println("TAMANHO " + tamanhoEmCm3);
        
//         String text2 = "depois vou apagar este texto que é ainda maior que o primeiro texto pq gosto de apagar as coisas ainda mais texto aqui para ver um numero maior que 0.01 ainda nao sei se da entao vou aumentar ainda mais.";
        
//         // apaga
//         // textLength = text2.length();
//         // tamanhoEmCm3 = tamanhoEmCm3 - textLength * 0.01f / resistencia;
//         // verifica o tamanho da borracha
//         tamanhoEmCm3 = apagar(tamanhoEmCm3, resistencia, text2);
//         System.out.println("TAMANHO " + tamanhoEmCm3);
        
//         tamanhoEmCm3 = 0;
//         marca = "TROQUEI";
//     }
// }