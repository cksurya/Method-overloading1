class Methoverload1{
	void access	(double ivalue, long jvalue, int kvalue){
	System.out.println(ivalue +" Increasing Parameter list");
	}
	void access(long ivalue, double jvalue, int kvalue){
	System.out.println(ivalue+" Increasing Parameter list "+ jvalue);
		}
	void access(int ivalue, double jvalue, long kvalue){
		System.out.println(ivalue+" Increasing Parameter list "+ jvalue + " "+ kvalue);
	}

	public static void main(String[] args){
	Methoverload1 obj = new Methoverload1();
	double d =3.45; 
	obj.access(d, 97868l, 1);
	obj.access(97868l, d, 3);
	obj.access(5, d, 9633l);
}
}
