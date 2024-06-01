//! esercizio calcolo area e perimetro rettangolo

//esercizio LEVEL UP con i costruttori e chiedere all'utente di inserire la base e l'altezza

import java.util.Scanner;

public class Rettangolo {

    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza){      //creiamo il costruttore per prendere gli input dall'utente e inserirli nelle variabili
        super();
        this.base = base;
        this.altezza = altezza;
    }

    public int area() {
        int area = base * altezza;
        return area;
    }

    public int perimetro() {
        int perimetro = 2 * base + 2 * altezza;
        return perimetro;
    }

    // poi per fare in modo che i dati che sono privati cioè base ed altezza 
    //useremo l'INCAPSULAMENTO cioè GETTER e SETTER

    public int getBase(){
      return base;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getAltezza(){
      return altezza;
    }

    public void setAltezza(int altezza){
        this.altezza = altezza;
    }

   //! qui inseriamo il main dove possiamo testare ciò che è stato scritto sopra ossia anche i metodi

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);       // facciamo in modo di prendere gli input con Scanner

    System.out.println("scrivi la base");     //diciamo all'utente di inserire base ed altezza
    int base = scan.nextInt();

    System.out.println("scrivi l'altezza");
    int altezza = scan.nextInt();

    Rettangolo r = new Rettangolo(base, altezza);      //creiamo l'istanza della classe Retangolo

    System.out.println("area: " + r.area());         //qui stampiamo i risultati
    System.out.println("perimetro: " + r.perimetro());
   }



}
