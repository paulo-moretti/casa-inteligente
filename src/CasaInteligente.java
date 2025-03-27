import java.util.Scanner;

public class CasaInteligente {

    // definindo o estado dos dispositivos, todos começam desligados ou fechados

    private static boolean luzQuarto1 = false;
    private static boolean arCondicionadoQuarto1 = false;
    private static boolean persianaQuarto1 = false;

    private static boolean luzQuarto2 = false;
    private static boolean arCondicionadoQuarto2 = false;
    private static boolean persianaQuarto2 = false;

    private static boolean luzQuarto3 = false;
    private static boolean arCondicionadoQuarto3 = false;
    private static boolean persianaQuarto3 = false;

    private static boolean luzSalaTv = false;
    private static boolean luzSalaJantar = false;

    private static boolean irrigacaoJardim = false;
    private static boolean portaoSocial = false;
    private static boolean portaoGaragem = false;
    private static boolean luzGaragem = false;

    private static boolean motorPiscina = false;
    private static boolean cercaEletrica = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: acionarLuzQuarto1(true); break;
                case 2: acionarLuzQuarto1(false); break;
                case 3: acionarArCondicionadoQuarto1(true); break;
                case 4: acionarArCondicionadoQuarto1(false); break;
                case 5: acionarPersianaQuarto1(true); break;
                case 6: acionarPersianaQuarto1(false); break;
                case 7: acionarLuzQuarto2(true); break;
                case 8: acionarLuzQuarto2(false); break;
                case 9: acionarArCondicionadoQuarto2(true); break;
                case 10: acionarArCondicionadoQuarto2(false); break;
                case 11: acionarPersianaQuarto2(true); break;
                case 12: acionarPersianaQuarto2(false); break;
                case 13: acionarLuzQuarto3(true); break;
                case 14: acionarLuzQuarto3(false); break;
                case 15: acionarArCondicionadoQuarto3(true); break;
                case 16: acionarArCondicionadoQuarto3(false); break;
                case 17: acionarPersianaQuarto3(true); break;
                case 18: acionarPersianaQuarto3(false); break;
                case 19: acionarLuzSalaTv(true); break;
                case 20: acionarLuzSalaTv(false); break;
                case 21: acionarLuzSalaJantar(true); break;
                case 22: acionarLuzSalaJantar(false); break;
                case 23: acionarIrrigacaoJardim(true); break;
                case 24: acionarIrrigacaoJardim(false); break;
                case 25: acionarPortaoSocial(true); break;
                case 26: acionarPortaoSocial(false); break;
                case 27: acionarPortaoGaragem(true); break;
                case 28: acionarPortaoGaragem(false); break;
                case 29: acionarLuzGaragem(true); break;
                case 30: acionarLuzGaragem(false); break;
                case 31: acionarMotorPiscina(true); break;
                case 32: acionarMotorPiscina(false); break;
                case 33: acionarCercaEletrica(true); break;
                case 34: acionarCercaEletrica(false); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida! Tente novamente."); break;
            }

        } while (opcao != 0);
    }

    // exibe menu com as opções

    private static void exibirMenu() {
        System.out.println("\nMenu de Opções:");
        System.out.println("1 – Acender a Luz do Quarto 1");
        System.out.println("2 – Apagar a Luz do Quarto 1");
        System.out.println("3 – Ligar o Ar-Condicionado do Quarto 1");
        System.out.println("4 – Desligar o Ar-Condicionado do Quarto 1");
        System.out.println("5 – Abrir a persiana do Quarto 1");
        System.out.println("6 – Fechar a persiana do Quarto 1");
        System.out.println("7 – Acender a Luz do Quarto 2");
        System.out.println("8 – Apagar a Luz do Quarto 2");
        System.out.println("9 – Ligar o Ar-Condicionado do Quarto 2");
        System.out.println("10 – Desligar o Ar-Condicionado do Quarto 2");
        System.out.println("11 – Abrir a persiana do Quarto 2");
        System.out.println("12 – Fechar a persiana do Quarto 2");
        System.out.println("13 – Acender a Luz do Quarto 3");
        System.out.println("14 – Apagar a Luz do Quarto 3");
        System.out.println("15 – Ligar o Ar-Condicionado do Quarto 3");
        System.out.println("16 – Desligar o Ar-Condicionado do Quarto 3");
        System.out.println("17 – Abrir a persiana do Quarto 3");
        System.out.println("18 – Fechar a persiana do Quarto 3");
        System.out.println("19 – Acender a Luz da Sala de Tv");
        System.out.println("20 – Apagar a Luz da Sala de Tv");
        System.out.println("21 – Acender a Luz da Sala de Jantar");
        System.out.println("22 – Apagar a Luz da Sala de Jantar");
        System.out.println("23 – Ligar a Irrigação do Jardim");
        System.out.println("24 – Desligar a Irrigação do Jardim");
        System.out.println("25 – Abrir o Portão Social");
        System.out.println("26 – Fechar o Portão Social");
        System.out.println("27 – Abrir o portão da Garagem");
        System.out.println("28 – Fechar o portão da Garagem");
        System.out.println("29 – Acender a Luz da Garagem");
        System.out.println("30 – Apagar a Luz da Garagem");
        System.out.println("31 – Ligar o Motor da Piscina");
        System.out.println("32 – Desligar o Motor da Piscina");
        System.out.println("33 – Ligar a Cerca Elétrica");
        System.out.println("34 – Desligar a Cerca Elétrica");
        System.out.println("0 – Sair");
    }

    //controle para os dispositivos

    //Luz da Garagem
    private static void acionarLuzGaragem(boolean acionar) {
        if (acionar && luzGaragem) {
            System.out.println("A luz da Garagem já está acesa.");
        } else if (!acionar && !luzGaragem) {
            System.out.println("A luz da Garagem já está apagada.");
        } else {
            luzGaragem = acionar;
            System.out.println(acionar ? "Luz da Garagem acesa." : "Luz da Garagem apagada.");
        }
    }

    //Luz do Quarto 1
    private static void acionarLuzQuarto1(boolean acionar) {
        if (acionar && luzQuarto1) {
            System.out.println("A luz do Quarto 1 já está acesa.");
        } else if (!acionar && !luzQuarto1) {
            System.out.println("A luz do Quarto 1 já está apagada.");
        } else {
            luzQuarto1 = acionar;
            System.out.println(acionar ? "Luz do Quarto 1 acesa." : "Luz do Quarto 1 apagada.");
        }
    }

    //Ar Condicionado do Quarto 1
    private static void acionarArCondicionadoQuarto1(boolean acionar) {
        if (acionar && arCondicionadoQuarto1) {
            System.out.println("O ar-condicionado do Quarto 1 já está ligado.");
        } else if (!acionar && !arCondicionadoQuarto1) {
            System.out.println("O ar-condicionado do Quarto 1 já está desligado.");
        } else {
            arCondicionadoQuarto1 = acionar;
            System.out.println(acionar ? "Ar-condicionado do Quarto 1 ligado." : "Ar-condicionado do Quarto 1 desligado.");
        }
    }

    //Persiana do Quarto 1
    private static void acionarPersianaQuarto1(boolean acionar) {
        if (acionar && persianaQuarto1) {
            System.out.println("A persiana do Quarto 1 já está aberta.");
        } else if (!acionar && !persianaQuarto1) {
            System.out.println("A persiana do Quarto 1 já está fechada.");
        } else {
            persianaQuarto1 = acionar;
            System.out.println(acionar ? "Persiana do Quarto 1 aberta." : "Persiana do Quarto 1 fechada.");
        }
    }

    //Luz do Quarto 2
    private static void acionarLuzQuarto2(boolean acionar) {
        if (acionar && luzQuarto2) {
            System.out.println("A luz do Quarto 2 já está acesa.");
        } else if (!acionar && !luzQuarto2) {
            System.out.println("A luz do Quarto 2 já está apagada.");
        } else {
            luzQuarto2 = acionar;
            System.out.println(acionar ? "Luz do Quarto 2 acesa." : "Luz do Quarto 2 apagada.");
        }
    }

    // Ar Condicionado do Quarto 2
    private static void acionarArCondicionadoQuarto2(boolean acionar) {
        if (acionar && arCondicionadoQuarto2) {
            System.out.println("O ar-condicionado do Quarto 2 já está ligado.");
        } else if (!acionar && !arCondicionadoQuarto2) {
            System.out.println("O ar-condicionado do Quarto 2 já está desligado.");
        } else {
            arCondicionadoQuarto2 = acionar;
            System.out.println(acionar ? "Ar-condicionado do Quarto 2 ligado." : "Ar-condicionado do Quarto 2 desligado.");
        }
    }

    // Persiana do Quarto 2
    private static void acionarPersianaQuarto2(boolean acionar) {
        if (acionar && persianaQuarto2) {
            System.out.println("A persiana do Quarto 2 já está aberta.");
        } else if (!acionar && !persianaQuarto2) {
            System.out.println("A persiana do Quarto 2 já está fechada.");
        } else {
            persianaQuarto2 = acionar;
            System.out.println(acionar ? "Persiana do Quarto 2 aberta." : "Persiana do Quarto 2 fechada.");
        }
    }

    // Luz do Quarto 3
    private static void acionarLuzQuarto3(boolean acionar) {
        if (acionar && luzQuarto3) {
            System.out.println("A luz do Quarto 3 já está acesa.");
        } else if (!acionar && !luzQuarto3) {
            System.out.println("A luz do Quarto 3 já está apagada.");
        } else {
            luzQuarto3 = acionar;
            System.out.println(acionar ? "Luz do Quarto 3 acesa." : "Luz do Quarto 3 apagada.");
        }
    }

    // Ar Condicionado do Quarto 3
    private static void acionarArCondicionadoQuarto3(boolean acionar) {
        if (acionar && arCondicionadoQuarto3) {
            System.out.println("O ar-condicionado do Quarto 3 já está ligado.");
        } else if (!acionar && !arCondicionadoQuarto3) {
            System.out.println("O ar-condicionado do Quarto 3 já está desligado.");
        } else {
            arCondicionadoQuarto3 = acionar;
            System.out.println(acionar ? "Ar-condicionado do Quarto 3 ligado." : "Ar-condicionado do Quarto 3 desligado.");
        }
    }

    // Persiana do Quarto 3
    private static void acionarPersianaQuarto3(boolean acionar) {
        if (acionar && persianaQuarto3) {
            System.out.println("A persiana do Quarto 3 já está aberta.");
        } else if (!acionar && !persianaQuarto3) {
            System.out.println("A persiana do Quarto 3 já está fechada.");
        } else {
            persianaQuarto3 = acionar;
            System.out.println(acionar ? "Persiana do Quarto 3 aberta." : "Persiana do Quarto 3 fechada.");
        }
    }

    // Luz da Sala de TV
    private static void acionarLuzSalaTv(boolean acionar) {
        if (acionar && luzSalaTv) {
            System.out.println("A luz da Sala de TV já está acesa.");
        } else if (!acionar && !luzSalaTv) {
            System.out.println("A luz da Sala de TV já está apagada.");
        } else {
            luzSalaTv = acionar;
            System.out.println(acionar ? "Luz da Sala de TV acesa." : "Luz da Sala de TV apagada.");
        }
    }

    //  Luz da Sala de Jantar
    private static void acionarLuzSalaJantar(boolean acionar) {
        if (acionar && luzSalaJantar) {
            System.out.println("A luz da Sala de Jantar já está acesa.");
        } else if (!acionar && !luzSalaJantar) {
            System.out.println("A luz da Sala de Jantar já está apagada.");
        } else {
            luzSalaJantar = acionar;
            System.out.println(acionar ? "Luz da Sala de Jantar acesa." : "Luz da Sala de Jantar apagada.");
        }
    }

    // Irrigação do Jardim
    private static void acionarIrrigacaoJardim(boolean acionar) {
        if (acionar && irrigacaoJardim) {
            System.out.println("A irrigação do Jardim já está ligada.");
        } else if (!acionar && !irrigacaoJardim) {
            System.out.println("A irrigação do Jardim já está desligada.");
        } else {
            irrigacaoJardim = acionar;
            System.out.println(acionar ? "Irrigação do Jardim ligada." : "Irrigação do Jardim desligada.");
        }
    }

    // Portão da Garagem
    private static void acionarPortaoGaragem(boolean acionar) {
        if (acionar && portaoGaragem) {
            System.out.println("O portão da Garagem já está aberto.");
        } else if (!acionar && !portaoGaragem) {
            System.out.println("O portão da Garagem já está fechado.");
        } else {
            portaoGaragem = acionar;
            System.out.println(acionar ? "Portão da Garagem aberto." : "Portão da Garagem fechado.");
        }
    }

    // Portão Social
    private static void acionarPortaoSocial(boolean acionar) {
        if (acionar && portaoSocial) {
            System.out.println("O portão Social já está aberto.");
        } else if (!acionar && !portaoSocial) {
            System.out.println("O portão Social já está fechado.");
        } else {
            portaoSocial = acionar;
            System.out.println(acionar ? "Portão Social aberto." : "Portão Social fechado.");
        }
    }

    // Motor da Piscina
    private static void acionarMotorPiscina(boolean acionar) {
        if (acionar && motorPiscina) {
            System.out.println("O motor da piscina já está ligado.");
        } else if (!acionar && !motorPiscina) {
            System.out.println("O motor da piscina já está desligado.");
        } else {
            motorPiscina = acionar;
            System.out.println(acionar ? "Motor da piscina ligado." : "Motor da piscina desligado.");
        }
    }

    // Cerca Elétrica
    private static void acionarCercaEletrica(boolean acionar) {
        if (acionar && cercaEletrica) {
            System.out.println("A cerca elétrica já está ligada.");
        } else if (!acionar && !cercaEletrica) {
            System.out.println("A cerca elétrica já está desligada.");
        } else {
            cercaEletrica = acionar;
            System.out.println(acionar ? "Cerca elétrica ligada." : "Cerca elétrica desligada.");
        }
    }
}
