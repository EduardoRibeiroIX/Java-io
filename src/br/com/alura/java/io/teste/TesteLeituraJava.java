package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStreamReader.*;


public class TesteLeituraJava 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis = new FileInputStream("omago.txt"); // Retorna binário
		InputStreamReader isr = new InputStreamReader(fis); // Retorna caractéres
		BufferedReader bf = new BufferedReader(isr); // Retorna texto
		
		String txt = bf.readLine();
		
		System.out.println(txt);
		
		
		bf.close();
	}

}
