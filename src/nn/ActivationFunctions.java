package nn;
/**
 * List of activation functions and their derivatives.
 * @author K.Ataman
 */
public class ActivationFunctions {
	
	public static double step(double logit) {
		if (logit >= 0) {
			return 1.0;
		}else {
			return 0.0;
		}
	}
	
	public static double linear(double logit) {
		return logit;
	}
	
	public static double sigmoid(double logit){
		return 1.0 / (1.0 + Math.exp(-logit));
	}
	
	public static double tanh(double logit) {
		return Math.tanh(logit);
	}
	
	public static class  derivatives{
		public static double  linearDerivative(double logit) {
			return 1.0;
		}
		public static double sigmoidDerivative(double logit) {
			return logit * (1.0 - logit);
		}
		public static double tanhDerivative(double logit) {
			return (1.0 / Math.pow(Math.cosh(logit), 2.0));
		}
	}
}
