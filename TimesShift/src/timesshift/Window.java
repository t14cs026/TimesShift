package timesshift;

import javax.swing.JFrame;

public class Window {
	public Window() {
		JFrame frame = new JFrame("シフト作成"); //名前
		frame.setBounds(100,100,400,400); //画面大きさ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //×ボタンで画面を閉じる
		frame.setVisible(true);//再描画
	}
}
