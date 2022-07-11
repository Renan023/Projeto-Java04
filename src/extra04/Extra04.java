
package extra04;

import java.util.Date;
import java.util.Scanner;


public class Extra04 {

   
    public static void main(String[] args) {
            Date d = new Date();
            Scanner t = new Scanner(System.in);
            String resp ;
            
            
            System.out.println(d);
            System.out.println("Olá sou a Carolina e vou te ajudar ");       
                System.out.println("Qual seu nome? ");
                String nome = t.next();
                System.out.println("Qual seu e-mail?");
                String email = t.next();
                System.out.println("Sua idade?");
                int id = t.nextInt();
                System.out.println("UAU Parabéns. Nunca é cedo e nem tarde para aprender ");
                System.out.println("-----------------------------------------------------");
                System.out.println("Seus dados informados");
                System.out.println("Nome "+nome);
                System.out.println("Idade "+id+" anos");
                System.out.println("E-mail "+email);
                System.out.println("---------------------------------------------------------");
                System.out.println("Vamos prosseguir, então ....");
                System.out.println("Curso ");
                Curso c[] = new Curso[3];
                c[0] = new Curso(01,"Java do básico ao avançado",
                                   2400,"Básico",true);
                c[1] = new Curso(02,"Enfermagem",3500,"Básico",false);
                c[2] = new Curso(03,"Ed Física",4000, "Básico", true);
                c[1].statuscurso();
                c[1].iniciar();
    }
}