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

import java.util.Arrays;

/**
 * スケジュール情報
 */
public final class ScheduleInfo
{
	private int          nIndex;
	private int          nFrequency;
	private int[]        aBooleanWeekday;
	private ScheduleTime startTime;
	private ScheduleTime endTime;
	private int          nInterval;
	private int[]        aBooleanFunction;
	private int          nSaveLog;
	private int          nSaveImage;



	public ScheduleInfo()
	{
		this.nIndex           = 0;
		this.nFrequency       = 0;
		this.aBooleanWeekday  = new int[7];
		this.startTime        = new ScheduleTime();
		this.endTime          = new ScheduleTime();
		this.nInterval        = 0;
		this.aBooleanFunction = new int[HvcwApi.HVCW_OkaoFunction_Max];
		this.nSaveLog         = 0;
		this.nSaveImage       = 0;
	}

	public ScheduleInfo(int nIndex, int nFrequency, int[] aBooleanWeekday,
						ScheduleTime startTime, ScheduleTime endTime, int nInterval,
						int[] aBooleanFunction, int nSaveLog, int nSaveImage)
	{
		this.nIndex           = nIndex;
		this.nFrequency       = nFrequency;
		this.aBooleanWeekday  = Arrays.copyOf(aBooleanWeekday, aBooleanWeekday.length);
		this.startTime        = new ScheduleTime(startTime.getYear(),
													startTime.getMonth(),
													startTime.getDay(),
													startTime.getHour(),
													startTime.getMinute());
		this.endTime          = new ScheduleTime(endTime.getYear(),
													endTime.getMonth(),
													endTime.getDay(),
													endTime.getHour(),
													endTime.getMinute());
		this.nInterval        = nInterval;
		this.aBooleanFunction = Arrays.copyOf(aBooleanFunction, aBooleanFunction.length);
		this.nSaveLog         = nSaveLog;
		this.nSaveImage       = nSaveImage;
	}


	public int getIndex()
	{
		return this.nIndex;
	}

	public int getFrequency()
	{
		return this.nFrequency;
	}

	public int[] getBooleanWeekday()
	{
		return this.aBooleanWeekday;
	}

	public ScheduleTime getStartTime()
	{
		return this.startTime;
	}

	public ScheduleTime getEndTime()
	{
		return this.endTime;
	}

	public int getInterval()
	{
		return this.nInterval;
	}

	public int[] getBooleanFunction()
	{
		return this.aBooleanFunction;
	}

	public int getSaveLog()
	{
		return this.nSaveLog;
	}

	public int getSaveImage()
	{
		return this.nSaveImage;
	}


	public void setIndex(int nIndex)
	{
		this.nIndex = nIndex;
	}

	public void setFrequency(int nFrequency)
	{
		this.nFrequency = nFrequency;
	}

	public void setBooleanWeekday(int[] aBooleanWeekday)
	{
		this.aBooleanWeekday = Arrays.copyOf(aBooleanWeekday, aBooleanWeekday.length);
	}

	public void setStartTime(ScheduleTime startTime)
	{
		this.startTime = new ScheduleTime(startTime.getYear(),
											startTime.getMonth(),
											startTime.getDay(),
											startTime.getHour(),
											startTime.getMinute());
	}

	public void setEndTime(ScheduleTime endTime)
	{
		this.endTime = new ScheduleTime(endTime.getYear(),
										endTime.getMonth(),
										endTime.getDay(),
										endTime.getHour(),
										endTime.getMinute());
	}

	public void setInterval(int nInterval)
	{
		this.nInterval = nInterval;
	}

	public void setBooleanFunction(int[] aBooleanFunction)
	{
		this.aBooleanFunction = Arrays.copyOf(aBooleanFunction, aBooleanFunction.length);
	}

	public void setSaveLog(int nSaveLog)
	{
		this.nSaveLog = nSaveLog;
	}

	public void setSaveImage(int nSaveImage)
	{
		this.nSaveImage = nSaveImage;
	}

}
