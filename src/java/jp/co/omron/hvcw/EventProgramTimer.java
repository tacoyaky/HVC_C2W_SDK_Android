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
 * タイマーイベントプログラム
 */
public final class EventProgramTimer
{
	private EpTimerEvent    timerEvent;
	private EpOkaoProcess   okaoProcess;
	private EpPostProcess   postProcess;
	private EpFrPostProcess frPostProcess;


	public EventProgramTimer()
	{
		this.timerEvent    = new EpTimerEvent();
		this.okaoProcess   = new EpOkaoProcess();
		this.postProcess   = new EpPostProcess();
		this.frPostProcess = new EpFrPostProcess();
	}

	public EventProgramTimer(EpTimerEvent timerEvent, EpOkaoProcess okaoProcess,
							EpPostProcess postProcess, EpFrPostProcess frPostProcess)
	{
		this.timerEvent    = new EpTimerEvent(timerEvent.getInterval());
		this.okaoProcess   = new EpOkaoProcess(okaoProcess.getEpBody(), okaoProcess.getEpPet(),
												okaoProcess.getEpFace(), okaoProcess.getEpAge(),
												okaoProcess.getEpGender(), okaoProcess.getEpExpression(), okaoProcess.getEpRecognition());
		this.postProcess   = new EpPostProcess(postProcess.getSaveLog(), postProcess.getSaveImage(), postProcess.getEpNotification());
		this.frPostProcess = new EpFrPostProcess(frPostProcess.getSaveImage(), frPostProcess.getEpFrNotification());
	}


	public EpTimerEvent getEpTimerEvent()
	{
		return this.timerEvent;
	}

	public EpOkaoProcess getEpOkaoProcess()
	{
		return this.okaoProcess;
	}

	public EpPostProcess getEpPostProcess()
	{
		return this.postProcess;
	}

	public EpFrPostProcess getEpFrPostProcess()
	{
		return this.frPostProcess;
	}


	public void setEpTimerEvent(EpTimerEvent timerEvent)
	{
		this.timerEvent = new EpTimerEvent(timerEvent.getInterval());
	}

	public void setEpOkaoProcess(EpOkaoProcess okaoProcess)
	{
		this.okaoProcess = new EpOkaoProcess(okaoProcess.getEpBody(), okaoProcess.getEpPet(),
												okaoProcess.getEpFace(), okaoProcess.getEpAge(),
												okaoProcess.getEpGender(), okaoProcess.getEpExpression(), okaoProcess.getEpRecognition());
	}

	public void setEpPostProcess(EpPostProcess postProcess)
	{
		this.postProcess = new EpPostProcess(postProcess.getSaveLog(), postProcess.getSaveImage(), postProcess.getEpNotification());
	}

	public void setEpFrPostProcess(EpFrPostProcess frPostProcess)
	{
		this.frPostProcess = new EpFrPostProcess(frPostProcess.getSaveImage(), frPostProcess.getEpFrNotification());
	}
}
