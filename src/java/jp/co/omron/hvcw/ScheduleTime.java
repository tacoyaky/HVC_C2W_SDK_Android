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
 * スケジュール時間
 */
public final class ScheduleTime
{
	private int nYear;
	private int nMonth;
	private int nDay;
	private int nHour;
	private int nMinute;


	public ScheduleTime()
	{
		this.nYear   = 0;
		this.nMonth  = 0;
		this.nDay    = 0;
		this.nHour   = 0;
		this.nMinute = 0;
	}

	public ScheduleTime(int nYear, int nMonth, int nDay, int nHour, int nMinute)
	{
		this.nYear   = nYear;
		this.nMonth  = nMonth;
		this.nDay    = nDay;
		this.nHour   = nHour;
		this.nMinute = nMinute;
	}


	public int getYear()
	{
		return this.nYear;
	}

	public int getMonth()
	{
		return this.nMonth;
	}

	public int getDay()
	{
		return this.nDay;
	}

	public int getHour()
	{
		return this.nHour;
	}

	public int getMinute()
	{
		return this.nMinute;
	}


	public void setYear(int nYear)
	{
		this.nYear = nYear;
	}

	public void setMonth(int nMonth)
	{
		this.nMonth = nMonth;
	}

	public void setDay(int nDay)
	{
		this.nDay = nDay;
	}

	public void setHour(int nHour)
	{
		this.nHour = nHour;
	}

	public void setMinute(int nMinute)
	{
		this.nMinute = nMinute;
	}
}
