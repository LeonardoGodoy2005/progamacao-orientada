package atividade_01.aplicacao;

import atividade_01.entidades.Computador;
import atividade_01.entidades.Programa;
import atividade_01.entidades.SistemaOperacional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner pc = new Scanner(System.in);

        System.out.println("--- Informacoes do PC ---");
        System.out.println("Informe RAM do PC em GB");
        int ram = pc.nextInt();

        System.out.println("Inforeme o armazenamento do PC em GB");
        int ssd = pc.nextInt();

        System.out.println("Informe os nucleos do PC");
        int nucleos = pc.nextInt();

        System.out.println("Informe a quantidade de operacoes por segundo(EX: 1,80) do PC");
        double opPorSec = pc.nextDouble();

		Computador PC = new Computador(ram, ssd, nucleos, opPorSec);

        SistemaOperacional SO = new SistemaOperacional(PC);

        System.out.println();
        System.out.println("--- Analizando Programas ---");
        System.out.println();

        Programa prog1 = new Programa(8, 500,4, 200);
        SO.executarPrograma(prog1);
        System.out.println();

        Programa prog2 = new Programa(16, 1000,6, 2000);
        SO.executarPrograma(prog2);
        System.out.println();

        Programa prog3 = new Programa(32, 2000,8, 20000);
        SO.executarPrograma(prog3);
        System.out.println();

        pc.close();
	}

}
