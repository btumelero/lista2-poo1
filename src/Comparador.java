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
class Comparador {
  
  Comparador() {
    tris = new Triangulo[10];
  }
  
  boolean maiorAreaRT(Retangulo ret, Triangulo tri) {
    if (ret.area() > tri.area()) {
      return true;
    } else {
      return false;
    }
  }
  boolean maiorPerimetroRT(Retangulo ret, Triangulo tri) {
    if (ret.perimetro() > tri.perimetro()) {
      return true;
    } else {
      return false;
    }
  }
  
  boolean maiorAreaRC(Retangulo ret, Circulo circ) {
    if (ret.area() > circ.area()) {
      return true;
    } else {
      return false;
    }
  }
  boolean maiorPerimetroRC(Retangulo ret, Circulo circ) {
    if (ret.perimetro() > circ.comprimento()) {
      return true;
    } else {
      return false;
    }
  }
  
  boolean maiorAreaTC(Triangulo tri, Circulo circ) {
    if (tri.area() > circ.area()) {
      return true;
    } else {
      return false;
    }
  }
  boolean maiorPerimetroTC(Triangulo tri, Circulo circ) {
    if (tri.perimetro() > circ.comprimento()) {
      return true;
    } else {
      return false;
    }
  }
  
  Triangulo[] tris;
}