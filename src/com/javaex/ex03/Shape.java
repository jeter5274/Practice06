package com.javaex.ex03;

public class Shape {
	
	//private String fillColor, lineColor; Triangle클래스에서 바로 호출하려고 하므로, 접근제한자 수정
	protected String fillColor, lineColor;

	//Triangle클래스 생성자에서 Shape클래스 기본생성자를 생략해서 호출 중이라 추가 
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}

