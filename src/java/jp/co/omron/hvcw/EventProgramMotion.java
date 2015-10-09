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
 * 動体検知イベントプログラム
 */
public final class EventProgramMotion
{
	private EpMotionEvent   motionEvent;
	private EpOkaoProcess   okaoProcess;
	private EpPostProcess   postProcess;
	private EpFrPostProcess frPostProcess;


	public EventProgramMotion()
	{
		this.motionEvent   = new EpMotionEvent();
		this.okaoProcess   = new EpOkaoProcess();
		this.postProcess   = new EpPostProcess();
		this.frPostProcess = new EpFrPostProcess();
	}

	public EventProgramMotion(EpMotionEvent motionEvent, EpOkaoProcess okaoProcess,
							EpPostProcess postProcess, EpFrPostProcess frPostProcess)
	{
		this.motionEvent   = new EpMotionEvent(motionEvent.getRect(), motionEvent.getSensitivity(),
												motionEvent.getDuration(), motionEvent.getRatio(), motionEvent.getOffPeriod());
		this.okaoProcess   = new EpOkaoProcess(okaoProcess.getEpBody(), okaoProcess.getEpPet(),
												okaoProcess.getEpFace(), okaoProcess.getEpAge(),
												okaoProcess.getEpGender(), okaoProcess.getEpExpression(), okaoProcess.getEpRecognition());
		this.postProcess   = new EpPostProcess(postProcess.getSaveLog(), postProcess.getSaveImage(), postProcess.getEpNotification());
		this.frPostProcess = new EpFrPostProcess(frPostProcess.getSaveImage(), frPostProcess.getEpFrNotification());
	}


	public EpMotionEvent getEpMotionEvent()
	{
		return this.motionEvent;
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


	public void setEpMotionEvent(EpMotionEvent motionEvent)
	{
		this.motionEvent = new EpMotionEvent(motionEvent.getRect(), motionEvent.getSensitivity(),
												motionEvent.getDuration(), motionEvent.getRatio(), motionEvent.getOffPeriod());
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
