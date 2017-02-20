package test;

import java.net.URL;

public class TestCode {
	public static void main(String[] args){
		URL u = TestCode.class.getResource("/resource/FXDB.fxml");

		System.out.println(u);
	}
}
