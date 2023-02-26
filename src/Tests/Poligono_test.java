package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import base.Poligono;

class Poligono_test {

	@Test
	void testCalcularPerimetro() {
		Poligono poligonoTest = new Poligono("Hexagono");
		poligonoTest.setLados(6);
		poligonoTest.getLados();
		poligonoTest.setLongitudLado(10.0);
		poligonoTest.getLongitudLado();
		poligonoTest.setDibujo(null);
		poligonoTest.getDibujo();
		double resultado = poligonoTest.calcularPerimetro();
		assertEquals((Double)60.0, resultado);
		
	}

}
