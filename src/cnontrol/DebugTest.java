package cnontrol;

import javax.swing.JFrame;

public class DebugTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new JFrame(){
			@Override
			public String toString() {
				return "haha";
			}
		});
	}
}
