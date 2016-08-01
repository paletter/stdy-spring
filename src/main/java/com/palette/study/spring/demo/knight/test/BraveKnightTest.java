package com.palette.study.spring.demo.knight.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.palette.study.spring.demo.knight.role.BraveKnight;
import com.palette.study.spring.demo.knight.role.Quest;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		
		Quest mockQuest = mock(Quest.class);
		
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		
		verify(mockQuest, times(1)).embark();
	}
	
}
