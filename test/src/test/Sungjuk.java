package test;

public class Sungjuk{

	public static void main(String[] args) {

		String hakName[] = {"말자", "영자", "순자", "공자", "맹자"};
		int hakGUK[] = { 40, 74, 90, 60, 83};
		int hakENG[] = { 35, 72, 95, 65, 82};
		int hakMAT[] = { 50, 70, 92, 62, 81};
		int hakSUM[] = new int[5];
		int hakRank[] = new int[5];
		double hakAVG[] = new double[5];
		int hakGRADE;
		char mygrade[] = new char[5];
		
		headTitle();


		
		
		System.out.println("                          성    적    표");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0; i<hakGUK.length; i++) { // 번호 구하는 for문
			
			
			
			hakSUM[i] = hakGUK[i] + hakENG[i] +hakMAT[i];
			hakAVG[i] = (double)hakSUM[i]/3;
			
			hakGRADE = (int)hakAVG[i]/10;
			
			switch(hakGRADE) {
			case 10:			
			case 9:
				mygrade[i] = 'A';
				break;
			case 8:
				mygrade[i] = 'B';
				break;
			case 7:
				mygrade[i] = 'D';
				break;
			case 6:
				mygrade[i] = 'E';
				break;
			default :
				mygrade[i] = 'F';
			}
						
		}
		
		for(int i=0; i<hakGUK.length; i++) {
			hakRank[i] = 1;
			for(int j=0; j<hakGUK.length; j++) {
				if(hakSUM[i]<hakSUM[j])
					hakRank[i] +=1;
			}
		}
		
		for(int i=0; i<hakGUK.length; i++) {
			System.out.print(i+1 +"\t"+ hakName[i] +"\t"+ hakGUK[i] +"\t"+ hakENG[i] +"\t"+ hakMAT[i]+ 
					"\t"+hakSUM[i] + "\t");
			System.out.printf("%.1f", hakAVG[i]);
			System.out.println("\t" + mygrade[i] + "\t" + hakRank[i]);
			System.out.println();
		}
		
						
	}

}

void headTitle() {
	
}

}
