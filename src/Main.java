import java.util.Scanner;

public class Main {
    Iphone iphone = new Iphone("1234567897564313");
    static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        Main main = new Main();

        do {
            System.out.println("Menu Iphone\n1-Reprodutor Musical\t2-Aparelho telefonico\t3-Navegador na internet:\tdigite qualquer botão não listado para sair!");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    main.reprodutorMusical();
                    break;
                case 2:
                    main.AparelhoTelefonico();
                    break;
                case 3:
                    main.navegadorNaInternet();
                    break;
                default:
                    return;
            }
        }while (continuar);
    }

    public void reprodutorMusical(){
        System.out.println("Menu Repro.Musical\n1-Tocar\t2-pausar\t3-selecionar musica:\tdigite qualquer botão não listado para sair!");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                iphone.tocar();
                reprodutorMusical();
                break;
            case 2:
                iphone.pausar();
                reprodutorMusical();
                break;
            case 3:
                System.out.println("Digite o nome da musica:");
                String nomeMusica = scanner.next();
                scanner.nextLine();
                iphone.selecionarMusica(nomeMusica);
                reprodutorMusical();
                break;
            default:
                break;
        }
    }
    public void AparelhoTelefonico(){
        System.out.println("Menu Ap. Telefonico\n1-Ligar\t2-atender\t3-iniciarCorreioVoz:\tdigite qualquer botão não listado para sair!");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite o numero do contato: ");
                String contato =  scanner.next();
                scanner.nextLine();
                iphone.ligar(contato);
                AparelhoTelefonico();
                break;
            case 2:
                iphone.atender();
                AparelhoTelefonico();
                break;
            case 3:
                iphone.iniciarCorreioVoz();
                AparelhoTelefonico();
                break;
            default:
                break;
        }
    }
    public void navegadorNaInternet(){
        System.out.println("Menu Navegador\n1-exibirPagina\t2-adicionarNovaAba\t3-atualizarPagina:\tdigite qualquer botão não listado para sair!");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                iphone.exibirPagina();
                navegadorNaInternet();
                break;
            case 2:
                iphone.adicionarNovaAba();
                navegadorNaInternet();
                break;
            case 3:
                iphone.atualizarPagina();
                navegadorNaInternet();
                break;
            default:
                break;
        }
    }
}