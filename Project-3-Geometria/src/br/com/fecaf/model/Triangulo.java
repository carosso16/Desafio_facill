package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    // Declaração das variáveis
    public double base, lado2, lado3, area, perimetro, altura;


    Scanner scanner = new Scanner(System.in);

    // Cadastrar os dados do triângulo
    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base:     */");
        base = scanner.nextDouble();  // Lê a base do triângulo
        System.out.print("/* Informe o lado 2:     */");
        lado2 = scanner.nextDouble();  // Lê o lado 2 do triângulo
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();  // Lê o lado 3 do triângulo
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();  // Lê a altura do triângulo
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;  // Retorna true indicando que o cadastro foi bem-sucedido
    }

    // Calcular a área do triângulo
    public void calcularArea() {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        // Fórmula da área do triângulo: (base * altura) / 2
        area = (base * altura) / 2;
        System.out.println("A área é: " + area);  // Exibe a área calculada
        System.out.println("/*********************************/");
    }

    // Calcular o perímetro do triângulo
    public void calcularPerimetro() {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");


        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);  // Exibe o perímetro calculado
        System.out.println("/*********************************/");
    }

    // Definir o tipo do triângulo (Equilátero, Isósceles ou Escaleno)
    public void definirTipo() {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        // Verifica se os três lados são iguais (Equilátero)
        if (base == lado2 && base == lado3) {
            System.out.println("Este Triângulo é Equilátero ...");

            // Verifica se todos os lados são diferentes (Escaleno)
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Este Triângulo é Escaleno ...");

            //  É Isósceles
        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");
    }

    // Método para verificar se o triângulo é retângulo
    public void TrianguloRetangulo() {
        System.out.println("/*********************************/");
        System.out.println("/*     Definindo Triangulo Retangulo         */");
        System.out.println("/*********************************/");

        // Identificando a hipotenusa
        double hipotenusa = Math.max(base, Math.max(lado2, lado3));
        double cateto1, cateto2;

        // Atribuindo os catetos de acordo com a hipotenusa
        if (hipotenusa == base) {
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (hipotenusa == lado2) {
            cateto1 = base;
            cateto2 = lado3;
        } else {
            cateto1 = base;
            cateto2 = lado2;
        }

        // Verifica se o triângulo é retângulo
        if ((cateto1 * cateto1 + cateto2 * cateto2) == hipotenusa * hipotenusa) {
            System.out.println("É um triângulo retângulo");
        } else {
            System.out.println("Não é um triângulo retângulo");
        }
    }

    // Método para verificar se o triângulo é um 3 4 5
    public void TrianguloPitagorico() {
        System.out.println("/*********************************/");
        System.out.println("/*  Verificando Triângulo 3, 4, 5  */");
        System.out.println("/*********************************/");

        // Identificando novamente a hipotenusa e os catetos
        double hipotenusa = Math.max(base, Math.max(lado2, lado3));
        double cateto1, cateto2;

        if (hipotenusa == base) {
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (hipotenusa == lado2) {
            cateto1 = base;
            cateto2 = lado3;
        } else {
            cateto1 = base;
            cateto2 = lado2;
        }


        if ((cateto1 / 3 == cateto2 / 4) && (cateto1 / 3 == hipotenusa / 5)) {
            System.out.println("Este triângulo é um múltiplo de 3, 4, 5.");
        } else {
            System.out.println("Este triângulo não é um múltiplo de 3, 4, 5.");
        }
    }
}
