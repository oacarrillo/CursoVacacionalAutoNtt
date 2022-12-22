/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class CalculatorTests {

	@Test
	void sumarDosEnteros(){
		Calculator calculator = new Calculator();
		int resultado = calculator.add(1,2);
		assertEquals(3,resultado);
	}
	@Test
	void restarDosEnteros(){
		Calculator calculator = new Calculator();
		int resultado = calculator.minus(1,1);
		assertEquals(0,resultado);
	}

	@Test
	void multiDosEnteros(){
		Calculator calculator = new Calculator();
		int resultado = calculator.multiply(1,2);
		assertEquals(2,resultado);
	}

	@Test
	void divisionDosEnteros(){
		Calculator calculator = new Calculator();
		int resultado = calculator.division(10,2);
		assertEquals(5,resultado);
	}
}
