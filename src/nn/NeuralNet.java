/**
 * 
 */
package nn;

/**
 * @author K.Ataman
 *
 */
public class NeuralNet {
	private Layer[] layerArray;
	private int numLayers;

	public Layer[] getLayerArray() {
		return layerArray;
	}

	public void setLayerArray(Layer[] layerArray) {
		this.layerArray = layerArray;
		this.setNumLayers(layerArray.length);
	}

	public int getNumLayers() {
		return numLayers;
	}

	private void setNumLayers(int numLayers) {
		this.numLayers = numLayers;
	}
	
}
