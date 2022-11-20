package com.mycompany.cinema;

import javax.swing.JOptionPane;

public class TesteApp {

    public static void main(String[] args) {
        String menu = "1-Cadastrar, 2-Atualizar, 3-Apagar, 4-Listar, 0-Sair";
        int op;
        
        // variaveis
        String nomeUsuario = null;
        String cep = null;
        String email = null;
        String administrador = null;
        Integer id = null;
        String senha = null;
        
        Usuario usu = new Usuario();
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1 -> {
                    nomeUsuario = JOptionPane.showInputDialog("nome: ");
                    cep = JOptionPane.showInputDialog("cep: ");
                    email = JOptionPane.showInputDialog("email: ");
                    senha = JOptionPane.showInputDialog("senha: ");
                    
                    
                    
                    usu.setNomeUsuario(nomeUsuario);
                    usu.setCep(cep);
                    usu.setEmail(email);
                    usu.setSenha(senha);
                    
                    usu.inserir();
                    break;
                }
                case 2 -> {
                    id = Integer.parseInt(JOptionPane.showInputDialog("id: "));
                    nomeUsuario = JOptionPane.showInputDialog("nome: ");
                    cep = JOptionPane.showInputDialog("cep: ");
                    email = JOptionPane.showInputDialog("email: ");
                    
                    
                    usu.setNomeUsuario(nomeUsuario);
                    usu.setCep(cep);
                    usu.setEmail(email);
                    usu.setId(id);
                    
                    usu.atualizar();
                    break;
                }
                case 3 -> {
                    id = Integer.parseInt(JOptionPane.showInputDialog("id: "));
                    
                    usu.setId(id);
                    
                    usu.deletar();
                    break;
                }
                case 4 -> {
                    usu.listar();
                    break;
                }
                case 0 -> {
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while (op != 0);
    }
    }

