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
 * 顔検出結果詳細
 */
public final class ResultFace
{
	private Point             ptCenter;
	private int               nSize;
	private int               nConfidence;
	private ResultDirection   direction;
	private ResultAeg         age;
	private ResultGender      gender;
	private ResultGaze        gaze;
	private ResultBlink       blink;
	private ResultExpression  expression;
	private ResultRecognition recognition;



	public ResultFace()
	{
		this.ptCenter    = new Point();
		this.nSize       = 0;
		this.nConfidence = 0;
		this.direction   = new ResultDirection();
		this.age         = new ResultAeg();
		this.gender      = new ResultGender();
		this.gaze        = new ResultGaze();
		this.blink       = new ResultBlink();
		this.expression  = new ResultExpression();
		this.recognition = new ResultRecognition();
	}

	public ResultFace(Point ptCenter,
						int nSize,
						int nConfidence,
						ResultDirection direction,
						ResultAeg age,
						ResultGender gender,
						ResultGaze gaze,
						ResultBlink blink,
						ResultExpression expression,
						ResultRecognition recognition)
	{
		this.ptCenter    = new Point(ptCenter.getX(), ptCenter.getY());
		this.nSize       = nSize;
		this.nConfidence = nConfidence;
		this.direction   = new ResultDirection(direction.getLR(), direction.getUD(), direction.getRoll());
		this.age         = new ResultAeg(age.getAge(), age.getConfidence());
		this.gender      = new ResultGender(gender.getGender(), gender.getConfidence());
		this.gaze        = new ResultGaze(gaze.getLR(), gaze.getUD());
		this.blink       = new ResultBlink(blink.getLeftEye(), blink.getRightEye());
		this.expression  = new ResultExpression(expression.getScore(), expression.getDegree());
		this.recognition = new ResultRecognition(recognition.getUID(), recognition.getScore());
	}


	public Point getCenter()
	{
		return this.ptCenter;
	}

	public int getSize()
	{
		return this.nSize;
	}

	public int getConfidence()
	{
		return this.nConfidence;
	}

	public ResultDirection getDirection()
	{
		return this.direction;
	}

	public ResultAeg getAge()
	{
		return this.age;
	}

	public ResultGender getGender()
	{
		return this.gender;
	}

	public ResultGaze getGaze()
	{
		return this.gaze;
	}

	public ResultBlink getBlink()
	{
		return this.blink;
	}

	public ResultExpression getExpression()
	{
		return this.expression;
	}

	public ResultRecognition getRecognition()
	{
		return this.recognition;
	}



	public void setCenter(Point ptCenter)
	{
		this.ptCenter = new Point(ptCenter.getX(), ptCenter.getY());
	}

	public void setSize(int nSize)
	{
		this.nSize = nSize;
	}

	public void setConfidence(int nConfidence)
	{
		this.nConfidence = nConfidence;
	}

	public void setDirection(ResultDirection direction)
	{
		this.direction = new ResultDirection(direction.getLR(), direction.getUD(), direction.getRoll());
	}

	public void setAge(ResultAeg age)
	{
		this.age = new ResultAeg(age.getAge(), age.getConfidence());
	}

	public void setGender(ResultGender gender)
	{
		this.gender = new ResultGender(gender.getGender(), gender.getConfidence());
	}

	public void setGaze(ResultGaze gaze)
	{
		this.gaze = new ResultGaze(gaze.getLR(), gaze.getUD());
	}

	public void setBlink(ResultBlink blink)
	{
		this.blink = new ResultBlink(blink.getLeftEye(), blink.getRightEye());
	}

	public void setExpression(ResultExpression expression)
	{
		this.expression = new ResultExpression(expression.getScore(), expression.getDegree());
	}

	public void setRecognition(ResultRecognition recognition)
	{
		this.recognition = new ResultRecognition(recognition.getUID(), recognition.getScore());
	}
}
