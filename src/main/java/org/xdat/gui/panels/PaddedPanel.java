/*
 *  Copyright 2014, Enguerrand de Rochefort
 * 
 * This file is part of xdat.
 *
 * xdat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * xdat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with xdat.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.xdat.gui.panels;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PaddedPanel extends JPanel {

	public PaddedPanel(int padding) {
		this(padding, padding);
	}

	public PaddedPanel(int vPadding, int hPadding) {
		this(vPadding, hPadding, vPadding, hPadding);
	}

	public PaddedPanel(int paddingTop, int paddingRight, int paddingBottom, int paddingLeft) {
		super();
		EmptyBorder emptyBorder = (new EmptyBorder(paddingTop, paddingLeft, paddingBottom, paddingRight));
		this.setBorder(emptyBorder);
	}
}