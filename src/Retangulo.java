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
class Retangulo {
  double largura, altura, x, y;
  int z=0;
  
  double perimetro() {
    return largura*2+altura*2;
  }
  double area() {
    return largura*altura;
  }
  
  Retangulo(double largura, double altura, double x, double y) {
    this.largura = largura;
    this.altura = altura;
    this.x = x;
    this.y = y;
  }
}
