package Reflections;

public class CalcPgm {
	public int a,b,c;
	public CalcPgm(int a, int b, int c ){
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	public CalcPgm(){
		a=0;
		b=0;
		c=0;
	}
	
	public int addMethod(int a , int b){
	
	return a+b;
		
	}
    public int addMethod(int a , int b, int c){
    	
	return a+b+c;
	
    }
    
    public int addMethod(){
    	return a+b+c;
    }

}
