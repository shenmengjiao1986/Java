import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
public class MyJTreeDemo extends JFrame {
	private JTree tree;
	private DefaultTreeModel treemodel;
	MyJTreeDemo(){
		super("JTree实例");
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("职员管理");
		treemodel = new DefaultTreeModel(rootNode);
		tree = new JTree(treemodel);
		tree.setEditable(true);
        tree.getSelectionModel().setSelectionMode(
                TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setShowsRootHandles(true);
		
		//总经理
		DefaultMutableTreeNode node0 = new DefaultMutableTreeNode("总经理");
		//软件部
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("软件部");
        node1.add(new DefaultMutableTreeNode(new User("小花")));
        node1.add(new DefaultMutableTreeNode(new User("小虎")));
        node1.add(new DefaultMutableTreeNode(new User("小龙")));
		//销售部
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("销售部");
        node2.add(new DefaultMutableTreeNode(new User("小叶")));
        node2.add(new DefaultMutableTreeNode(new User("小雯")));
        node2.add(new DefaultMutableTreeNode(new User("小夏")));
        
        rootNode.add(node0);
        rootNode.add(node1);
        rootNode.add(node2);
        
        Container contentPane = getContentPane();
        contentPane.add(tree);
        
        tree.addTreeSelectionListener(new TreeSelectionListener() {
        	 
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree
                        .getLastSelectedPathComponent();
 
                if (node == null)
                    return;
 
                Object object = node.getUserObject();
                if (node.isLeaf()) {
                    User user = (User) object;
                    System.out.println("你选择了：" + user.toString());
                }
 
            }
        });
        
        treemodel.addTreeModelListener(new TreeModelListener(){
        	public void treeNodesChanged(TreeModelEvent e){
        		
        	}
        	public void treeNodesInserted(TreeModelEvent e){
        		
        	}
        	public void treeNodesRemoved(TreeModelEvent e){
        		
        	}
        	public void treeStructureChanged(TreeModelEvent e){
        		
        	}
        });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJTreeDemo app = new MyJTreeDemo();
		app.setSize(300,300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}

class User {
    private String name;
 
    public User(String n) {
        name = n;
    }
 
    // 重点在toString，节点的显示文本就是toString
    public String toString() {
        return name;
    }
}
