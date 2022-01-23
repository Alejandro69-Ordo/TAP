/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import webs.Request;
import webs.WebOperation;
import webs.WebOperation_Service;




/**
 *
 * @author LENOVO_USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    static Request response;
    public static void main(String[] args) {
        // TODO code application logic here
        
        //__INTERFAZ___
        Interfaz_principal i_p=new Interfaz_principal();
        i_p.setSize(457, 354);
        i_p.getjFrame1().setSize(532, 372);
        i_p.getjFrame2().setSize(455, 485);
        i_p.setLocationRelativeTo(null);
        i_p.getjFrame1().setLocationRelativeTo(null);
        i_p.getjFrame2().setLocationRelativeTo(null);
        i_p.setVisible(true);
        
         //______________SERVICIO___________________
        WebOperation_Service service=new WebOperation_Service();
        WebOperation webOperation=service.getWebOperationPort();
        
        
        //________LISTEN______
        i_p.getBotoniniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(validacionLoginCampos(i_p.getTextcorreo(), i_p.getTextcntra())){
                    if( webOperation.login(i_p.getTextcorreo().getText().toString(),i_p.getTextcntra().getText().toString())){
                    response=webOperation.obtencionDatos(i_p.getTextcorreo().getText().toString());  
         
                      i_p.getTotal_pago().setText(response.getSaldoInicial()+"");
                      i_p.getNombre_usuario().setText(response.getUsuario());
                       i_p.getjFrame1().setVisible(true);
                       i_p.dispose();
                        vaciarlogin(i_p.getTextcorreo(), i_p.getTextcntra());
                     }else{
                     JOptionPane.showMessageDialog(i_p, "Credenciales incorrectas");
                      }
                }else{
                    JOptionPane.showMessageDialog(i_p, "No pueden existir campos vacios");
                }
                
                
            }
        });
        
        i_p.getText_saldo_inicial().addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
                {
             char caracter = e.getKeyChar();

                if(((caracter < '0') ||
              (caracter > '9')) &&
              (caracter != '\b' /*corresponde a BACK_SPACE*/))
                 {
              e.consume();  
                 }
          }
            
        });
        
        i_p.getIngreso1().addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
                {
             char caracter = e.getKeyChar();

                if(((caracter < '0') ||
              (caracter > '9')) &&
              (caracter != '\b' /*corresponde a BACK_SPACE*/))
                 {
              e.consume();  
                 }
          }
            
        });
        
        i_p.getButton_envio().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(validacionDPCampos(i_p.getIngreso1())){
                    if(i_p.getjRadioDeposito().isSelected()){
                    if(webOperation.procesoDeposito(Integer.parseInt(i_p.getIngreso1().getText().toString()) ,response.getUsuario())){
                     
                   int seleccion = JOptionPane.showOptionDialog(
                     i_p.getjFrame1(),
                     "DEPOSITO CORRECTO, Desea realziar otra acción?", 
                    "Seleccion",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "SI", "NO"}, 
                    "opcion 1");
                   
                     if(seleccion==0){
                       
                       response=webOperation.obtencionDatos(response.getUsuario());  
                      i_p.getTotal_pago().setText(response.getSaldoInicial()+"");
                               i_p.getIngreso1().setText("");
                   
                         
                     }else{
                                 i_p.setVisible(true);
                                 i_p.getjFrame1().dispose();
                     }
                      

                     }else{
                         JOptionPane.showMessageDialog(i_p, "Saldo a depositar incorrecto");

                     }
                }else{
                     if(webOperation.procesoPago(Integer.parseInt(i_p.getIngreso1().getText().toString()) ,response.getUsuario())){
                      int seleccion = JOptionPane.showOptionDialog(
                     i_p.getjFrame1(),
                     "PAGO CORRECTO, Desea realziar otra acción?", 
                    "Seleccion",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "SI", "NO"}, 
                    "opcion 1");
                   
                     if(seleccion==0){
                       
                       response=webOperation.obtencionDatos(response.getUsuario());  
                      i_p.getTotal_pago().setText(response.getSaldoInicial()+"");
                               i_p.getIngreso1().setText("");
                   
                         
                     }else{
                                 i_p.setVisible(true);
                                 i_p.getjFrame1().dispose();
                     }
                      
   
                     }else{
                           JOptionPane.showMessageDialog(i_p, "Saldo insuficiente");
                     }
               }
                }else{
                     JOptionPane.showMessageDialog(i_p, "No pueden existir campos vacios");
                } 
            }
        });

        i_p.getRegresar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                  i_p.setVisible(true);
                i_p.getjFrame1().dispose();
            }
        
        });
        
        i_p.getBotonregistrar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               if(validacionRegistroCampos(i_p.getTextcorreo_r(), (JPasswordField) i_p.getTextcntra_r(),i_p.getTextcntra_r2(),i_p.getText_saldo_inicial())){
        
                   if(validacionContraseñCampos((JPasswordField) i_p.getTextcntra_r(),i_p.getTextcntra_r2())){
                       
                       if(webOperation.registrar(i_p.getTextcorreo_r().getText().toString(),i_p.getTextcntra_r().getText().toString(), Integer.parseInt(i_p.getText_saldo_inicial().getText().toString()))){
                          response=webOperation.obtencionDatos(i_p.getTextcorreo_r().getText().toString());
                          i_p.getjFrame2().dispose();
                            i_p.getTotal_pago().setText(response.getSaldoInicial()+"");
                              i_p.getNombre_usuario().setText(response.getUsuario());
                           i_p.getjFrame1().setVisible(true);
                           vaciarregistro(i_p.getTextcorreo_r(), (JPasswordField) i_p.getTextcntra_r(),i_p.getTextcntra_r2(),i_p.getText_saldo_inicial());
                        }else{
                       JOptionPane.showMessageDialog(i_p, "Registro Incorrecto- Usuario ya existente");  
                        }
                   }else{
                        JOptionPane.showMessageDialog(i_p, "Las cotraseñas deben coincidir");
                   }
                   
                   
               }else{
                    JOptionPane.showMessageDialog(i_p, "No pueden existir campos vacios");
               }

            }
        
        });
        
        i_p.getLabel_registro().addMouseListener(new MouseAdapter()  {  
        public void mouseClicked(MouseEvent e)  {  
                i_p.dispose();
                i_p.getjFrame2().setVisible(true);
                vaciarlogin(i_p.getTextcorreo(), i_p.getTextcntra());
        }  
        }); 
   
    }
    
    public static boolean validacionLoginCampos(JTextField correo,JPasswordField contraseña){
        if(correo.getText().isEmpty() || contraseña.getText().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
     public static boolean validacionContraseñCampos(JPasswordField contraseña,JPasswordField contraseñar){
        if(contraseña.getText().toString().equals(contraseñar.getText().toString())){
            return true;
        }else{
            return false;
        }
    }
    
     public static boolean validacionDPCampos(JTextField paga){
        if(paga.getText().isEmpty() ){
            return false;
        }else{
            return true;
        }
    }
     
     public static boolean validacionRegistroCampos(JTextField correo,JPasswordField contraseña1,JPasswordField contraseña2,JTextField paga){
        if(paga.getText().isEmpty() || correo.getText().isEmpty() ||contraseña1.getText().isEmpty()  ||contraseña2.getText().isEmpty()     ){
            return false;
        }else{
            return true;
        }
    }
     
     public static void vaciarregistro(JTextField correo,JPasswordField contraseña1,JPasswordField contraseña2,JTextField paga){
         correo.setText("");
          contraseña1.setText("");
           contraseña2.setText("");
            paga.setText("");
     }
     
     public static void vaciarlogin(JTextField correo,JPasswordField contraseña){
         correo.setText("");
          contraseña.setText("");
     }
    
}
