/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado2;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Colegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Spotyfi2 song[] = new Spotyfi2[10];
        
        String titulo2;
        String autor2;
        int id2;
        int duracion2;
        int anio2;
        int p;
        int o;
        String s;
        int cancion = 10;
        
        int dur[] = new int[10];
        
        
        for (int i = 0; i < cancion; i++) {
            titulo2= JOptionPane.showInputDialog("Introduzca el nombre de la cancion n° "+(i+1));
            autor2 = JOptionPane.showInputDialog("Introduzca el autor de la canción "+titulo2);
            id2= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la identificación de la canción (posición en top) "+titulo2));
            duracion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la duración de la canción "+ titulo2 + " (en segundos)"));
            anio2= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de la canción "+titulo2));
            song[i] = new Spotyfi2(id2,titulo2,autor2,duracion2,anio2);
        }
        
        
       
        s = "Canciones anteriores al año presente: \n\n";
        p = 0;
        for (int i = 0; i < cancion; i++) {
            anio2= song[i].getAnio();
            if(anio2<2023){
                p= p + 1;
                s = s + p + ". "+song[i].getTitulo()+"\n";
            }           
        }
        JOptionPane.showMessageDialog(null, s);
        
        s = "Canciones del año presente: \n\n";
        p= 0;
        for (int i = 0; i < cancion; i++) {
            anio2 = song[i].getAnio();
            if(anio2==2023){
                p = p + 1;
                s = s + p + ". "+song[i].getTitulo()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
      
        s = "Canciones anteriores al año presente: \n\n";
        p = 0;
        for (int i = 0; i < cancion; i++) {
            anio2= song[i].getAnio();
            if(anio2>2023){
                p = p + 1;
                s = s + p + ". "+song[i].getTitulo()+"\n";
            }          
        }
        JOptionPane.showMessageDialog(null, s);
        
        
        
        p = 0;
        o = 0;
        
        for (int i = 0; i < cancion; i++) {
            if(song[i].getDuracion()>p){
                o = 0;
                dur[o] = i;
                o = o + 1;
            }else if(song[i].getDuracion()==p){
                dur[o] = i;
                o = o + 1;
            }
        }
        
       
        s= "la Cancion(es) de mayor duración: \n\n";
        p = 0;
        for (int i = 0; i < o; i++) {
            p = p + 1;
            s = s + p + ". "+song[dur[i]].getTitulo()+" "+song[dur[i]].getDuracion()+"\n";         
        }
        JOptionPane.showMessageDialog(null, s);
        
        
        
        for (int i = 0; i < cancion; i++) {
            if(song[i].getId()==1){
                s = "El autor de la canción numero 1 es " + song[i].getAutor();
            }
        }
        JOptionPane.showMessageDialog(null, s);
        
        s = "Top 10: \n";
        p = 1;
        while(p<11){
            for (int i = 0; i < cancion; i++) {
                if (song[i].getId()==p) {
                    s = s + p + ". "+song[i].getTitulo()+"\n";
                }
            }
            p = p + 1;
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
}
