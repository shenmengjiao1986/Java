package 事件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//模式二：外部类实现事件处理
public class OutClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("第五行被点击");
	}
}
