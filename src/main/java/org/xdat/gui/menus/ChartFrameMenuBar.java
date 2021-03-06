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

package org.xdat.gui.menus;

import org.xdat.chart.Chart;
import org.xdat.gui.frames.ChartFrame;

import javax.swing.JMenuBar;

public abstract class ChartFrameMenuBar extends JMenuBar {

	private ChartFrame chartFrame;
	private Chart chart;
	public ChartFrameMenuBar(ChartFrame chartFrame, Chart chart) {
		this.chartFrame = chartFrame;
		this.chart = chart;
	}

	public ChartFrame getChartFrame() {
		return chartFrame;
	}

	public Chart getChart() {
		return chart;
	}

}
