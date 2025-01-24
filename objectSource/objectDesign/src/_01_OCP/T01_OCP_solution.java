package _01_OCP;

public class T01_OCP_solution {

	public static void main(String[] args) {
		
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInter(new Wav());
		System.out.print("wav 파일 재생 : ");
		sp.Play();
		
		sp.setPlayInter(new Mp3());
		System.out.print("wav 파일 재생 : ");
		sp.Play();
		
		sp.setPlayInter(new Ogg());
		System.out.print("wav 파일 재생 : ");
		sp.Play();
		
	}

}
