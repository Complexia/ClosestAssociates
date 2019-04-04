/**
 * Class implementation of edges.
 
 * @author Roman Lobanov, 2019
 */
class Edge{

	private String srcVert;
	private String tarVert;
	private int weight;

	public Edge(srcVert,tarVert,weight){
		this.srcVert = srcVert;
		this.tarVert = tarVert;
		this.weight = weight;
	}

	public String getSrcVert(){
		return srcVert;
	}

	public String getTarVert(){
		return tarVert;
	}

	public int getWeight(){
		return weight;
	}
}