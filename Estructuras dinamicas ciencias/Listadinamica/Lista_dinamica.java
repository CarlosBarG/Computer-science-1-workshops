package Listadinamica;

import Creacion.Enlace_nodos;
import javax.swing.JOptionPane;
public class Lista_dinamica {

    public static void main(String[] args) {
       int op1;
        Enlace_nodos obj = new Enlace_nodos();
       // obj.captura();
       // JOptionPane.showMessageDialog(null,"RESULTADO ENLACES\n" + obj.total );
        //obj.impre();
        //obj.retiro();
       // obj.impre();
        //String op=JOptionPane.showInputDialog(" **** DIGITE OPCION ****\n"
        do{
        op1=Integer.parseInt(JOptionPane.showInputDialog("****** DIGITE OPCION ****\n"   
             + "1. Capturar\n" 
             + "2. Imprimir\n"
             + "3. Retirar\n"
             + "5. Salir\n")
             );

       
            switch(op1){
                case 1:
                    obj.captura();
                    JOptionPane.showMessageDialog(null,"**** LISTA CREADA *****\n" );
                    break;
                case 2:
                    obj.impre();
                    break;
                case 3:
                    obj.retiro();
                    obj.impre();

                    break;
                
                case 4:
                    System.exit(0);
                
            }// fin switch
            
        }while(op1<5);
       
       
        
    }
}
