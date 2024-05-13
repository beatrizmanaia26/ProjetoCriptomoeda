/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.BemVindoAdministrador;
import view.Login;

/**
 *
 * @author beatr
 */
public class ControllerLogin {
    private Login view;

    public ControllerLogin(Login view) {
        this.view = view;
    }
    
    
   public void ValidarUsuario(){
<<<<<<< Updated upstream
       String cpfLogin = view.getTxtCPF().getText();
       String senhaLogin = view.getTxtSenha().getText();
=======
       //String cpfLogin = view.getLblCPF().getText();
       //String senhaLogin = view.getLblSenha().getText();
       String cpfLogin = "52659434865";
       String senhaLogin = "belu";
>>>>>>> Stashed changes
       
       if (cpfLogin.equals("52659434865") && !senhaLogin.equals("belu")){
           BemVindoAdministrador adm = new BemVindoAdministrador();
           adm.setVisible(true);
           view.setVisible(false);
<<<<<<< Updated upstream
       }
       else{
//           System.out.println("AAAAAA");
=======
       }          
       else{
           System.out.println("Cpf ou senha inválidos");
>>>>>>> Stashed changes
       }
    }    
}


