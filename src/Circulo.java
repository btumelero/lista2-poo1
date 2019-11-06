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
class Circulo {
  double raio, x, y;
  int z=0;
  
  double area() {
    return raio*Math.PI;
  }
  
  double comprimento() {
    return 2*raio*Math.PI;
  }
  
  double diametro() {
    return 2*raio;
  }
  
  Circulo(double raio, double x, double y) {
    this.raio = raio;
    this.x = x;
    this.y = y;
  }
}
