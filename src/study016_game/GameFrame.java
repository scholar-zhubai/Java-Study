package study016_game;

import javax.swing.*;

//这个界面就是游戏的主界面
public class GameFrame extends JFrame {
    public GameFrame(){
        //设置界面宽高
        initJFrame();

        //初始化菜单
        initJMenuBar();
    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建菜单栏的下拉条
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");


        JMenuItem accountItem = new JMenuItem("公众号");

        //将下拉条与对应的菜单选项对应
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将菜单栏的两个选项添加到菜单里面
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单选项
        this.setJMenuBar(jMenuBar);

        //设置界面可见性，写在最后
        this.setVisible(true);
    }

    private void initJFrame() {
        this.setSize(603,680);

        //设置拼图
        this.setTitle("拼图 V1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
