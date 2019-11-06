/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author bruno.191196
 */
class Folha {
  double altura, largura, alturaFolha=30, larguraFolha=21;
  int numeroRetangulo=0, numeroTriangulo=0, numeroCirculo=0, numeroTotal=0;
  Retangulo[] listaRetangulo;
  Triangulo[] listaTriangulo;
  Circulo[] listaCirculo;
  
  void adicionarRetangulo(Retangulo ret) {
    listaRetangulo[numeroRetangulo] = ret;
    listaRetangulo[numeroRetangulo].z=numeroTotal;
    if (listaRetangulo[numeroRetangulo].largura>larguraFolha || listaRetangulo[numeroRetangulo].altura>alturaFolha) {
      System.out.println("O retângulo não cabe na folha!");
    } else {
      if (listaRetangulo[numeroRetangulo].largura>larguraFolha-listaRetangulo[numeroRetangulo].x || listaRetangulo[numeroRetangulo].altura>listaRetangulo[numeroRetangulo].y) {
        System.out.println("O retângulo está fora da folha");
      } else {
        System.out.println("O retângulo está dentro da folha");
      }
    }

    numeroRetangulo++;
    numeroTotal++;
  }
  
  void adicionarTriangulo(Triangulo tri) {
    listaTriangulo[numeroTriangulo] = tri;
    listaTriangulo[numeroTriangulo].z = numeroTotal;
    if (listaTriangulo[numeroTriangulo].largura>larguraFolha || listaTriangulo[numeroTriangulo].altura>alturaFolha) {
      System.out.println("O triângulo não cabe na folha!");
    } else {
      if (listaTriangulo[numeroTriangulo].largura>larguraFolha-listaTriangulo[numeroTriangulo].x || listaTriangulo[numeroTriangulo].altura>listaTriangulo[numeroTriangulo].y) {
        System.out.println("O triângulo está fora da folha");
      } else {
        System.out.println("O triângulo está dentro da folha");
      }
    }
    numeroTriangulo++;
    numeroTotal++;
    }
  
  void adicionarCirculo(Circulo circ) {
    listaCirculo[numeroCirculo] = circ;
    listaCirculo[numeroCirculo].z = numeroTotal;
    if (listaCirculo[numeroCirculo].diametro()>larguraFolha || listaCirculo[numeroCirculo].diametro()>alturaFolha) {
      System.out.println("O círculo não cabe na folha!");
    } else if (listaCirculo[numeroCirculo].x<listaCirculo[numeroCirculo].raio || listaCirculo[numeroCirculo].y<listaCirculo[numeroCirculo].raio) {
        System.out.println("O círculo está fora da folha");
      } else if (listaCirculo[numeroCirculo].raio>larguraFolha-listaCirculo[numeroCirculo].x || listaCirculo[numeroCirculo].raio>alturaFolha-listaCirculo[numeroCirculo].y) {
          System.out.println("O círculo está fora da folha");
        } else {
          System.out.println("O círculo está dentro da folha");
        } 
    numeroCirculo++;
    numeroTotal++;
  }
  
  void listarFormas() {
    System.out.println("Há " + numeroTotal + " de formas nesta lista, sendo que:");
    System.out.print(numeroRetangulo + " são retângulos, ");
    System.out.print(numeroTriangulo + " triângulos e ");
    System.out.println(numeroCirculo + " círculos");
    
    for (int i=0; i<numeroRetangulo; i++) {
      System.out.println("\nInformações do retângulo " + i + ":");
      System.out.println("Largura: " + listaRetangulo[i].largura + "\nAltura: " + listaRetangulo[i].altura);
      System.out.println("Perímetro: " + listaRetangulo[i].perimetro() + "\nÁrea: " + listaRetangulo[i].area() + "\nPosição na folha: " + listaRetangulo[i].z);
    }
    for (int i=0; i<numeroTriangulo; i++) {
      System.out.println("\nInformações do triângulo " + i + ":");
      System.out.println("Largura: " + listaTriangulo[i].largura + "\nAltura: " + listaTriangulo[i].altura + "\nHipotenusa: " + listaTriangulo[i].hipotenusa());
      System.out.println("Perímetro: " + listaTriangulo[i].perimetro() + "\nÁrea: " + listaTriangulo[i].area() + "\nPosição na folha: " + listaTriangulo[i].z);
    }
    for (int i=0; i<numeroCirculo; i++) {
      System.out.println("\nInformações do círculo " + i + ":");
      System.out.println("Diâmetro: " + listaCirculo[i].diametro() + "\nRaio: " + listaCirculo[i].raio);
      System.out.println("Comprimento: " + listaCirculo[i].comprimento() + "\nÁrea: " + listaCirculo[i].area() + "\nPosição na folha: " + listaCirculo[i].z);
    }
  }
  
  void listarOrdenado() {
    System.out.println("Há " + numeroTotal + " de formas nesta lista, sendo que:");
    System.out.print(numeroRetangulo + " são retângulos, ");
    System.out.print(numeroTriangulo + " triângulos e ");
    System.out.println(numeroCirculo + " círculos");
    for (int a=0; a<numeroTotal; a++){
      for (int b=0; b<numeroRetangulo; b++) {
        if (a==listaRetangulo[b].z) {
          System.out.println("\nInformações do retângulo " + b + ":");
          System.out.println("Largura: " + listaRetangulo[b].largura + "\nAltura: " + listaRetangulo[b].altura);
          System.out.println("Perímetro: " + listaRetangulo[b].perimetro() + "\nÁrea: " + listaRetangulo[b].area() + "\nPosição na folha: " + listaRetangulo[b].z);
        }
      }
      for (int b=0; b<numeroTriangulo; b++) {
        if (a==listaTriangulo[b].z) {
          System.out.println("\nInformações do triângulo " + b + ":");
          System.out.println("Largura: " + listaTriangulo[b].largura + "\nAltura: " + listaTriangulo[b].altura + "\nHipotenusa: " + listaTriangulo[b].hipotenusa());
          System.out.println("Perímetro: " + listaTriangulo[b].perimetro() + "\nÁrea: " + listaTriangulo[b].area() + "\nPosição na folha: " + listaTriangulo[b].z);
        }
      }
      for (int b=0; b<numeroCirculo; b++) {
        if (a==listaCirculo[b].z) {
          System.out.println("\nInformações do círculo " + b + ":");
          System.out.println("Diâmetro: " + listaCirculo[b].diametro() + "\nRaio: " + listaCirculo[b].raio);
          System.out.println("Comprimento: " + listaCirculo[b].comprimento() + "\nÁrea: " + listaCirculo[b].area() + "\nPosição na folha: " + listaCirculo[b].z);
        }
      }
    }
  }
  
  Folha() {
    listaRetangulo = new Retangulo[10];
    listaTriangulo = new Triangulo[10];
    listaCirculo = new Circulo[10];
  }
}
