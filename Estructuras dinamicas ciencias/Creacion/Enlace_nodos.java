package Creacion;


import Nodo.Definicion;
import com.sun.nio.file.ExtendedWatchEventModifier;
import java.util.Random;
import javax.swing.JOptionPane;
public class Enlace_nodos {
 int i,valor;
 String entrada=" ";
 
 Definicion p,q,cab,aux,aux1;
 public String mostrar= "";


 public void captura(){

    //cab = null;

     int cantidad = new Random().nextInt(10)+1;
   
     for(i=0;i<=cantidad;i++){
         q=new Definicion();
         if(cab==null){
             q.num=new Random().nextInt(10)+1;
             q.sig=null;
             p=q;
             cab=q;
            

             
         }
         else{
             q.num=new Random().nextInt(10)+1;
             q.sig=null;
             cab.sig=q;
             cab=q;
             
             
         }
     }
 }// fin del metodo captura
 






 public void impre(){
     aux=p;
     while(aux.sig!=null){
         mostrar = mostrar + "    "+  aux.num;
         //System.out.println(aux.num);
         aux=aux.sig;
     }
     JOptionPane.showMessageDialog(null,"RESULTADO ENLACES\n" + mostrar ); 
     mostrar="";
 }// fin del metodo impre
 
 public void retiro(){
     
     entrada=JOptionPane.showInputDialog("Digite el numero a retirar");
     valor=Integer.parseInt(entrada);
     aux=p;
     aux1 = null;

     while(aux!=null && aux.num!=valor){
         
         aux1=aux;
         aux=aux.sig;
     }
     if( aux == null){
            JOptionPane.showMessageDialog(null,"El nodo no existe");
            return;
     }
    
     if (aux ==p){
        p =aux.sig;
        JOptionPane.showMessageDialog(null,"El nodo fue retirado");
     } else {
        aux1.sig=aux.sig;
        JOptionPane.showMessageDialog(null,"El nodo fue retirado");
     }
     
     
 }//fin del metodo retiro




}// fin de la clase