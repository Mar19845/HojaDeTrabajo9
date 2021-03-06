/**
 * @author Laura Tamath
 * @author Juan Marroquin
 * @since 24/04/2020
 */

public interface Arbol<E>{

	public boolean contains (String key);
	/**
	pre: el valor no es nullo
	post: retorna verdader si la lista contiene un objeto del mismo valor
	@param key valor que se desea encontrar
	@return true or false
	**/

	public String get(String key);
	/**
	post: retorna el valor asociado con la llave prevista
	@param key valor que se desea encontrar
	@return  valor asociado con el Key
	**/


	public void put(String key, String val);
	/**
	post: inserta un nuevo node en el árbol
	@param key 
	@param val 
	**/
}