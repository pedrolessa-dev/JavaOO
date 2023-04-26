package br.com.bancoteste.userinterface;

import java.util.Scanner;
import br.com.bancoteste.core.Conta;
import br.com.bancoteste.core.ContaEspecial;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta lista[] = new Conta[6];
		lista[0] = new Conta("Ana", "1234", 9876, 0);
		lista[1] = new ContaEspecial("Elton", "1235", 9877, 0, 400);
		lista[2] = new Conta("Wesley", "1236", 9878, 0);
		lista[3] = new ContaEspecial("Kamilla", "1237", 9879, 0, 600);
		lista[4] = new Conta("Carlinhos", "1238", 9880, 0);
		lista[5] = new ContaEspecial("Pedro", "1239", 9881, 0, 800);
		for (Conta c : lista) {
			System.out.println(c);
			if (c.debitar(100)) {
				System.out.println("Débito autorizado na conta de " + c.getNomeTitular());
			} else {
				System.out.println("Desculpe, " + c.getNomeTitular() + ", mas o débito não foi bem sucedido");
			}
			
			// O operador instanceof confere se o objeto é do tipo ContaEspecial 
			System.out.println("Titular: " + c.getNomeTitular());
			if (c instanceof ContaEspecial) {
				System.out.println("Tem conta especial");
				ContaEspecial ce = (ContaEspecial) c;
				System.out.println("E tem um limite de: "+ce.getLimite());
			} else {
				System.out.println("Tem conta comum");
			}
		}
		sc.close();
	}
}