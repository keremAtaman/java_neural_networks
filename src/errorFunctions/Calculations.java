package errorFunctions;

import java.io.IOException;

public class Calculations {
	/**
	 * Calculates MSE between two equally sized arrays
	 * @param logits : Calculated results
	 * @param labels : Actual results
	 * @return
	 * @throws IOException if arrays are empty
	 * @throws IOException if arrays are not equal length
	 */
	public static double MSE(double[] logits, double[] labels) throws IOException {
		if(logits.length!=labels.length) {
			throw new IOException("Length of logits and labels must match");
		}
		if(logits.length == 0 | labels.length == 0) {
			throw new IOException("Logits and labels are both empty");
		}
		int numElements = logits.length;
		double result = 0.0;
		for (int i = 0; i < numElements; i++) {
			result += (logits[i] - labels[i]) * (logits[i] - labels[i]);
		}
		return result/numElements;
	}
	/**
	 * Calculates Error (Output-logit) between two equally sized arrays
	 * @param logits : Calculated results
	 * @param labels : Actual results
	 * @return
	 * @throws IOException if arrays are empty
	 * @throws IOException if arrays are not equal length
	 */
	public static double Error(double[] logits, double[] labels) throws IOException {
		if(logits.length!=labels.length) {
			throw new IOException("Length of logits and labels must match");
		}
		if(logits.length == 0 | labels.length == 0) {
			throw new IOException("Logits and labels are both empty");
		}
		int numElements = logits.length;
		double result = 0.0;
		for (int i = 0; i < numElements; i++) {
			result += logits[i] - labels[i];
		}
		return result/numElements;
	}
	/**
	 * Calculates MSE between two elements
	 * @param logits : Calculated results
	 * @param labels : Actual results
	 * @return
	 */
	public static double MSE(double logits, double labels) {
		return (logits - labels) * (logits - labels);
	}
	/**
	 * 
	 * Calculates Error (Output-logit) between two elements
	 * @param logits : Calculated results
	 * @param labels : Actual results
	 * @return
	 */
	public static double Error(double logits, double labels) {
		return (logits - labels);
	}
}
