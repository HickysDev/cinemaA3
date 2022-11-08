package com.mycompany.cinema;

import javax.swing.JOptionPane;

public class TesteApp {

    public static void main(String[] args) {
        String menu = "1-Cadastrar, 2-Atualizar, 3-Apagar, 4-Listar, 0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    String nomeUsuario = JOptionPane.showInputDialog("nome: ");
                    Integer cep = Integer.parseInt(JOptionPane.showInputDialog("cep: "));
                    String email = JOptionPane.showInputDialog("email: ");
                    
                    Usuario usu = new Usuario(nomeUsuario, cep, email);
                    usu.setNomeUsuario(nomeUsuario);
                    usu.setCep(cep);
                    usu.setEmail(email);
                    
                    usu.inserir();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while (op != 0);
    }
    }

