/*********************************************************************************
*File: Main.java
*Author: Onur Ozuduru
*   e-mail: onur.ozuduru { at } gmail.com
*   github: github.com/onurozuduru
*   twitter: twitter.com/OnurOzuduru
*
*License: The MIT License (MIT)
*
*   Copyright (c) 2014 Onur Ozuduru
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*   of this software and associated documentation files (the "Software"), to deal
*   in the Software without restriction, including without limitation the rights
*   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*   copies of the Software, and to permit persons to whom the Software is
*   furnished to do so, subject to the following conditions:
*  
*   The above copyright notice and this permission notice shall be included in all
*   copies or substantial portions of the Software.
*  
*   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*   SOFTWARE.
*********************************************************************************/

package com.ozuduru.shooterGame;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a new Game object and call startGame function.
		// Catch possible exceptions and show an error message to the user.
		try {
			new Game().startGame();
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(null,
					"We are sorry about that!\nError: " + e.getMessage(),
					"Opps!! Something went wrong!", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"It seems that there is a problem on your file system!\nError: " + e.getMessage(),
					"Opps!! Something went wrong!", JOptionPane.ERROR_MESSAGE);
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null,
					"We are sorry about that!\nError: " + e.getMessage(),
					"Opps!! Something went wrong!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
