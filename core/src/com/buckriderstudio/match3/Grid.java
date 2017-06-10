package com.buckriderstudio.match3;

import com.badlogic.gdx.math.Vector2;

/**
 * Match3 [2017]
 * <p>
 * +-------------------------------------------------------------+
 * |Copyright Buckriderstudio, all rights reserved.              |
 * |                                                             |
 * |See license.txt for detail on the license.                   |
 * |                                                             |
 * +-------------------------------------------------------------+
 */

public class Grid {

	private boolean taken;
	private Gem gem;

	public Grid()
	{
		taken = false;
	}

	public Grid(boolean taken, Gem gem) {
		this.taken = taken;
		this.gem = gem;
	}

	public boolean gemSettled()
	{
		return taken && gem != null;
	}

	public boolean free()
	{
		return !taken;
	}
}
