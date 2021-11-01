package Site_Cartoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <Remetente> listaRemetentes = new ArrayList<>();
        int opcao, opcao2;
        boolean flag;
        String nome, sobrenome, email, escolhaMensagem, mensagemPlus;
       
        do{
            opcao = menu(entrada);
            switch (opcao) {
                case 1 -> {
                    if (listaRemetentes.isEmpty()) {
                        System.out.println("Digite o Nome e Sobrenome: ");
                        nome = entrada.next().toUpperCase();
                        sobrenome = entrada.next().toUpperCase();
                        System.out.println("Digite o E-mail: ");
                        email = entrada.next().toLowerCase();
                        Remetente novoRemetente = new Remetente(nome, sobrenome, email);
                        listaRemetentes.add(novoRemetente);
                        System.out.println("REMETENTE CADASTRADO COM SUCESSO!");
                        break;
                    }
                    System.out.println("Digite o Nome e Sobrenome: ");
                    nome = entrada.next().toUpperCase();
                    sobrenome = entrada.next().toUpperCase();
                    System.out.println("Digite o E-mail: ");
                    email = entrada.next().toLowerCase();
                    flag = false;
                    for (Remetente listaRemetente : listaRemetentes) {
                        if (listaRemetente.getEmail().equals(email)) {
                            System.out.println("\nUM REMETENTENTE COM ESSE EMAIL JÁ ESTÁ CADASTRADO NO SISTEMA!\n" + listaRemetente.getNome() + " " + listaRemetente.getSobrenome());
                            flag = true;
                        }
                    }
                    if (!flag) {
                        Remetente novoRemetente = new Remetente(nome, sobrenome, email);
                        listaRemetentes.add(novoRemetente);
                        System.out.println("REMETENTE CADASTRADO COM SUCESSO!");
                    }
                }
                case 2 -> {
                    System.out.println("Digite o NOME e SOBRENOME do DESTINATÁRIO: ");
                    nome = entrada.next().toUpperCase();
                    sobrenome = entrada.next().toUpperCase();
                    Pessoa destinatario = new Pessoa(nome, sobrenome);
                    do {
                        System.out.println("\nQual o Tipo do Cartão deseja enviar? (Digite a opção referente) \n 1 - Natal \n 2 - Aniversario \n 3 - Dia dos Namorados \n");
                        opcao2 = entrada.nextInt();
                    } while (opcao2 != 1 && opcao2 != 2 && opcao2 != 3);

                    switch (opcao2) {
                        case 1 -> {
                            Natal n1 = new Natal(destinatario);
                            System.out.println("Esta Será a Mensagem do Cartão: \n");
                            n1.showMessage();
                            do {
                                System.out.print("\nDeseja Adicionar uma Mensagem Particular? [S] Sim || [N] Não : ");
                                escolhaMensagem = entrada.next().toUpperCase();
                            } while (escolhaMensagem.charAt(0) != 'S' && escolhaMensagem.charAt(0) != 'N');

                            if (escolhaMensagem.charAt(0) == 'S') {
                                entrada.nextLine();
                                System.out.println("\nDigite a mensagem particular aqui: ");
                                mensagemPlus = entrada.nextLine();
                                n1.setMensagemPlus(mensagemPlus);
                            } else {
                                System.out.println("Seu Cartão Está Quase Pronto..\n");
                            }
                            System.out.println("Apenas Digite Seu Email Para Concluir: ");
                            email = entrada.next().toLowerCase();
                            System.out.println("\nAqui está seu o cartão: \n");
                            for (Remetente listaRemetente : listaRemetentes) {
                                if (listaRemetente.getEmail().equals(email)) {
                                    listaRemetente.addCartão(n1);
                                    listaRemetente.showCartão(n1);
                                    break;
                                } else {
                                    System.out.println("\nNENHUM REMETENTE ENCONTRADO COM ESTE EMAIL!");
                                }
                            }

                        }
                        case 2 -> {
                            Aniversario a1 = new Aniversario(destinatario);
                            System.out.println("Esta Será a Mensagem do Cartão: \n");
                            a1.showMessage();
                            do {
                                System.out.print("\nDeseja Adicionar uma Mensagem Particular? [S] Sim || [N] Não : ");
                                escolhaMensagem = entrada.next().toUpperCase();
                            } while (escolhaMensagem.charAt(0) != 'S' && escolhaMensagem.charAt(0) != 'N');

                            if (escolhaMensagem.charAt(0) == 'S') {
                                entrada.nextLine();
                                System.out.println("\nDigite a mensagem particular aqui: ");
                                mensagemPlus = entrada.nextLine();
                                a1.setMensagemPlus(mensagemPlus);
                            } else {
                                System.out.println("Seu Cartão Está Quase Pronto..\n");
                            }
                            System.out.println("Apenas Digite Seu Email Para Concluir: ");
                            email = entrada.next().toLowerCase();
                            System.out.println("\nAqui está seu o cartão: \n");
                            for (Remetente listaRemetente : listaRemetentes) {
                                if (listaRemetente.getEmail().equals(email)) {
                                    listaRemetente.addCartão(a1);
                                    listaRemetente.showCartão(a1);
                                    break;
                                } else {
                                    System.out.println("\nNENHUM REMETENTE ENCONTRADO COM ESTE EMAIL!");
                                }
                            }
                        }

                        case 3 -> {
                            DiaDosNamorados d1 = new DiaDosNamorados(destinatario);
                            System.out.println("Esta Será a Mensagem do Cartão: \n");
                            d1.showMessage();
                            do {
                                System.out.print("\nDeseja Adicionar uma Mensagem Particular? [S] Sim || [N] Não : ");
                                escolhaMensagem = entrada.next().toUpperCase();
                            } while (escolhaMensagem.charAt(0) != 'S' && escolhaMensagem.charAt(0) != 'N');

                            if (escolhaMensagem.charAt(0) == 'S') {
                                entrada.nextLine();
                                System.out.println("\nDigite a mensagem particular aqui: ");
                                mensagemPlus = entrada.nextLine();
                                d1.setMensagemPlus(mensagemPlus);
                            } else {
                                System.out.println("Seu Cartão Está Quase Pronto..\n");
                            }
                            System.out.println("Apenas Digite Seu Email Para Concluir: ");
                            email = entrada.next().toLowerCase();
                            System.out.println("\nAqui está seu o cartão: \n");
                            for (Remetente listaRemetente : listaRemetentes) {
                                if (listaRemetente.getEmail().equals(email)) {
                                    listaRemetente.addCartão(d1);
                                    listaRemetente.showCartão(d1);
                                    break;
                                } else {
                                    System.out.println("\nNENHUM REMETENTE ENCONTRADO COM ESTE EMAIL!");
                                }
                            }
                        }

                    }
                }
                case 3 -> System.out.println("FINALIZANDO O PROGRAMA...");
            }
        }while (opcao != 3);
        entrada.close();
    }

    public static int menu(Scanner entrada){
        String menuOpcoes = """

        ===== MENU DE OPÇOES =====
        DIGITE O NÚMERO REFERENTE A OPÇÃO DESEJADA

        1 - Permita o cadastro dos usuários (Remetente)
        2 - Permita enviar um cartão a um destinatário.
        3 - Sair do sistema
        """;
        int opcao;
        do{
            System.out.println(menuOpcoes);
            opcao = entrada.nextInt();
        }while(opcao != 1 && opcao != 2 && opcao != 3);
        return opcao;
    }
}
