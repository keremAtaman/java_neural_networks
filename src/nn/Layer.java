/**
 * 
 */
package nn;

/**
 * @author K.Ataman
 *
 */
public class Layer {
	private int numNeurons;
	private int neuronSize;
	private Neuron biasNeuron;
	private Neuron[] neuronArray;
	
	public int getNumNeurons() {
		return numNeurons;
	}
	public Neuron[] getNeuronArray() {
		return neuronArray;
	}
	public void setNeuronArray(Neuron[] neuronArray){
		this.neuronArray = neuronArray;
		this.numNeurons = neuronArray.length;
		this.neuronSize = neuronArray[0].getWeightArray().length;
	}
	public int getNeuronSize() {
		return neuronSize;
	}
	public Neuron getBiasNeuron() {
		return biasNeuron;
	}
	public void setBiasNeuron(Neuron biasNeuron) {
		this.biasNeuron = biasNeuron;
	}
}
