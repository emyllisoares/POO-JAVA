import java.util.Scanner;

public class App {
 
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    for(int i = 1; i <= 4; i++) {
            Curso curso = new Curso();
            System.out.println("Digite o nome do curso: ");
            curso.nome = sc.nextLine();
            System.out.println("Digite o turno do curso: ");
            curso.turno = sc.nextLine();
            System.out.println("Digite a materia do curso: ");
            curso.materia = sc.nextLine();
            System.out.println("Digite a matricula do curso: ");
            curso.matricula = sc.nextInt();
            sc.nextLine();
            System.out.println("Curso " + i + ":");
            System.out.println("Nome: " + curso.nome);
            System.out.println("Turno: " + curso.turno);
            System.out.println("Materia: " + curso.materia);
            System.out.println("Matricula: " + curso.matricula);
        }
    }
}