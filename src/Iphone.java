import java.util.Scanner;

import Iphone.AparelhoTelefonico;
import Iphone.Navegador;
import Iphone.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        String answer = "";
        System.out.println("Programa Iphone Iniciado\nPara finalizar escreva 'sair'");
        System.out.println("O Programa possui as seguintes funções:'ligar','atender','correio de voz'\n'exibir','adicionar','atualizar','tocar','pausar' e 'selecionar'");
        try (Scanner input = new Scanner(System.in)) {
            answer = input.nextLine();
            while(answer != "sair"){
                if(answer == "ligar"){
                    AparelhoTelefonico.ligar();
                    break;
                }
                else if(answer == "atender"){
                    AparelhoTelefonico.atender();  
                    break;
                }
                else if(answer == "correio de voz"){
                    AparelhoTelefonico.CorreioDeVoz();
                    break;
                }
                else if(answer == "exibir"){
                    Navegador.exibir();
                    break;
                }
                else if(answer == "adicionar"){
                    Navegador.adicionar();
                    break;
                }
                else if(answer == "atualizar"){
                    Navegador.atualizar();
                    break;
                }
                else if(answer == "tocar"){
                    ReprodutorMusical.tocar();
                    break;
                }
                else if(answer == "pausar"){
                    ReprodutorMusical.pausar();
                    break;
                }
                else if(answer == "selecionar"){
                    ReprodutorMusical.selecionar();
                    break;
                }
                else{
                    System.out.println("erro");
                    break;
                }
            }
        }
    }
}
