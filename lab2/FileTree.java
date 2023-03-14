
import java.util.ArrayList;


public class FileTree {

    private Node root;
    private Node current;

    public FileTree() {
        root = new Node("~");
        current = root;
    }

    public String getCurrentLocation() {
        return current.getName();
    }

    public boolean moveDown(String directory) {
        String[] files = directory.split("/");
        Node n = current;
        for (String f : files){
            ArrayList<Node> children = current.getChildren();
            boolean moved = false;
            for (Node child : children){
                if (f.equals(child.getName())){
                    current = child;
                    moved = true;
                }
            }
            if (!moved){
                current = n;
                return false;
            }
        }
        return true;
    }

    public void moveUp() {
        if (current != root) {
            current = current.getParent();
        }
    }

    public void goHome() {
        current = root;
    }

    public String getChildren() {
        String files = new String();
        ArrayList<Node> children = current.getChildren();
        for (Node c : children) {
            files += c.getName() + " ";
        }
        return files;
    }

    public boolean insert(String directory) {
        if (directory != null && !directory.equals(" ")) {
            Node newFile = new Node(directory);
            newFile.setParent(current);
            current.addChild(newFile);
            return true;
        }
        return false;
    }

    public String getPath(){
        Node n = current;
        String path = "";
        while (n.getParent() != null){
            String newDirectory = "/" + n.getName();
            path = newDirectory + path;
            n = n.getParent();
        }
        return path;
    }

    public boolean remove(String directory) {
        ArrayList<Node> temp = current.getChildren();
                for (Node child : temp){
                    if (child.getName().equals(directory)){
                        temp.remove(child);
                        return true;
                    }
                }
                return false;
    }
}
