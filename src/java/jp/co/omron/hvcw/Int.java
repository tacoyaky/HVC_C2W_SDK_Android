/*-------------------------------------------------------------------*/
/*  Copyright(C) 2015 by OMRON Corporation                           */
/*  All Rights Reserved.                                             */
/*                                                                   */
/*   This source code is the Confidential and Proprietary Property   */
/*   of OMRON Corporation.  Any unauthorized use, reproduction or    */
/*   transfer of this software is strictly prohibited.               */
/*                                                                   */
/*-------------------------------------------------------------------*/
package jp.co.omron.hvcw;

/**
  *  Int Class : Sets/Gets IntValue.
  */
public final class Int
{
	/**
	 * Int Value
	 */
	private int value;


	/**
	 * Int Class Constructor
	 */
	public Int()
	{
		this.value = 0;
	}

	/**
	 * Int Class Parameterised Constructor.
	 * @param value   : (I) Value.
	 */
	public Int(int value)
	{
		this.value = value;
	}


	/**
	 * Get integer value.
	 * @return value.
	 */
	public int getIntValue()
	{
		return this.value;
	}

	/**
	 * Set integer value.
	 * @param value  : (I) Value.
	 */
	public void setIntValue(int value)
	{
		this.value = value;
	}
}
