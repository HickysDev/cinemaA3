package com.mycompany.cinema;

import javax.swing.JOptionPane;

public class TesteApp {

    public static void main(String[] args) {
        String menu = "1-Cadastrar, 2-Atualizar, 3-Apagar, 4-Listar, 0-Sair";
        int op;
        
        // variaveis
        String nomeUsuario = null;
        Integer cep = null;
        String email = null;
        Integer id = null;
        
        Usuario usu = new Usuario(nomeUsuario, cep, email, id);
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    nomeUsuario = JOptionPane.showInputDialog("nome: ");
                    cep = Integer.parseInt(JOptionPane.showInputDialog("cep: "));
                    email = JOptionPane.showInputDialog("email: ");
                    
                    
                    
                    usu.setNomeUsuario(nomeUsuario);
                    usu.setCep(cep);
                    usu.setEmail(email);
                    
                    usu.inserir();
                    break;
                case 2:
                    id = Integer.parseInt(JOptionPane.showInputDialog("id: "));
                    nomeUsuario = JOptionPane.showInputDialog("nome: ");
                    cep = Integer.parseInt(JOptionPane.showInputDialog("cep: "));
                    email = JOptionPane.showInputDialog("email: ");
                    
                    
                    usu.setNomeUsuario(nomeUsuario);
                    usu.setCep(cep);
                    usu.setEmail(email);
                    usu.setId(id);
                    
                    usu.atualizar();
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

