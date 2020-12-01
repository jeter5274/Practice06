package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성 - str이 "앱"이면, app메소드 실행, 아니면 모클래스의 execute메소드에 매개변수str을 보내서 실행 
    	if("앱".equals(str)){
    		app();
        }else{
            super.execute(str);
        }
        
    }
 
    //메소드작성 - playMusic override
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    //메소드작성 - app
    protected void app(){
        System.out.println("앱실행");
    }
    
}
