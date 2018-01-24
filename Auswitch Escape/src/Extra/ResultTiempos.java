package Extra;

public class ResultTiempos {
	
	public static int tiempoj1 = 0;
	public static int tiempoj2 = 0;
	public static int tiempoj3 = 0;
	
	
	
	public int getTiempoj1() {
		
		return tiempoj1;
	}
	public void setTiempoj1(int tiempoj1) {
		ResultTiempos.tiempoj1 += tiempoj1;
	}
	public int getTiempoj2() {
		return tiempoj2;
	}
	public void setTiempoj2(int tiempoj2) {
		ResultTiempos.tiempoj2 += tiempoj2;
	}
	public int getTiempoj3() {
		return tiempoj3;
	}
	public void setTiempoj3(int tiempoj3) {
		ResultTiempos.tiempoj3 += tiempoj3;
	}

	public static int totaltiempo (){
		return tiempoj1 + tiempoj2 + tiempoj3;
	}
	
	
}
