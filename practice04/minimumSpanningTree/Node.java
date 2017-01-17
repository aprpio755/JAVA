package minimumSpanningTree;

public class Node {

	int nodeIndex;
	Node parentNode=null;
	Node childNode=null;
		
	public Node(int index){
		nodeIndex = index;
	}
	void setParent(Node node){
		if(node.hasParent()){
			parentNode = node.parentNode;
		}else{
			parentNode = node;
		}
	}
	void setChild(Node node){
		childNode = node;
	}
	boolean hasParent(){
		if(parentNode==null){
			return false;
		}else{
			return true;
		}
	}
	boolean hasChild(){
		if(childNode==null){
			return false;
		}else{
			return true;
		}
	}
	boolean compareNode(Node nd){
		if(nodeIndex==nd.nodeIndex){
			return true;
		}else{
			return false;
		}
	}
}
