/**
 * 
 */
package nn;


/**
 * @author K.Ataman
 *
 */
public class Training {
	
	public double perceptron(double learningRate, double logits, double labels, double inputs){ 
		return learningRate*(labels - logits) * inputs;
	}
	public double delta(double learningRate, double logits, double labels, double inputs, 
			double derivativeActivation) {
		return perceptron(learningRate, logits, labels, inputs) * derivativeActivation;
	}
}
