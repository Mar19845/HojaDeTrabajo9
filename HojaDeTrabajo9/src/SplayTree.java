/**
 * @author Laura Tamath
 * @author Juan Marroquin
 * @since 24/04/2020
 */
public class SplayTree <E> implements Tree{

	public Node root;
	private final int count = 0;
	
	@Override
	public boolean contains(String key){
		return get(key) != null; 
	/**
	revisa si el arbol contiene una llave especifica
	@param key palabra clase
	@return boolean
	**/
	}

	@Override
	public String get(String key){
		root = splay(root, key);
		int comparar = ket.compareTo(root.getKey());
		if(comparar == 0 ){
			return root.getValue().getValue().toString();
		}
		else{
			return null;
		}
		/**
		@param key
		@return el valor asociado con la clave dada, sino hay valor retorna null
		**/
	}

	@Override
	public void put(String key, String value){
		//Splay key to root
		if (root == null){
			root = new Node(key, value);
			return;
		}
		root = splay(root, key);
		int comparar = key.compareTo(root.getKey());

		//Insetar un nuevo nodo a la raiz 
		if (comparar < 0){
			Node n = Node(key, value);
			n.setLeft(root.getLeft());
			n.setRight(root);
			root.setLeft(null);
			root = n;
		}
		if (comparar > 0){
			Node n = new Node(key, value);
			n.setRight(root.getRight());
			n.setLeft(root);
			root.setRight(null);
			root = n;
		}
	}

	//Elimminar
	public void remove(String key){
		if(root == null){
			return;
		}
		root = splay(root, key);
		int comparar = key.compareTo(root.getKey());
		if (comparar == 0){
			if (root.getLeft() == null){
				root = root.getRight();
			}else{
				Node x = root.getRight();
				root = root.getLeft();
				splay(root, key);
				root.setRight(x);
			}
		}
	}


}