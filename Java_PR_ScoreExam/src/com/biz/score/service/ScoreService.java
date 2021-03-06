package com.biz.score.service;

import com.biz.score.domain.ScoreVO;

public interface ScoreService {
	public void load();
	public boolean inputScore();
	public void calcSum();
	public void calcAvg();
	public void saveScoreVO(ScoreVO scoreVO);
	public void getList();
	public ScoreVO getScore(String strNum);
	public void writeList();
}
