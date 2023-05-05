/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_junniorsauceda;
import java.util.Scanner;
/**
 *
 * @author Junnior Sauceda
 */
public class Lab3P1_JunniorSauceda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean seguir=true;
        while (seguir){
            System.out.println("1.-Serie Euclidiana");
            System.out.println("2.-Pokebola");
            System.out.println("3.-¡OK Boomer!");
            System.out.println("4.-Salir");
            System.out.println("Ingrese una opcion:");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1:
                {
                    System.out.println("Puntos a ingresar: ");
                    int numero=sc.nextInt();
                    int limite=numero;
                    if(numero<0){
                        limite=limite*-1;
                    }
                    int x=1;
                    double respuesta3=0;
                    while(x<=limite){
                        System.out.println("X:");
                        int X=sc.nextInt();
                        System.out.println("Y:");
                        int Y=sc.nextInt();
                        double respuesta=X-Y;
                        double respuesta2= Math.pow(respuesta,2);
                        respuesta3=respuesta3+respuesta2;
                        x++;
                    }
                    double respuestafinal= Math.sqrt(respuesta3);
                    System.out.println("La distancia euclidiana es:"+respuestafinal);
                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese el tamaño de la pokebola: ");
                    int tamaño=sc.nextInt();
                    while(tamaño<=0){
                        System.out.println("Ingrese un numero positivo:");
                        tamaño=sc.nextInt();
                    }
                    int ancho=(tamaño*2)-1;
                    for (int x=1;x<=tamaño;x++){
                        for(int j=1;j<=ancho;j++){
                            if(x<=(tamaño/2)-1 || x==1 || x==tamaño || j==1 || j==ancho){
                                System.out.print("*");
                            }
                            else if(x==tamaño/2){//Arriba
                                if(j<=ancho/3 || j>((ancho*2)/3)){
                                    System.out.print("*");
                                }
                                else if(j>(ancho/3) && j<=(ancho*2)/3){
                                    System.out.print("#");
                                }
                            }//fin arriba
                            else if(x==tamaño/2+1){
                                if(j<=ancho/3){
                                    System.out.print("#");
                                }
                                else if(j>(ancho/3)*2+1 ){
                                    System.out.print("#");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            else if(x==tamaño/2+2){//abajo
                                if(j<=ancho/3 || j>((ancho*2)/3)){
                                    System.out.print(" ");
                                }
                                else if(j>ancho/3&&j<=ancho*2/3){
                                    System.out.print("#");
                                }
                            }//fin abajo
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Ingrese su año de nacimiento:");
                    int fecha=sc.nextInt();
                    int generacion=9;
                    if(fecha>=1946&&fecha<=1964){
                        generacion=6;
                    }
                    if(fecha>=1960&&fecha<=1979){
                        generacion=5;
                    }
                    if(fecha>=1975&&fecha<=1985){
                        generacion=4;
                    }
                    if(fecha>=1980&&fecha<=1994){
                        generacion=3;
                    }
                    if(fecha>=1990&&fecha<=2012){
                        generacion=2;
                    }
                    if(fecha>=2013&&fecha<=2025){
                        generacion=1;
                    }
                    switch(generacion){
                        case 1:
                            System.out.println("¡Felicidades usted es de la Gen Alpha!");
                            break;
                        case 2:
                            System.out.println("¡Felicidades usted es de la Gen Z!");
                            break;
                        case 3:
                            System.out.println("¡Felicidades usted es de la generacion Millenials!");
                            break;
                        case 4:
                            System.out.println("¡Felicidades usted es de la generacion Xennials!");
                            break;
                        case 5:
                            System.out.println("¡Felicidades usted es de la Generation X!");
                            break;
                        case 6:
                            System.out.println("¡Felicidades usted es de la generacion Baby Boomer Xennials!");
                            break;
                        default:
                            System.out.println("Fecha Invalida");
                            break;
                    }//Lo hice con Switch para hacerlo diferente al resto,se que se podia poner el mensaje directamente en los if :v
                    break;
                }
                case 4:
                {
                    seguir=false;
                    break;
                }
                default:
                {
                    System.out.println("Opcion no valida");
                    break;
                }
            }
        }
        // TODO code application logic her
    }
    
}
